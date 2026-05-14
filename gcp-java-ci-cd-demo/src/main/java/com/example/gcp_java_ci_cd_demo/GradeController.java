package com.example.gcp_java_ci_cd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GradeController {

    private final GradeService gradeService = new GradeService();

    @GetMapping("/")
    public String home() {
        return "GCP Java CI/CD Demo is running";
    }

    @GetMapping("/grade")
    public String checkGrade(@RequestParam int mark) {
        return gradeService.checkGrade(mark);
    }

    //Test Comment
}