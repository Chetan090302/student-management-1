package com.studentManagement.controller.semester;

import com.studentManagement.entity.Student;
import com.studentManagement.entity.semester.fourth;
import com.studentManagement.repository.semester.FourthSemesterInterface;
import com.studentManagement.service.excelService.FourthExcelFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping
public class FourthSemesterController {

    @Autowired
    FourthSemesterInterface repo1;
    @GetMapping("/chetan")
    public List<com.studentManagement.entity.Student> method1()
    {
        return repo1.findAllUsersWithAddressfourth();
    }

//    private final FourthExcelFileService excelFileService;
//
//    public FourthSemesterController(FourthExcelFileService excelFileService) {
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
//            List<fourth> entities = excelFileService.processExcelFile(file);
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



