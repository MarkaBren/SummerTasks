package com.company;

import java.util.Scanner;

public class Tasks6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1
        System.out.print("Enter width:");
        System.out.print("Enter height:");
        displayRectangle(10,5);
        System.out.print("\n");

        // Task 2
        System.out.println("Task 2. Factorial of: ");
        System.out.print("Enter number:");
        int nF = scanner.nextInt();
        calculateFactorial(nF);
        System.out.print("\n");

        // Task 3

        System.out.println("Task 3. Determine whether the number is prime");
        System.out.print("Enter number:");
        int nP = scanner.nextInt();
        System.out.println("Task 3. Is prime");
        System.out.print(isPrime(nP) ? "Prime" : "Not prime");
        System.out.print("\n");

        // Task 4
        System.out.println("Task 4. Display cube of the number");
        System.out.print("Enter number:");
        int nC = scanner.nextInt();
        displayCube(nC);
        System.out.print("\n");

        // Task 5
        System.out.println("Task 5. Sum of numbers in range\n");
        System.out.print("Enter first number:");
        int nS1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int nS2 = scanner.nextInt();
        sumInRange(nS1, nS2);
        System.out.print("\n");

        // Task 6
        System.out.println("Task 6. Maximum and minimum of array\n");
        dispalayMinMaxArray(new int[]{1,8,4,2,3,5,5,9,0,5,4});
        System.out.print("\n");

        // Task 7
        System.out.println("Task 7. Reverse array\n");
        reverseArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.print("\n");

        // Task 8
        System.out.println("Task 7. Number of primes in array\n");
        numberOfPrimesInArray(new int[] {1,5,2,6,7,4,4,8,5,7,9,10});
        System.out.print("\n");

    }

    public static void displayRectangle(int n, int k){
        System.out.println("Task 1. Rectangle");

        for(int i = 0; i < k; i++){
            for (int j = 0; j < n; j++) System.out.print('#');
            System.out.print("\n");
        }
    }

    public static void calculateFactorial(int n){
        int res = 1;

        for (int i = 0; i <= n; i++) {
            res *= i;
        }

        System.out.print("Factorial of" + n + " is " + res);
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= n; i++) if(n%i != 0) return true;
        return false;
    }

    public static void displayCube(int n){
        System.out.print("Cube:" + n*n*n);
    }

    public static void sumInRange(int n1, int n2){
        System.out.println("Task 5. Display cube of the number");
        int sum = 0;

        for (int i = n1; i < n2; i++) {
            sum += i;
        }

        System.out.print("Sum:" + sum);
    }

    public static void dispalayMinMaxArray(int[] arr){
        System.out.println("Task 6. Display cube of the number");
        int max = arr[0], min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.print("Max = " + max + "\n" + "Min" + min);
    }

    public static void reverseArray(int[] arr){
        System.out.println("Task 6. Display cube of the number");
        int[] copy = arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[arr.length-i-1];
        }
    }

    public static int numberOfPrimesInArray(int[] arr){
        System.out.println("Task 6. Display cube of the number");
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) n++;
        }

        return n;
    }

}
