package exercise1;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/16/2020
 **/

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private double[] quizScore; // Number of times from 1 to 15
    private double averageScore;

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = studentId;
        quizScore = new double[15];
    }
    public void setEachQuizScore(int index, double eachScore) {
        quizScore[index-1] = eachScore;
    }
    public void setAllQuizScore(double[] allQuizScore) {
        this.quizScore = allQuizScore;
    }
    public double[] getQuizScore() {
        return quizScore;
    }
    public String getFistName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }

    public double getAverageScore() {
        if (averageScore != 0) {
            return averageScore;
        }
        double totalScore = 0;
        for (double score : quizScore) {
            totalScore += score;
        }
        averageScore = totalScore / 15;
        return averageScore;
    }

}
