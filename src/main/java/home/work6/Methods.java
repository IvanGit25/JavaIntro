package home.work6;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Password
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        boolean isValid = isValidPassword(password);

        if (isValid) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect password");
        }
        System.out.println("---------------");

        //2.Numbers
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        checkNumbers(a, b, c);
        System.out.println("---------------");

        //3.Average and Sum
        System.out.println("Enter 2 numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double average = calculateAverage(num1, num2);
        double sum = calculateSum(num1, num2);
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }

    // 1. Validate Password:
    public static boolean isValidPassword(String password) {

        // Check Length:
        if (password.length() < 8) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        // Check Symbols :
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSymbol = true;
            }
        }
        return hasLetter && hasDigit && hasSymbol;
    }

    // 2. Check Positive or Equal numbers:
    public static void checkNumbers(int a, int b, int c) {

        // Check positive
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Numbers are positive!");
        } else {
            System.out.println("There is negative number!");
        }

        // Check equals
        if (a == b && b == c) {
            System.out.println("Numbers are Equal!");
        } else {
            System.out.println("Numbers are NOT equal!");
        }
    }

    // 3. Average and Sum Methods:
    public static double calculateAverage(double num1, double num2) {
        double sum = calculateSum(num1, num2);
        return sum / 2;
    }
    public static double calculateSum(double num1, double num2){
        return  num1 + num2;
    }
}