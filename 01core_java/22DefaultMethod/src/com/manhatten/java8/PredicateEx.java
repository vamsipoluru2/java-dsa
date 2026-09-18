package com.manhatten.java8;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> p=(i)->(i%2==0);
		if(p.test(10)) {
			System.out.println("Even Number");
		}
		else
			System.out.println("Odd Number");

	}

}
