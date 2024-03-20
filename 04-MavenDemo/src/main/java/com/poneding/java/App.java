package com.poneding.java;

import java.util.Scanner;
import com.poneding.java.ComplexNumber;
import com.poneding.java.TestArray;

/**
 * Hello world!
 *
 */
public class App 
{
    // public static void main( String[] args )
    // {
    //     System.out.println( "Hello World!" );
    // }

    public static void main(String[] args) {
        go();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void go(){
        int num1 = 48;
        int num2 = 60;

        int res = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + res);

        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);

        System.out.print("First Complex number: ");
        c1.showC();
        System.out.print("Second Complex number: ");
        c2.showC();

        ComplexNumber result = ComplexNumber.add(c1, c2);
        System.out.print("Sum of complex numbers: ");
        result.showC();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        TestArray obj = new TestArray();
        int maxVal = obj.MAX(arr);
        int minVal = obj.MIN(arr);

        int difference = maxVal - minVal;
        System.out.println("Maximum value in the array: " + maxVal);
        System.out.println("Minimum value in the array: " + minVal);
        System.out.println("Difference between max and min: " + difference);
    }
}
