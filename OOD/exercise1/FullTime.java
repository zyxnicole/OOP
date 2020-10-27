package exercise1;


import java.util.ArrayList;
import java.util.List;

/**
 * Program: INFO5100
 * Description: students
 * CreatedBy: Nicole_Z
 * CreatDate: 10/16/2020
 **/

public class FullTime extends Student{
    private double examScore; // index start from 1

    public FullTime(String firstName, String lastName, int studentId) {
        super(firstName, lastName, studentId);
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public double getExamScore() {
        return examScore;
    }
}
