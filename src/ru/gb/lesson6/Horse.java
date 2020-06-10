package ru.gb.lesson6;

public class Horse extends Animal {

    @Override
    public void run(double length) {
        if (length > 0 && length <= 1500) {
            System.out.println("Bravo! Your horse runs " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for horse is from 1 to 1500 metres");
        }
    }

    @Override
    public void swim(double length) {
        if (length > 0 && length <= 100) {
            System.out.println("Bravo! Your horse swims " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for horse is from 1 to 100 metres");
        }
    }

    @Override
    public void jump(double height) {
        if (height > 0 && height <= 3) {
            System.out.println("Bravo! Your horse jumps " + height + " metres");
        } else {
            System.out.println("Oops...valid distance for horse is up  to 3 metres");
        }
    }
}

