package home.work1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for user's favorite hobby
        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        // Display the information
        System.out.println("Hello, " + name);
        System.out.println("Your favorite hobby is: " + hobby);

    }
}

