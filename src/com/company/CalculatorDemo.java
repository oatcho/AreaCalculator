package com.company;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Calculator firstCalculation = new Calculator();
        int inputHeight;
        int inputWidth;

        System.out.println("This is a calculator that will find the area of ANY rectangle you come across");
        System.out.println("Please enter your height: ");

        inputHeight = key.nextInt();

        System.out.println("Please enter your width: ");

        inputWidth = key.nextInt();

        firstCalculation.setHeight(inputHeight);
        firstCalculation.setWidth(inputWidth);


        System.out.println("The area of said rectangle is: " + firstCalculation.getHeight() + " * " + firstCalculation.getWidth() + " = " + firstCalculation.getArea());



    }
}
