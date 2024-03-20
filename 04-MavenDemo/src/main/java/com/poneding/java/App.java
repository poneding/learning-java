package com.poneding.java;

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
        int num1 = 48;
        int num2 = 60;

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
