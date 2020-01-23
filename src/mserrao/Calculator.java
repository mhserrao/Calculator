/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mserrao;

import java.util.Scanner;

/**
 * Calculator 
 * @author Maiziel Serrao
 */
public class Calculator {

    public static void main(String[] args) {
        //Scanner and string declaration
        Scanner scan = new Scanner(System.in);
        String option = new String("");

        do {

            //Prompt for first number  
            System.out.println("Enter a number between 0 and 9 > ");
            int firstNumber = scan.nextInt();

            //Prompt for operation
            System.out.println("Enter an operation (+,-,*,/,^) > ");
            String operation = scan.next();

            //Prompt for second number
            System.out.println("Enter a second number between 0 and 9 > ");
            int secondNumber = scan.nextInt();

            //Check if input is valid
            if ((firstNumber < 0) || (firstNumber > 9)) {
                System.out.print("First number is invalid.");
                System.out.println("\nDo you want to continue? (Y/N) ");
                option = scan.next();
                continue;
            } else if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("^")) {
                System.out.print("Operation is invalid.");
                System.out.println("\nDo you want to continue? (Y/N) ");
                option = scan.next();
                continue;
            } else if ((secondNumber < 0) || (secondNumber > 9)) {
                System.out.print("Second number is invalid.");
                System.out.println("\nDo you want to continue? (Y/N) ");
                option = scan.next();
                continue;
            } else if ((secondNumber == 0) && (operation.equals("/"))) {
                System.out.print("Division by zero is not possible.");
                System.out.println("\nDo you want to continue? (Y/N) ");
                option = scan.next();
                continue;
            }

            //Calculation of first and second number
            double addition, subtraction, multiplication, division, power;

            addition = firstNumber + secondNumber;
            subtraction = (firstNumber - secondNumber);
            multiplication = (firstNumber * secondNumber);
            division = (firstNumber / secondNumber);
            power = Math.pow(firstNumber, secondNumber);

            //Conversion of first number into string
            switch (firstNumber) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                case 0:
                    System.out.print("Zero");
                    break;
            }

            //Conversion of operation into string
            switch (operation) {
                case "+":
                    System.out.print(" plus ");
                    break;
                case "-":
                    System.out.print(" minus ");
                    break;
                case "*":
                    System.out.print(" times ");
                    break;
                case "/":
                    System.out.print(" divided by ");
                    break;
                case "^":
                    System.out.print(" to the power of ");
                    break;
            }

            //Conversion of second number into string
            switch (secondNumber) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                case 0:
                    System.out.print("zero");
                    break;
            }

            System.out.print(" is equal to ");

            //Print calculation of first and second number
            switch (operation) {
                case "+":
                    System.out.printf("%.2f.", addition);
                    break;
                case "-":
                    System.out.printf("%.2f.", subtraction);
                    break;
                case "*":
                    System.out.printf("%.2f.", multiplication);
                    break;
                case "/":
                    System.out.printf("%.2f.", division);
                    break;
                case "^":
                    System.out.printf("%.2f.", power);
                    break;
            }
            System.out.println("\nDo you want to continue? (Y/N) ");
            option = scan.next();
        } while (option.equals("Y") || option.equals("y") || option.equals("yes") || option.equals("Yes") || option.equals("YES"));
    }
}
