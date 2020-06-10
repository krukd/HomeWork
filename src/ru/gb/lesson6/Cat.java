package ru.gb.lesson6;

public class Cat extends Animal {
    public static int counter = 0;

    public Cat() {
        counter++;
        System.out.println("Cat number " + counter + " was created");
    }

    @Override
    public void run(double length) {
        if (length > 0 && length <= 200) {
            System.out.println("Bravo! Your cat runs " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for cat is from 1 to 200 metres");
        }

    }

    @Override
    public void swim(double length) {

        System.out.println("Your cat cant swim!");
    }

    @Override
    public void jump(double height) {
        if (height > 0 && height <= 2) {
            System.out.println("Bravo! Your cat jumps " + height + " metres");
        } else {
            System.out.println("Oops...valid distance for cat is up  to 2 metres");
        }
    }
}

