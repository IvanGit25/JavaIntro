package home.work8triangle;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int a = scanner.nextInt();

        System.out.println("Please enter second number:");
        int b = scanner.nextInt();

        System.out.println("Please enter third number:");
        int c = scanner.nextInt();

        System.out.println("The biggest number is: " + calculateTheBiggestNumber(a, b, c));
    }

    public static int calculateTheBiggestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}