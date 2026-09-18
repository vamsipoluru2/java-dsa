package com.manhatten.java8;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorFunctionalInterface {

	public static void main(String[] args) {

		Comparator<Integer> c = (Integer i1, Integer i2)->{ return((i1>i2)?-1:(i1<i2)?1:0);};
		TreeSet<Integer> t=new TreeSet<Integer>(c);
		t.add(10);
		t.add(5);
		t.add(9);
		t.add(20);
		for(Integer i:t) {
			System.out.println(i);
		}
		System.out.println(t);
	}

}
