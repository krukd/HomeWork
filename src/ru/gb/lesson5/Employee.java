package ru.gb.lesson5;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.println("Имя пользователя: " + fullName + "; Должность: " + position + "; email: " + email + "; Телефон: " + phoneNumber +
                "; Зарплата: " + salary + "; Возраст: " + age);
    }

}

