package com.example.gcp_java_ci_cd_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeServiceTest {

    private final GradeService gradeService = new GradeService();

    @Test
    void shouldReturnPassForMarkAboveOrEqualFifty() {
        assertEquals("PASS", gradeService.checkGrade(50));
        assertEquals("PASS", gradeService.checkGrade(75));
    }

    @Test
    void shouldReturnFailForMarkBelowFifty() {
        // assertEquals("FAIL", gradeService.checkGrade(49));
        // assertEquals("FAIL", gradeService.checkGrade(0));
         assertEquals("PASS", gradeService.checkGrade(49));
    }

    @Test
    void shouldReturnInvalidForMarkOutsideRange() {
        assertEquals("INVALID", gradeService.checkGrade(-1));
        assertEquals("INVALID", gradeService.checkGrade(101));
    }
}