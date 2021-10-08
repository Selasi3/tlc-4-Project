package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestCases {
    //function to test get Average Grades()
    @Test
    public void testGetAverageGrades(){
        List<Double> student1List = new ArrayList<>();


        student1List.add(15.0);
        student1List.add(25.00);
        student1List.add(20.0);

        Student student1 = new Student(student1List);
        double actualValue = 20;
        double predictedValue = student1.getAverageGrades();

        boolean value = (actualValue == predictedValue);
        assertTrue(value);



    }







}
