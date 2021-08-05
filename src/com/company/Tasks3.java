package com.company;

import java.util.Scanner;

public class Tasks3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

        homeTask1();
        homeTask2();

    }

    public static void task1(){
        int n = scanner.nextInt();
        for(int i = 0; i <= n; ++i) System.out.print(i + " ");
    }

    public static void task2(){
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.print("All numbers: ");
        for(int i = n1; i <= n2; ++i) {
            if(i%2 == 0)  System.out.print(i + " ");
        }
        System.out.print("Even: ");
        for(int i = n1; i <= n2; ++i) {
            if(i%2 == 0)  System.out.print(i + " ");
        }
        System.out.print("Odd: ");
        for(int i = n1; i <= n2; ++i) {
            if(i%2 != 0)  System.out.print(i + " ");
        }
        System.out.print("Multiples of seven: ");
        for(int i = n1; i <= n2; ++i) {
            if(i%7 == 0)  System.out.print(i + " ");
        }
    }

    public static void task3(){
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = 0;
        for(int i = n1; i <= n2; ++i) sum += i;
        System.out.print("Sum: " + sum);
    }

    public static void task4(){
        int n = scanner.nextInt();
        int sum = 0;
        while(n != 0){
            n = scanner.nextInt();
            sum += n;
        }
        System.out.print("Sum: " + sum);
    }

    public static void task5(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = 0; i <= a; i++) {
            for(int j = 0; j <= b; j++) {
                if(i == 0 || j == 0 || i == b || j == b) System.out.print("r");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

    public static void task6(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = 0; i <= a; i++) {
            for(int j = 0; j <= b; j++) {
                if(i == 0 || j == 0 || i == b || j == b) System.out.print("r");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

    public static void homeTask1(){
        System.out.print("Enter the number: \n");
        int n = scanner.nextInt();
        int num = n;
        int numberDigits = 0, sumDigits = 0, avg = 0, zeroCount = 0;
        while(n != 0){
            numberDigits++;
            sumDigits += n;
            if(n == 0) zeroCount++;
            n = n%10;
        }
        System.out.println("The number of digits of number " + num + " is " + numberDigits);
        System.out.println("The sum of digits of the number " + num + " is " + sumDigits);
        System.out.println("The number of zeros in the number " + num + " is " + zeroCount);

    }

    public static void homeTask2(){
        int squareSize = scanner.nextInt();

        for(int i = 0; i < 8; i++){
            for(int l = 0; l < squareSize; l++){
                for(int j = 0; j < 8; j++){
                    if(i%2 == 0){
                        if(j%2 == 0) {
                            for(int k = 0; k < squareSize; k++) System.out.print("*");
                        }
                        else {
                            for(int k = 0; k < squareSize; k++) System.out.print("-");
                        }
                    } else {
                        if(j%2 != 0) {
                            for(int k = 0; k < squareSize; k++) System.out.print("*");
                        }
                        else {
                            for(int k = 0; k < squareSize; k++) System.out.print("-");
                        }
                    }
                }
                System.out.print("\n");


            }
        }

    }

}
