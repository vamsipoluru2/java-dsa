package com.manhatten.java11;
import java.util.List;

public class VarInLambda {
    public static void main(String[] args) {
        List<String> names = List.of("Vamsi", "Rahul", "Kiran");

        
        names.forEach((var name) -> System.out.println(name.toUpperCase()));
    }
}