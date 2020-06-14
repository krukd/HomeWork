package ru.gb.lesson7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

    //1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        String fileName2 = "test2.txt";
        String fileName3 = "test3.txt";
        String s = "There are many different holidays. On the first of January we celebrate New Year.";
        String s2 = "When the clock strikes twelve they drink a toast to the New Year\n" +
                "and greet each other.";
        String s3 = "";
        createAndWriteFile(fileName, s); // call method for file1
        createAndWriteFile(fileName2, s2); // call method for file2
        createAndWriteFile(fileName3, s3); // call method for file3
        readingFromOneFileAndWriteToAnother(fileName, fileName3); // reading from file1 and write to file3
        readingFromOneFileAndWriteToAnother(fileName2, fileName3); // reading from file2 and write to file3
        isWordExist(fileName3);
    }

    //Method creates file and writes something into it
    public static void createAndWriteFile(String fileName, String s) throws IOException {
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        System.out.println(s);
        bw.flush();
        bw.close();
    }

    //2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго в новый файл.
//Method reads from one file and writes to another file
    public static void readingFromOneFileAndWriteToAnother(String fileName1, String fileName2) throws IOException {
        File f1 = new File(fileName1);
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        File f2 = new File(fileName2);
        FileWriter fw = new FileWriter(f2, true);
        BufferedWriter bw = new BufferedWriter(fw);
        while (s != null) {
            bw.write(s);
            bw.newLine();
            System.out.println(s);
            s = br.readLine();
        }
        bw.flush();
        bw.close();

    }
    //3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).

    public static boolean isWordExist(String fileName) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String w = sc.nextLine();
        sc.close();
        FileInputStream fis = new FileInputStream(new File(fileName));
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String[] lines = new String(content, StandardCharsets.UTF_8).split("\n");
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.equalsIgnoreCase(w)) {
                    System.out.println("This word exist");
                    return true;
                }
            }
        }
        System.out.println("This word does not exist");
        return false;
    }
}
