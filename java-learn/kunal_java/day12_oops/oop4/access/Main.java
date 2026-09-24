package day12_oops.oop4.access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(10,"vamsi");

        //need to do afew things
        //access the data members
        //modify the data members

        //private
        //int num=A.num;//cant access if num is private
        //System.out.println(A.num);/
        //obj.num;//private so it wont give but can access through getters and setters
        obj.getNum();//it will give num due to it was in menthod due to method is public

//        default //it will allow in same package it wont allow in different package file
//        int n=obj.num;//allow if it was default
    }
}
