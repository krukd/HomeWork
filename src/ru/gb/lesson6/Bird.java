package ru.gb.lesson6;

public class Bird extends Animal {

    @Override
    public void run(double length) {
        if (length > 0 && length <= 5) {
            System.out.println("Bravo! Your bird runs " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for bird is from 1 to 5 metres");
        }
    }

    @Override
    public void swim(double length) {

        System.out.println("Your bird cant swim!");
    }

    @Override
    public void jump(double height) {
        if (height > 0 && height <= 0.1) {
            System.out.println("Bravo! Your bird jumps " + height + " metres");
        } else {
            System.out.println("Oops...valid distance for bird is up  to 0.1 metres");
        }
    }
}

