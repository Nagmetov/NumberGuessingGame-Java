package org.example;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // от 1 до 100
        int attempts = 7;
        boolean hasWon = false;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. У тебя есть " + attempts + " попыток.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Попытка " + i + ": Введите ваше число: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                hasWon = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Слишком мало!");
            } else {
                System.out.println("Слишком много!");
            }
        }

        if (hasWon) {
            System.out.println("Поздравляем! Вы угадали число.");
        } else {
            System.out.println("Вы проиграли. Загаданное число было: " + numberToGuess);
        }

        scanner.close();
    }
}
