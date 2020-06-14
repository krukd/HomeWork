package ru.gb.lesson6;

public class Dog extends Animal {
    public static int counter = 0;

    public Dog() {
        counter++;
        System.out.println("Dog number " + counter + " was created");
    }

    @Override
    public void run(double length) {
        if (length > 0 && length <= 500) {
            System.out.println("Bravo! Your dog runs " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for dog is from 1 to 500 metres");
        }
    }

    @Override
    public void swim(double length) {
        if (length > 0 && length <= 10) {
            System.out.println("Bravo! Your dog swims " + length + " metres");
        } else {
            System.out.println("Oops...valid distance for dog is from 1 to 10 metres");
        }
    }

    @Override
    public void jump(double height) {
        if (height > 0 && height <= 0.4) {
            System.out.println("Bravo! Your dog jumps " + height + " metres");
        } else {
            System.out.println("Oops...valid distance for dog is up  to 0.4 metres");
        }
    }
}
