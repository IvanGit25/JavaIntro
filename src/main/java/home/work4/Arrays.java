package home.work4;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "------------";

        //1. Initialize array elements * 5:
        int[] intArray = new int[20];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 5;
            System.out.println(intArray[i]);
        }
        System.out.println(line);

        //2. Average value of array elements:
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 5;
            sum += intArray[i];

            double average = (double) sum / intArray.length;
            System.out.println("Average value is: " + average);
            // Explain the results after please !
        }
        System.out.println(line);

        //3. Calculate Even and Odd numbers from array:
        int[] intNewArray = new int[10];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < intNewArray.length; i++) {
            intNewArray[i] = i + 1; // insert numbers 1-9 in array

            if (intNewArray[i] % 2 == 0) {
                evenSum += intNewArray[i];
            } else {
                oddSum += intNewArray[i];
            }
        }
        System.out.println("Even sum of numbers is: " + evenSum);
        System.out.println("Odd sum of numbers is: " + oddSum);
        System.out.println(line);

        //4. Print numbers 1 to N:
        System.out.println("Please enter positive number for N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "");
        }
        System.out.println(line);

        //5. Print numbers 1 to N, which are not divided on 3 & 7:
        System.out.println("Please enter positive number for New N: ");
        int nNew = scanner.nextInt();

        for (int i = 1; i <= nNew; i++) {
            if (i % 3 !=0 && i % 7 !=0) {
                System.out.println(i + "");
            }
        }
        System.out.println(line);

        //6. Sum of first N Fibonacci numbers:
        System.out.println("Please enter positive number for Fibonacci N: ");
        int nFab = scanner.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= nFab; i++) {
            System.out.println(first + "");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
