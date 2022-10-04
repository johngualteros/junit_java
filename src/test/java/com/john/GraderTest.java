package com.john;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD(){
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }
    @Test
    void seventyNineShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void eightyNineShouldReturnB(){
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }
    @Test
    void ninetyOneShouldReturnA(){
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(91));
    }
    @Test
    void underZeroShouldReturnThrowExceptionArgument(){
        final Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    grader.determineLetterGrade(-1);
                });
    }
}