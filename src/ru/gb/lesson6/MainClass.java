package ru.gb.lesson6;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Animal animal = new Animal();
        Horse horse = new Horse();
        Bird bird = new Bird();
        cat.run(200);
        cat.swim(30);
        cat.jump(20);
        dog.run(15);
        dog.swim(3);
        dog.jump(10);
        horse.run(1400);
        horse.swim(20);
        horse.jump(10);
        bird.run(3);
        bird.swim(4);
        bird.jump(4);
    }
}
