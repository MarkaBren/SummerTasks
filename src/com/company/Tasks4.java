package com.company;

import java.util.Scanner;

public class Tasks4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1(){
        System.out.println("Task 1. ");
        int sum = 0, arithmeticMean;
        for(int i = 1; i <= 1000; ++i) sum += i;
        arithmeticMean = sum/1000;
        System.out.println("Arithmetic mean of numbers from 1 to 1000 is " + arithmeticMean);
        System.out.print("\n");
    }

    public static void task2(){
        System.out.print("Task 2. Enter a number: ");
        int a = scanner.nextInt();

        if(a < 1 || a > 20){
            System.out.println("Wrong number! Try again!");

            task2();
        } else {
            long product = 1;
            for (int i = a; i <= 20; i++) product *= i;
            System.out.println("Product of numbers from " + a + " to 20 is " + product);
        }
        System.out.print("\n");
    }

    public static void task3(){
        System.out.print("Task 3. Enter a number: ");
        int k = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(k + " * " + i + " = " + k * i);
        }
        System.out.print("\n");
    }

    public static void task4(){
        System.out.print("Task 4. Enter a number: ");
        int n = scanner.nextInt();
        System.out.print("The numbers are: ");
        for (int i = 1; i < n; i++) {
            if(n%i == 0) System.out.print(i + ", ");
        }
        System.out.print("\n");
    }

    public static void task5(){
        System.out.print("Task 5. Enter a number: ");
        int number = scanner.nextInt();
        int n = number, numDigits = 0, sumDigits = 0, zerosNumber = 0;
        while(n != 0){
            numDigits++;
            sumDigits += n%10;
            if(n%10 == 0) zerosNumber++;
            n /= 10;
        }

        while(true){
            System.out.println("What do you wont to see:");
            System.out.println("Press 1 to see number of digits");
            System.out.println("Press 2 to see sum of digits");
            System.out.println("Press 3 to see arithmetic mean of digits");
            System.out.println("Press 4 to see number of zeros");
            System.out.println("Press 5 for another number");
            System.out.println("Press 6 to exit");
            short menu = scanner.nextShort();
            if(menu == 6) break;
            switch (menu){
                case 1:
                    System.out.println("Number of digits: " + numDigits);
                    break;
                case 2:
                    System.out.println("Sum of digits: " + sumDigits);
                    break;
                case 3:
                    System.out.println("Arithmetic mean of digits: " + sumDigits/numDigits);
                    break;
                case 4:
                    System.out.println("Number of zeros: " + zerosNumber);
                    break;
                case 5:
                    task5();
                break;
            }
        }



    }



}
