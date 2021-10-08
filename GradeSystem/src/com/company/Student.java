package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> grades =new ArrayList<>(); // list to store grades
    private float averageGrades;

    public Student(List<Double> grades) {

            this.grades = grades;


    }


    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", averageGrades=" + averageGrades +
                '}';
    }

//function to get average grades
    public double getAverageGrades() {
        int size = grades.size();
        float totalGrades = 0;
        for(Double number: grades){
            totalGrades+=number;
    }
        averageGrades =totalGrades/size;
        return averageGrades;




//
//    public double getAverageGrades(List <Double> grades){
//        int length = grades.size();
//        float totalGrades=0;
//
//
//        for (Double number:grades) {
//            totalGrades+=number;
//
//
//        }
//        double averageGrade = totalGrades / length;
//        return averageGrade;
//        for (int index= 0; index<grades.size(); index++){
//            int length = grades.size();
//
//
//        }

    }
}
