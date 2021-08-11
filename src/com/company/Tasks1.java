package com.company;

import java.util.Scanner;

public class Tasks1 {

    public static void main(String[] args) {

        // Console input
        Scanner scanner = new Scanner(System.in);

        // Announcement of Puppies
        System.out.print("Selling puppies.\n");
        System.out.print("Breed: Rottweiler.\n");
        System.out.print("..................\n");
        System.out.print("\n");
        System.out.print("222\t|\t222|\t\n");
        System.out.print("22\t|\t22|\t\n");
        System.out.print("22\t|\t22|");

        // Task 1
        System.out.println("Task 1. Square");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a == b) System.out.println("Square");
        else System.out.println("Not Square");

        // Task 2
        System.out.println("Task 2. Child");
        double age = scanner.nextDouble();
        if(age < 6) System.out.println("Kindergarten");
        else if(age >= 6 && age <= 16) System.out.println("School");
        else if(age > 16 && age <= 20) System.out.println("College");
        else System.out.println("College");

        // Task 3
        System.out.println("Task 3. Segment");
        int number = scanner.nextInt();
        if(number <= 5 && number >= 2) System.out.println("[2,5]");
        else if(number >= -1 && number <= 1) System.out.println("[-1,1]");
        else System.out.println("The number is not in the segments");

        // Task 4
        System.out.println("Task 4. Two equal numbers");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        if(n1 == n2 || n1 == n3 || n2 == n3) System.out.println("Yes!");
        else System.out.println("No!");

        // Task 5
        System.out.println("Task 5. Valid time");
        double hour = scanner.nextDouble();
        double minute = scanner.nextDouble();
        double second = scanner.nextDouble();
        if( (hour >= 0 && hour <= 24) && (minute >= 0 && minute <= 60) && (second >= 0 && second <= 60)) System.out.println("Valid!");
        else System.out.println("Invalid!");

        // Task 6
        System.out.println("Task 6. Course back");
        int course = scanner.nextInt();
        if( course == 1 ) System.out.println("-1");
        else if(course == -1) System.out.println("1");
        else if( course == 2 ) System.out.println("-2");
        else if(course == -2) System.out.println("2");
        else System.out.println("Not a course!");

        // Task 7
        System.out.println("Task 7. Weather the month ");
        int month = scanner.nextInt();
        if( month >= 1 && month <= 2) System.out.println("Cold, Snow");
        else if( month >=3 && month <= 5) System.out.println("Rain");
        else if( month >= 6 && month <= 8) System.out.println("Heat, Thunderstorm");
        else if( month >=8 && month <= 11) System.out.println("Rain");
        else if(month == 12) System.out.println("Cold, Snow");
        else System.out.println("Invalid month");

    }
}
