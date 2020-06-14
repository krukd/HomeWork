package ru.gb.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
//4. Создать массив из 5 сотрудников.
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Вася Пупкин", "Бухгалтер", "java@mail.ru", "375295467899", 25000, 32);
        employees[1] = new Employee("Иван Иванов", "Менеджер", "python@mail.ru", "375295467898", 26000, 41);
        employees[2] = new Employee("Ольга Пупкина", "Учитель", "swift@mail.ru", "375295467897", 22000, 30);
        employees[3] = new Employee("Ирина Иванова", "Повар", "c++@mail.ru", "375295467891", 28000, 42);
        employees[4] = new Employee("Петр Сидоров", "Программист", "c#@mail.ru", "375295467889", 150000, 45);

//5. *С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}
