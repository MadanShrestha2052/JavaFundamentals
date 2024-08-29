package Flowcharts;

import java.util.*;

public class greatestFromTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int a = sc.nextInt();
        System.out.println("Input the second number:");
        int b = sc.nextInt();

        sc.close();
        if (a < b) {
            System.out.println(a + " is smaller than " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
