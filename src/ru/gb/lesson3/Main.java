package ru.gb.lesson3;

import java.util.Random;
import java.util.Scanner;

//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки
// угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
// чем загаданное, или меньше. После победы или проигрыша
// выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(9);
        while (true) {
            System.out.println("Enter number from 0 to 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("You have only " + i + " attempts to guess the number:");
                int b = sc.nextInt();
                if (b < a) {
                    System.out.println("Your number is less");
                    if (i == 1) {
                        System.out.println("You have lost");
                    }
                } else if (b > a) {
                    System.out.println("Your number is bigger");
                    if (i == 1) {
                        System.out.println("You have lost");
                    }
                } else {
                    System.out.println("Good job");
                    break;
                }
            }
            System.out.println("Do you want to play again? Enter 1 for yes, 0 for no");
            int answer = sc.nextInt();
            if (answer == 0) {
                break;
            }
        }
    }
}

