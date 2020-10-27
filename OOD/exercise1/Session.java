package exercise1;

import java.util.*;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/16/2020
 **/

public class Session {
    Student[] students;

    Session(Student[] students) {
        this.students = students;
    }

    public void getAverageQuizScore() {
        System.out.println("\nAverage Quiz Score: ");
        for (int i = 0; i < students.length; i++) {
            double totalScore = 0;
            for (double s : students[i].getQuizScore()) {
                totalScore += s;
            }
            double ave = totalScore / 15;
            System.out.printf(students[i].getFistName() + ", " + students[i].getLastName() + ", " + "Average score: %.2f \n",ave);
        }
    }

    public void getQuizRanks() {
        System.out.println("\nAverage Quiz Score Ranking List: ");
        Student[] studentsForRank = Arrays.copyOf(students, students.length);
        Arrays.sort(studentsForRank, Comparator.comparing(Student::getAverageScore).thenComparing(Student::getFistName));
        for (Student s : studentsForRank) {
            System.out.printf(s.getFistName() + ", " + s.getLastName() + ", " + "Average score: %.2f \n",s.getAverageScore());
        }
    }

    public void getPartTimeStudents() {
        System.out.println("\nPart-Time Student List: ");
        for (Student s : students) {
            if (s.getClass().isAssignableFrom(PartTime.class)) {
                System.out.println("First Name: " + s.getFistName() + ", Last Name: " + s.getLastName() + ", Id: " + s.getId());
            }
        }
    }

    public void getFullTimeExamScore() {

        System.out.println("\nFull-Time Students Exam Score List: ");
        for (Student s : students) {
            if (s.getClass().isAssignableFrom(FullTime.class)) {
                FullTime fs = (FullTime) s;
                System.out.println("Id: " + s.getId() + ", Exam Score: " +  fs.getExamScore());
            }
        }
    }

    public static void main(String[] args) {
        // Creating and initializing full-time and part-time students
        FullTime s1 = new FullTime("f1","l1",1);
        FullTime s2 = new FullTime("f2","l2",2);
        FullTime s3 = new FullTime("f3","l3",3);
        FullTime s4 = new FullTime("f4","l4",4);
        FullTime s5 = new FullTime("f5","l5",5);
        FullTime s6 = new FullTime("f6","l6",6);
        FullTime s7 = new FullTime("f7","l7",7);
        FullTime s8 = new FullTime("f8","l8",8);
        FullTime s9 = new FullTime("f9","l9",9);
        FullTime s10 = new FullTime("f10","l10",10);
        FullTime s11 = new FullTime("f11","l11",11);
        FullTime s12 = new FullTime("f12","l12",12);
        FullTime s13 = new FullTime("f13","l13",13);
        FullTime s14 = new FullTime("f14","l14",14);
        FullTime s15 = new FullTime("f15","l15",15);
        PartTime s16 = new PartTime("f16","l16",16);
        PartTime s17 = new PartTime("f17","l17",17);
        PartTime s18 = new PartTime("f18","l18",18);
        PartTime s19 = new PartTime("f19","l19",19);
        PartTime s20 = new PartTime("f20","l20",20);

        // Randomly assign quiz Score for each student
        for (int i = 1; i < 16; i++) {
            s1.setEachQuizScore(i,Math.random() * 100 + 1);
            s2.setEachQuizScore(i,Math.random() * 100 + 1);
            s3.setEachQuizScore(i,Math.random() * 100 + 1);
            s4.setEachQuizScore(i,Math.random() * 100 + 1);
            s5.setEachQuizScore(i,Math.random() * 100 + 1);
            s6.setEachQuizScore(i,Math.random() * 100 + 1);
            s7.setEachQuizScore(i,Math.random() * 100 + 1);
            s8.setEachQuizScore(i,Math.random() * 100 + 1);
            s9.setEachQuizScore(i,Math.random() * 100 + 1);
            s10.setEachQuizScore(i,Math.random() * 100 + 1);
            s11.setEachQuizScore(i,Math.random() * 100 + 1);
            s12.setEachQuizScore(i,Math.random() * 100 + 1);
            s13.setEachQuizScore(i,Math.random() * 100 + 1);
            s14.setEachQuizScore(i,Math.random() * 100 + 1);
            s15.setEachQuizScore(i,Math.random() * 100 + 1);
            s16.setEachQuizScore(i,Math.random() * 100 + 1);
            s17.setEachQuizScore(i,Math.random() * 100 + 1);
            s18.setEachQuizScore(i,Math.random() * 100 + 1);
            s19.setEachQuizScore(i,Math.random() * 100 + 1);
            s20.setEachQuizScore(i,Math.random() * 100 + 1);
        }

        // Assign exam scores for full-time Students
        s1.setExamScore(100);
        s2.setExamScore(80.5);
        s3.setExamScore(90);
        s4.setExamScore(70.5);
        s5.setExamScore(22.4);
        s6.setExamScore(80);
        s7.setExamScore(50);
        s8.setExamScore(33.6);
        s9.setExamScore(79);
        s10.setExamScore(84);
        s11.setExamScore(63);
        s12.setExamScore(100);
        s13.setExamScore(77.8);
        s14.setExamScore(59.7);
        s15.setExamScore(93);

        // Declaration and initializing a Student array
        Student[] students = new Student[] {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18,s19, s20};

        // Declaration and creating a session
        Session session = new Session(students);

        session.getAverageQuizScore(); // Get an average quiz score of student 1

        session.getQuizRanks(); // Print the list of quiz scores in ascending order

        session.getPartTimeStudents(); // Print all of part-time students name and id

        session.getFullTimeExamScore(); // Print exam scores of full-time students

    }
}
