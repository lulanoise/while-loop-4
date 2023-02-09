package it.develhope.whileloop;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int number;
        Random random = new Random();
        number = random.nextInt(10) +1;
        System.out.println("Welcome!");
        System.out.println("Guess a number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while (guess != number) {
            System.out.println("Wrong! Try again:");
            guess = scanner.nextInt();
        }
        System.out.println("Congratulations!");
    }
}