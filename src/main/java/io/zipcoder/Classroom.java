package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Classroom extends Student implements Comparator<Student> {
    private Student[] students;

    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(int numOfStudents) {
        this.students = new Student[numOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }


    public double getAverageExamScore() {
        double total = 0.0;
        for (Student student : students) {
            total += student.getAverage();
        }
        double average = total / students.length;
        return average;
    }

    public void addStudent(Student person) {
        List<Student> list = new ArrayList<>(Arrays.asList(students));
        list.add(person);
        list.remove(0);
        students = list.toArray(students);

    }

    public void removeStudent(String firstName, String lastName){
    List<Student> list = new ArrayList<>(Arrays.asList(students));

    for(Student s : students){
        if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName) ){
            list.remove(s);
        }
    }

    students = list.toArray(students);
        //list.sort(this);

    }

    public Student[] getStudentsByScore(){
        List<Student> list = new ArrayList<>(Arrays.asList(students));
        list.sort(this);

        students = list.toArray(students);

        return students;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAverage().compareTo(s2.getAverage()) == 0){
            return (s1.getLastName().compareTo(s2.getLastName()));
        }

        return (s2.getAverage().compareTo(s1.getAverage()));
    }




}
