package com.company;

import java.util.Random;
import java.util.Scanner;

public class Tasks7 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random r = new Random();

    public static int WIDTH = 6, HEIGHT = 6;

    public static void main(String[] args) {

        // Task 1
        /*maxValue(new int[]{4,5,1,2,0,9,5,7,3,12,15,15,16});
        System.out.print("\n");*/


        task8();

    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int maxValue(int a, int b){
        if(a > b) return a;
        else return b;
    }

    public static int maxValue(int a, int b, int c){
        if(a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else if(c > a && c > b) return c;
        else return a;
    }

    public static boolean isLeap(int year){
        return (year%4 == 0 && year%100 == 0 && year%400 == 0);
    }

    public static int daysInYears(int year1, int year2){
        return year2 * (isLeap(year2) ? 366 : 365) - year1 * (isLeap(year1) ? 366 : 365);
    }

    public static int[] reverseArray(int[] arr){
        System.out.println("Task 6. Display cube of the number");
        int[] copy = arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[arr.length-i-1];
        }
        return arr;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= n; i++) if(n%i != 0) return true;
        return false;
    }

    public static int numberOfPrimesInArray(int[] arr){
        System.out.println("Task 6. Display cube of the number");
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) n++;
        }

        return n;
    }

    public static void task8(){

        int sol[][] = new int[WIDTH][HEIGHT];

        for (int x = 0; x < HEIGHT; x++) {
            for (int y = 0; y < WIDTH; y++) {
                sol[x][y] = -1;
            }
        }

        sol[0][0] = 1;

        if (!solve(0, 0, 1, sol)) System.out.println("Solution does not exist");
        printSolution(sol);
    }

    public static boolean solve(int x, int y, int moveNum,int sol[][]) {

        int xMove[] = new int[] {  1,  2, 2, 1, -1, -2, -2, -1 };
        int yMove[] = new int[] { -2, -1, 1, 2,  2,  1, -1, -2 };

        int next_x, next_y;
        if (moveNum > WIDTH * HEIGHT) return true;


        for (int i = 0; i < 8; i++) {
            next_x = x + xMove[i];
            next_y = y + yMove[i];
            if (isSafe(next_x, next_y, sol)){
                sol[next_x][next_y] = moveNum;
                if (!solve(x, y, moveNum+1, sol)) sol[next_x][next_y] = 0;
                else return true;
            }



            /*
            next_x = x + xMove[i];
            next_y = y + yMove[i];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = moveNum;
                if (solve(next_x, next_y, moveNum + 1, sol)) return true;
                else sol[next_x][next_y] = -1;
            }
            */
        }

        return false;
    }

    public static boolean isSafe(int x, int y, int sol[][]){
        return (x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT && sol[x][y] == -1);
    }

    public static void printSolution(int sol[][])
    {
        for (int x = 0; x < HEIGHT; x++) {
            for (int y = 0; y < WIDTH; y++) {
                System.out.print(sol[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "\t");
    }

}
