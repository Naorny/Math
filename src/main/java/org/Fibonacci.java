package org;

import java.util.Scanner;

        public class Fibonacci {
                public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter first number: ");
                    long n1 = scan.nextLong();
                    System.out.print("Enter second number: ");
                    long n2 = scan.nextLong();
                    System.out.print("Enter number of Fibonacci Series: ");
                    long result = scan.nextLong();
                    System.out.print("Fibonacci Series of " + result + " numbers is: ");
                    for (int i = 0; i < result; ++i){
                        long sum = n1 + n2;
                        System.out.print(n1 + " ");
                        n1 = n2;
                        n2 = sum;
                    }
                }
        }


