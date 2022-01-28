package com.hillel.lesson9.task2;
// Task 2. Sting 1..99 with Hello World
        /*2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со следующими изменениями:
        (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
        - если число кратно 3 то вывести вместо него Hello
        - если число кратно 5 то вывести вместо него World
        - если число кратно и 3 и 5 то вывести вместо него HelloWorld
        - иначе вывести просто само число*/


public class String1To99 {
    public static void main(String[] args) {
        //в данном случае целевой метод - resultString(). Вывод в методе main - просто для наглядности
        System.out.println(resultString());
    }

    public static String resultString() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("HelloWorld ");
            } else if (i % 3 == 0) {
                result.append("Hello ");
            } else if (i % 5 == 0) {
                result.append("World ");
            } else {
                result.append(i).append(" ");
            }
        }

        return result.toString().trim();
    }
}
