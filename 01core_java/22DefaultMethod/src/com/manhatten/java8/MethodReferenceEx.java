package com.manhatten.java8;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MethodReferenceEx {
    public static void main(String[] args) {
        Student s = new Student(1, "Vamsi");
        System.out.println(s); // calls s.toString() automatically
    }
}