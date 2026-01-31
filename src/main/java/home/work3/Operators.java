package home.work3;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Check the biggest number:
        // int,double & float options
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();

        System.out.println("Please enter second number:");
        int b = scanner.nextInt();

        System.out.println("Please enter third number:");
        int c = scanner.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(" The biggest number is: " + max);
        System.out.println("------------");

        // 2.Calculate rectangle parameters:
        // Only positive numbers with validation
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        if (width <= 0) {
            System.out.println("ERR: Width must be positive number");
            return;
        }

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        if (height <= 0) {
            System.out.println("ERR: Height must be positive number");
            return;
        }

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        System.out.println("------------");

        // 3.Check for Odd or Even number:
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }
        System.out.println("-------------");


        // 4.Read month of the year:
        // String for name of month
        System.out.println("Enter number for a month of the year: ");
        int month = scanner.nextInt();
        printMonthOfYearSwitch(month);
    }

    public static void printMonthOfYearSwitch(int monthOfYear) {
        String monthName = "";

        switch (monthOfYear) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("ERROR:Invalid month");
                return;
        }
        System.out.println("You have selected " + monthOfYear +   ". Month of the year is " + monthName + ".");
    }
}
