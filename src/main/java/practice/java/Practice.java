package practice.java;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Enter your sex: ");
        String sex = scanner.nextLine();

        System.out.println("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("Your name is " + name + " and your age is " + age + ", Your sex is " + sex + " and your address is : " + address);

    }
}
