package com.company;

import java.util.Scanner;

public class Tasks5 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println("Task 1. Reverse one dimensional array");
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();

        int[] res = new int[10];
        for(int i = 0; i < arr.length; i++){
            res[i] = arr[arr.length-i-1];
            System.out.print(res[i] + ", ");
        }

        System.out.print("\n");
    }

    public static void task2(){
        System.out.print("Task 2. Enter a number: ");
        int[] pentagon = new int[5];
        for (int i = 0; i < pentagon.length; i++) pentagon[i] = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < pentagon.length; i++) sum += pentagon[i];
        System.out.print("Perimeter is " + sum);
        System.out.print("\n");
    }

    public static void task3(){
        System.out.println("Task 3. Company's profit");
        int size = scanner.nextInt();
        float[] profit = new float[size];
        for (int i = 0; i < size; i++) profit[i] = scanner.nextFloat();

        float max = profit[0], min = profit[0];
        for (int i = 0; i < profit.length; i++) {
            if(profit[i] > max) max = profit[i];
            if(profit[i] < min) min = profit[i];
        }
        System.out.println("Highest profit is" + max);
        System.out.println("Lowest profit is" + min);

        System.out.print("\n");
    }

    public static void task4(){
        System.out.println("Task 4. Array ");
        int size = scanner.nextInt();
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextFloat();

        // Sum of negative numbers
        float sumNeg = 0;
        for (int i = 0; i < arr.length; i++) if(arr[i] < 0) sumNeg += arr[i];

        // Product between max and min
        float max = arr[0], min = arr[0], productBetween = 1;
        for (int i = 0; i < arr.length; i++) {
            // Max and min
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        // product
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == min) break;
                    productBetween *= arr[i];
                }
                break;
            } else if(arr[i] == min){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == max) break;
                    productBetween *= arr[i];
                }
                break;
            }
        }

        // Product of elements with even numbers
        float evenProduct = 1;
        for (int i = 0; i < arr.length; i++) if(arr[i]%2 == 0) evenProduct *= arr[i];

        // The sum of elements between the first and last negative elements.
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] < 0) break;
                    sum += arr[i];
                }
                break;
            }
        }

        System.out.println("Sum of negative numbers " + sumNeg);
        System.out.println("Product between max and min " + productBetween);
        System.out.println("Product of elements with even numbers " + evenProduct);
        System.out.println("The sum of elements between the first and last negative elements " + sum);

        System.out.print("\n");
    }

    public static void task5(){
        System.out.print("Task 5. Sort array (Bubble sort) ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1] < arr[j]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        System.out.print("\n");
    }

    public static void task6(){
        System.out.print("Task 6. Shuffle an array");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int index = ((int) (Math.random()*10000))%10;
            int t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;
        }

        for (int i = 0; i < 10; i++) System.out.print( arr[i] + "\n");
        System.out.print("\n");
    }

    public static void task7(){
        System.out.println("Task 7. ");
        int[] arr = {5, 0, 5, 0, 0, 2, 0, 0, 5, 5};
        // for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] == 0){
                    arr[j] = arr[j+1];
                    arr[j+1] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) if(arr[i] == 0) arr[i] = 1;

        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

        System.out.print("\n");
    }

    public static void task8(){
        System.out.print("Task 8. New array");
        int[] arr1 = {1,1,0,0,-1};
        int[] arr2 = {1,0,-1,5,4};
        int[] res = new int[10];

        for (int i = 0; i < 5; i++) res[i] = arr1[i];
        for (int i = 0; i < 5; i++) res[5+i] = arr2[i];

        // Bubble sort
        for (int i = 0; i < res.length-1; i++) {
            for (int j = 0; j < res.length-i-1; j++) {
                if(res[j+1] > res[j]){
                    int t = res[j];
                    res[j] = res[j+1];
                    res[j+1] = t;
                }
            }
        }

        for (int i = 0; i < res.length; i++) System.out.print(res[i] + " ");

        System.out.print("\n");
    }



}
