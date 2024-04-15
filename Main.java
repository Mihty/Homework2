package org.example;
public class Main {
    public static void main(String[] args) {
        // Завдання 1
        int x = 3;
        int y = 4;

        System.out.println("Арифметична сума: " + (x + y));
        System.out.println("Значення змінних поспіль: " + x + y);

        // Завдання 2
        int decimal1 = 101;
        int decimal2 = 11;
        int decimal3 = 111;

        System.out.println("Числа у десятковому вигляді:");
        System.out.println(decimal1);
        System.out.println(decimal2);
        System.out.println(decimal3);

        int binary1 = 0b10;
        int binary2 = 0b10111;
        int binary3 = 0b1111;

        System.out.println("Числа у двійковому вигляді:");
        System.out.println(Integer.toBinaryString(binary1));
        System.out.println(Integer.toBinaryString(binary2));
        System.out.println(Integer.toBinaryString(binary3));

        // Завдання 3
        System.out.println("Якщо виправити помилки:");
        int i = 5;
        i = i + 1;
        System.out.println(i);

        i = 5;
        i = i++ + i++;
        System.out.println(i);

        i = 5;
        i = i++ + ++i;
        System.out.println(i);

        i = 5;
        i = ++i + ++i;
        System.out.println(i);

    }
}