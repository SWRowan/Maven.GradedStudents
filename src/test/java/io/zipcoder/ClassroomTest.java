package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

public class ClassroomTest {


    @Test
    public void getStudentsTest(){
        //Given
        Classroom classroom = new Classroom();
        int expected = 30;
        //when
        int actual = classroom.getStudents().length;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsTest2(){
        //Given
        int maxNum = 10;
        Classroom classroom = new Classroom(10);

        //when
        int actual = classroom.getStudents().length;
        //then
        Assert.assertEquals(maxNum, actual);
    }

    @Test
    public void getAverageExamTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("Sean", "Rowan", s1Scores);
        Student s2 = new Student("Cara", "Eppes", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudentTest(){
        //Given
        int maxNum = 1;
        Classroom classroom = new Classroom(maxNum);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Sean", "Rowan", examScores);
        //When
        classroom.addStudent(student);
        String output = Arrays.toString(classroom.getStudents());
        //Then
        System.out.println(output);

    }

    @Test
    public void addStudentTest2(){
        //Given
        int maxNum = 2;
        Classroom classroom = new Classroom(maxNum);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student s1 = new Student("Sean", "Rowan", examScores);
        Student s2 = new Student("Chazz", "Wilks", examScores);
        //When
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        String output = Arrays.toString(classroom.getStudents());
        //Then
        System.out.println(output);
    }

    @Test
    public void removeStudentTest(){
        //Given
        Double[] s1Scores = { 100.0, 150.0, 250.0, 75.0 };
        Double[] s2Scores = {200.0, 75.0, 100.0, 175.0};
        Student s1 = new Student("Sean", "Rowan", s1Scores);
        Student s2 = new Student("Chazz", "Wilks", s2Scores);
        Student[] stuArray = {s1, s2};
        Classroom classroom = new Classroom(stuArray);
        //When
        classroom.removeStudent("Chazz", "Wilks");
        String outPut = Arrays.toString(classroom.getStudents());
        //then
        System.out.println(outPut);
    }

    @Test
    public void testGetStudentByScore(){
        //Given
        Double[] s1Scores = { 100.0, 150.0, 250.0, 75.0 };
        Double[] s2Scores = {200.0, 75.0, 100.0, 175.0};
        Double[] s3Scores = {300.0, 300.0, 900.0, 200.0};
        Student s1 = new Student("Sean", "Rowan", s1Scores);
        Student s2 = new Student("Chazz", "Wilks", s2Scores);
        Student s3 = new Student("Cara", "Eppes", s3Scores);
        Student[] stuArray = {s1, s2, s3};
        Classroom classroom = new Classroom(stuArray);
        //When
        String output = Arrays.toString(classroom.getStudentsByScore());
        //then
        System.out.println(output);
    }

    @Test
    public void testGetGradeBook(){
        //Given
        Double[] s1Scores = { 100.0, 90.0, 80.0};
        Double[] s2Scores = {75.0, 75.0, 100.0};
        Double[] s3Scores = {100.0, 100.0, 100.0};
        Double[] s4Scores = {25.0, 0.0, 99.0, 75.0};
        Double[] s5Scores = {95.0, 100.0, 99.0, 75.0};

        Student s1 = new Student("Sean", "Rowan", s1Scores);
        Student s2 = new Student("Chazz", "Wilks", s2Scores);
        Student s3 = new Student("Cara", "Eppes", s3Scores);
        Student s4 = new Student("Stu", "Dent", s4Scores);
        Student s5 = new Student("Mike", "Krohn", s5Scores);
        Student s6 = new Student("John", "Hancock", s1Scores);
        Student s7 = new Student("Ben", "Franklin", s2Scores);
        Student s8 = new Student("Nicolas", "Cage", s3Scores);
        Student s9 = new Student("Robert", "DiNero", s4Scores);
        Student s10 = new Student("Dwayne", "Johnson", s5Scores);

        Student[] stuArr = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        Classroom classroom = new Classroom(stuArr);

        //When

    }


}
