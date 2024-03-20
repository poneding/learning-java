package com.poneding.java;
class ComplexNumber {
    int real, imag;

    public ComplexNumber(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public void showC() {
        System.out.println(this.real + " + i" + this.imag);
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int realSum = c1.real + c2.real;
        int imagSum = c1.imag + c2.imag;
        return new ComplexNumber(realSum, imagSum);
    }
}

// public class ComplexNumberExample {
//     public static void main(String[] args) {
//         ComplexNumber c1 = new ComplexNumber(4, 5);
//         ComplexNumber c2 = new ComplexNumber(10, 5);

//         System.out.print("First Complex number: ");
//         c1.showC();
//         System.out.print("Second Complex number: ");
//         c2.showC();

//         ComplexNumber result = ComplexNumber.add(c1, c2);
//         System.out.print("Sum of complex numbers: ");
//         result.showC();
//     }
// }
