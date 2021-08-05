package com.company;

import java.util.Scanner;

public class Tasks2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Task 1 Maximum out of seven numbers
        System.out.println("Task 1. Maximum out of seven numbers: ");
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        System.out.print("Third number: ");
        int c = scanner.nextInt();
        System.out.print("Fourth number: ");
        int d = scanner.nextInt();
        System.out.print("Fifth number: ");
        int e = scanner.nextInt();
        System.out.print("Sixth number: ");
        int f = scanner.nextInt();
        System.out.print("Seventh number: ");
        int g = scanner.nextInt();

        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        if(e > max) max = e;
        if(f > max) max = f;
        if(g > max) max = g;

        System.out.println("Max is: " + max);

        // Task 2 Determine salesman's salary
        System.out.println("Task 2. Determine salesman's salary: ");
        int sales1 = scanner.nextInt();
        int sales2 = scanner.nextInt();
        int sales3 = scanner.nextInt();
        int salary1 = 0;
        int salary2 = 0;
        int salary3 = 0;
        if(sales1 <= 500) salary1 = 200 + 3;
        else if(sales1 > 500 && sales1 <= 1000) salary1 = 500 + 5;
        else if(sales1 > 1000) salary1 = 1000 + 10;

        if(sales2 <= 500) salary2 = 200 + 3;
        else if(sales2 > 500 && sales2 <= 1000) salary2 = 500 + 5;
        else if(sales2 > 1000) salary2 = 1000 + 10;

        if(sales3 <= 500) salary3 = 200 + 3;
        else if(sales3 > 500 && sales3 <= 1000) salary3 = 500 + 5;
        else if(sales3 > 1000) salary3 = 1000 + 10;

        System.out.printf("Salary of first salesman is %d $\n", salary1);
        System.out.printf("Salary of first salesman is %d $\n", salary2);
        System.out.printf("Salary of first salesman is %d $\n", salary3);

        int best = salary1 + 200;
        if(salary2 > best) {
            best = salary2 + 200;
            System.out.printf("The second salesman is the best salesman and he has $%d\n", best);
            System.out.println("So he has bonus of $200");
        }
        else if(salary3 > best) {
            best = salary3 + 200;
            System.out.printf("The third salesman is the best salesman and he has $%d\n", best);
            System.out.println("So he has bonus of $200");
        } else {
            System.out.printf("The first salesman is the best salesman and he has $%d\n", best);
            System.out.println("So he has bonus of $200");
        }

        // Task 3 Four digit number
        int n = scanner.nextInt();
        if(n > 9999 || n < 1000) {
            System.out.printf("Error");
        } else {
            int n1 = (((n/10)/10)/10)%10;
            int n2 = ((n/10)/10)%10;
            int n3 = (n/10)%10;
            int n4 = n%10;

            int result = n3 + n4 * 10 + n1 * 100 + n2 * 1000;
            System.out.printf("The result is %d", result);
        }

    }
}
