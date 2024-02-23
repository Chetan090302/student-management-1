package com.studentManagement.service.excelService.impl;


import com.studentManagement.entity.semester.second;
import com.studentManagement.repository.semester.SecondSemesterInterface;
import com.studentManagement.service.excelService.SecondExcelFileService;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class SecondExcelFileServiceImpl implements SecondExcelFileService {

    private final SecondSemesterInterface secondRepository;

    @Autowired
    public SecondExcelFileServiceImpl(SecondSemesterInterface secondRepository) {
        this.secondRepository = secondRepository;
    }

    @Override
    public List<second> processExcelFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("The supplied file is empty.");
        }

        List<second> entities = new ArrayList<>();

        try (Workbook workbook = WorkbookFactory.create(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through rows and populate entities
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                second entity = new second();

                // Populate entity fields from row cells
                populateEntityFromRow(entity, row);

                entities.add(entity);
            }

            // Save entities to the database within a transaction
            secondRepository.saveAll(entities);

            return entities;
        }
        catch (Exception e) {
            // Log the exception details
            e.printStackTrace();

            // Rethrow or return an appropriate response
            throw new IOException("Error processing the Excel file.", e);
        }
    }

    private void populateEntityFromRow(second entity, Row row) {
        entity.setStudentId(String.valueOf(getStringCellValue(row.getCell(0))));
        entity.setSubjectId(String.valueOf(getStringCellValue(row.getCell(1))));
        entity.setInternals(String.valueOf(getStringCellValue(row.getCell(2))));
        entity.setExternals(String.valueOf(getStringCellValue(row.getCell(3))));
        entity.setRegulation(String.valueOf(getStringCellValue(row.getCell(4))));
        entity.setAttendance(String.valueOf(getStringCellValue(row.getCell(5))));
    }

    private String getStringCellValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                // Handle numeric values appropriately (e.g., convert to string)
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                // Handle formula cells if needed
                return cell.getCellFormula();
        }
        return null;
    }
}