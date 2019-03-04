package io.zipcoder;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

import static java.util.Arrays.asList;

public class Student {

    private String firstName;
    private String lastName;
    private List<Double> examScores;

    public Student(){

    }

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder sb = new StringBuilder();
        Integer number = 1;
        sb.append("> Exam Scores: \n");
        for (Double score : examScores) {
            sb.append("   Exam " + number + " -> " + score + "\n");
            number++;
        }
        return sb.toString();
    }

    public void setExamScores(Integer index, Double examScore) {
        examScores.remove(index);
        examScores.set(index, examScore);
    }

    public void addExamScore(Double score) {
        examScores.add(score);
    }

    public Double getAverage() {
        Double sum = 0.0;
        for (Double number : examScores) {
            sum += number;
        }
        Double average = sum / examScores.size();
        return average;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: "+firstName+" "+lastName+"\n");
        sb.append("> Average Score: " + getAverage()+"\n");
        sb.append(getExamScores());

        return sb.toString();
    }
}
