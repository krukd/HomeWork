package ru.gb.lesson2;

public class Lesson2 {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : array2) {
            if (value < 6) {
                int a = value * 2;
                System.out.print(a + " ");
            } else System.out.print(value + " ");
        }
        System.out.println();
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                arr[i][i] = 1;
                arr[i][arr.length - i - 1] = 1;
            }
        }
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minMax() {
        int[] a = {30, 15, 234, 67, 86, -20};
        int max = a[0];
        int min = a[0];
        for (int value : a) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("min = " + min + "," + " " + "max = " + max);
    }

    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.println();
        minMax();

    }
}
