package com.hillel.lesson9.task1;
// Task 1. Compound Bank Interest calculator
        /*1) В банк положили s денег. Какой станет сумма вклада через n лет,
        если процент 1,5% добавляется к сумме вклада ежемесячно. (сложный процент)
        Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.*/


import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double interest = 0.015;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        int s = scanner.nextInt();
        System.out.println("Введите количество лет:");
        int n = scanner.nextInt();

        System.out.println("\nПоложив $" + s + " денег в банк, через " + n + " лет ваш вклад вырастет до $"
                + calculateDeposit(s, n, interest) + ", при текущей ставке " + interest * 100 + "%.");
    }

    private static double calculateDeposit(int sum, int years, double interest) {
        return sum * (Math.pow((1 + interest / 12), 12 * years));
    }

}
