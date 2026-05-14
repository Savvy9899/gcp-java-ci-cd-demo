package com.example.gcp_java_ci_cd_demo;

public class GradeService {

    public String checkGrade(int mark) {
        if (mark < 0 || mark > 100) {
            return "INVALID";
        }

        if (mark >= 50) {
            return "PASS";
        }

        return "FAIL";
    }
}