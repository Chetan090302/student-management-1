package com.studentManagement.controller.semester;

import com.studentManagement.entity.semester.fifth;
import com.studentManagement.service.excelService.FifthExcelFileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/excel/fifth")
public class FifthSemesterController {

    private final FifthExcelFileService excelFileService;

    public FifthSemesterController(FifthExcelFileService excelFileService) {
        this.excelFileService = excelFileService;
    }

    @GetMapping("/uploadForm")
    public String showUploadForm() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        try {
            List<fifth> entities = excelFileService.processExcelFile(file);
            // You can do further processing or validation here

            model.addAttribute("entities", entities);
            model.addAttribute("message", "File uploaded and data saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("error", "Error processing the file.");
        }

        return "uploadResult";
    }
}



