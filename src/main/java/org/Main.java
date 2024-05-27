package org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//     1 Two natural numbers are stored in the variables q and w.
//       Create a program that displays the result of dividing q by w with a remainder.
//       Example of the program output
//       (for the case when q stores 21 and w stores 8): 21 / 8 = 2 and 5 in the remainder

        System.out.print("Enter 1 number: ");
        int q = scan.nextInt();
        System.out.print("Enter 2 number: ");
        int w = scan.nextInt();
        int result1 = q / w;
        int result2 = q - q / w * w;
        System.out.println("q / w = " + result1);
        System.out.println("Remainder is " + result2);

//     2 The variable n stores a natural two-digit number.
//       Create a program that calculates and displays the sum of digits of n.

        System.out.print("Enter number: ");
        int n = scan.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);


//    3 A real number with a non-zero fractional part is stored in the variable n.
//      Create a program that rounds the number n to the nearest integer
//      and displays the result on the screen

        System.out.println("Enter double number: ");
        String number = scan.next();
        double x = Double.parseDouble(number);
        int y = (int) (x); // int y = (int) Math.round(x);
        System.out.println("The nearest integer is " + y);


//    4 Given three variables a, b and c.
//      Change the values of these variables so that
//      a stores the value of a+b,
//      b stores the difference of the old values of c-a, and
//      c stores the sum of the old values of a+b+c.
//      For example, a=0, b=2, c=5,
//      then the new values are a=2, b=5 and c=7

        System.out.print("Enter a number: ");
        int a_old = scan.nextInt();
        System.out.print("Enter b number: ");
        int b_old = scan.nextInt();
        System.out.print("Enter c number: ");
        int c_old = scan.nextInt();
        int a;
        int b;
        int c;
        a = a_old + b_old;
        System.out.println("Sum of old values a+b = " + a);
        b = c_old - a_old;
        System.out.println("Diff of old values c-a = " + b);
        c = a_old + b_old + c_old;
        System.out.println("Sum of old values a+b+c = " + c);

        }
}
