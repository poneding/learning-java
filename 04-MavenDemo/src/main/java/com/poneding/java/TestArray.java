// import java.util.Scanner;
package com.poneding.java;

class TestArray {
    int MAX(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    int MIN(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}

// public class DifferenceArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr[i] = sc.nextInt();
//         }

//         TestArray obj = new TestArray();
//         int maxVal = obj.MAX(arr);
//         int minVal = obj.MIN(arr);

//         int difference = maxVal - minVal;
//         System.out.println("Maximum value in the array: " + maxVal);
//         System.out.println("Minimum value in the array: " + minVal);
//         System.out.println("Difference between max and min: " + difference);
//     }
// }
