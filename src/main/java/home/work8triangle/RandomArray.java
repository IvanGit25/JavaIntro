package home.work8triangle;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        printRandomNumbers(7);
    }

    public static void printRandomNumbers(int arrayLength) {

        Random random = new Random();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int number : numbers) {

            System.out.print(number + " ");
        }
    }
}
