package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void constructorTest(){
        //Given
        Double[] scores = {100.0, 80.0, 94.8};
        Student sean = new Student("Sean","Rowan", scores);
        String expectedFirst = "Sean";
        String expectedLast = "Rowan";


        //When
        String actualFirst = sean.getFirstName();
        String actualLast = sean.getLastName();
        String actualExams = sean.getExamScores();
        //Then
        Assert.assertEquals(expectedFirst, actualFirst);
        Assert.assertEquals(expectedLast, actualLast);
        System.out.println();

    }

    @Test
    public void addExamScoreTest() {
        //Given
        String first = "Sean";
        String last = "Rowan";
        Double[] examScores = { };
        Student sean = new Student(first, last, examScores);
        //when
        sean.addExamScore(100.0);
        String output = sean.getExamScores();
        //Then
        System.out.println(output);

    }

    @Test
    public void setExamScoreTest() {
        //Given
        String first = "Sean";
        String last = "Rowan";

        Double[] examScores = {100.0};
        Student sean = new Student(first, last, examScores);
        //when
        sean.setExamScores(0, 150.0);
        String output = sean.getExamScores();
        //Then
        System.out.println(output);

    }

    @Test
    public void setExamScoreTest2(){
        //Given
        String first = "Sean";
        String last = "Rowan";

        Double[] examScores = {100.0, 277.0};
        Student sean = new Student(first, last, examScores);
        //when
        sean.setExamScores(1, 150.0);
        String output = sean.getExamScores();
        //Then
        System.out.println(output);
    }

    @Test
    public void getAverageTest(){
        //Given
        Double[] scores = {100.0, 150.0, 250.0, 0.0};
        Student sean = new Student("Sean","Rowan", scores);
        //when
        double outPut = sean.getAverage();
        //then
        System.out.println(outPut);

    }

    @Test
    public void toStringTest(){
        //Given
        Double[] scores = {100.0, 150.0, 250.0, 0.0};
        Student sean = new Student("Sean","Rowan", scores);
        //when
        String output = sean.toString();
        //then
        System.out.println(output);
    }

}