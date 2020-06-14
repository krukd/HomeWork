package ru.gb.lesson6;

public class Animal {
    public static int counter = 0;

    public Animal() {
        counter++;
        System.out.println("Animal number " + counter + " was created");
    }

    public void run(double length) {

    }

    public void swim(double length) {

    }

    public void jump(double height) {

    }
}