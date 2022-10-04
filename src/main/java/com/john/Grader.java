package com.john;

public class Grader {

    // the test is in the test folder

    public char determineLetterGrade(int gradeNumber){
        if(gradeNumber < 0){
            throw new IllegalArgumentException("gradeNumber cannot under 0");
        }
        else if(gradeNumber < 60){
            return 'F';
        }
        else if(gradeNumber < 70){
            return 'D';
        }
        else if(gradeNumber < 80){
            return 'C';
        }
        else if(gradeNumber < 90){
            return 'B';
        }
        else{
            return 'A';
        }
    }
}
