package com.studentManagement.controller.semester;


import com.studentManagement.entity.Student;
import com.studentManagement.entity.semester.eighth;
import com.studentManagement.repository.semester.EighthSemesterInterface;
import com.studentManagement.service.excelService.EighthExcelFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/excel/eighth")
public class EighthSemesterController {
    @Autowired
    EighthSemesterInterface repo;

    @GetMapping("/get")
    public List<Student> method1()
    {
        return repo.findAllUsersWithAddresseight();
    }

//    private final EighthExcelFileService excelFileService;
//
//    public EighthSemesterController(EighthExcelFileService excelFileService) {
//        this.excelFileService = excelFileService;
//    }
//
//    @GetMapping("/uploadForm")
//    public String showUploadForm() {
//        return "upload";
//    }
//
//    @PostMapping("/upload")
//    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
//        try {
//            List<eighth> entities = excelFileService.processExcelFile(file);
//            // You can do further processing or validation here
//
//            model.addAttribute("entities", entities);
//            model.addAttribute("message", "File uploaded and data saved successfully!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            model.addAttribute("error", "Error processing the file.");
//        }
//
//        return "uploadResult";
//    }
}





