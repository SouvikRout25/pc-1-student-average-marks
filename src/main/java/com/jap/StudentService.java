package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student s1 = new Student("Souvik", 12, 450);
        Student s2 = new Student("Rounak", 4, 352);
        Student s3 = new Student("Karma", 45, 250);
        Student s4 = new Student("Kalpana",13, 125);
        Student s5 = new Student("Sanjukta", 2,255);
        Student s6 = new Student("Hashirama",22,500);
        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        //return the HashSet object
        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        Set<String> stringSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while(iterator.hasNext()){
            stringSet.add(iterator.next().getName());
        }
      //return the TreeSet object;
        return stringSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String, Integer> map = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while(iterator.hasNext()){
            Student obj = iterator.next();
            map.put(obj.getName(), obj.getTotalMarks());
        }
        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

           return map;

    }

    public static void main(String[] args) {
        Set<Student> studentName = getAllStudentData();
        System.out.println(studentName);
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
