package home.work2;

import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Change the value of <Test>
        String text = "My name is <Test>";

        System.out.println("Enter new value for <Test>: ");
        String newValue = scanner.nextLine();

        String result = text.replace("Test", newValue);
        System.out.println(result);
        System.out.println("----------");

        // Compare 2 strings
        System.out.println("Enter first string name: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter second string name: ");
        String name2 = scanner.nextLine();

        System.out.println(name1.equals(name2));
        System.out.println("----------");

        // Count words in string
        String sentence = "How many words have this string?";

        String[] words = sentence.split("\\s+");

        System.out.println(words.length);
        System.out.println("----------");

        // Combine 2 or more strings
        String text1 = "This";
        String text2 = "is";
        String text3 = "combined";
        String text4 = "string";

        String combinedtext = text1 + " " + text2 + " " + text3 + " " + text4;
        System.out.println(combinedtext);

    }
}
