package ru.gb.lesson1;

//1. Создаем пустой проект в IntelliJ IDEA и прописываем метод main();

public class Lesson1 {

//2. Создаем переменные всех пройденных типов данных, и инициализируем их значения;

    byte b = 65;
    short s = 125;
    int i = 2456;
    long l = 4_000_000L;
    float f = 345.0f;
    double d = 456.234;
    char ch = 'C';
    boolean bool = true;
    String str = "Java";

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры
// этого метода;
    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;
    public static boolean sumTrueOrFalse(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли
// число передали, или отрицательное;
// Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int a) {
        if (a < 0) {
            System.out.println(a + " отрицательное число");
        } else System.out.println(a + " положительное число");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
// если число отрицательное;
    public static boolean trueOrFalse(int a) {
        if (a < 0) {
            return true;
        } else return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
// в консоль сообщение «Привет, указанное_имя!»;
    public static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }


    public static void main(String[] args) {
        System.out.println(calc(4, 5, 10, 5));
        System.out.println(sumTrueOrFalse(5, 15));
        isPositiveOrNegative(24);
        System.out.println(trueOrFalse(-6));
        greeting("Dmitry");

    }


}


