package com.UncheckedException;


public class CustomArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            if (b == 0) {
                throw new ArithmeticException("Stupid! Don't divide by zero.");
            }

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}