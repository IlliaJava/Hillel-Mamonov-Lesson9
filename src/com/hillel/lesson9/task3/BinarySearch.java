package com.hillel.lesson9.task3;
// Task 3. Binary Search
        /*3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
        Входящие параметры: массив и число.
        (считаем что массива который нам передали отсортирован, проверять это не нужно)*/

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {0, 1, 4, 5, 6, 7, 9, 10};
        int key = 2;

        if (binarySearch(arr, key) < 0) {
            System.out.println("В данном масиве нет искомого числа.");
        } else {
            System.out.println("В данном масиве число '" + key + "' обнаружено под индексом [" + binarySearch(arr, key) + "]");
        }
    }

    private static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int index = (left + right) / 2;

        while ((arr[index] != key) && (left <= right)) {
            if (arr[index] < key) {
                left = index + 1;
                index = (left + right) / 2;
            } else {
                right = index - 1;
                index = (left + right) / 2;
            }
        }

        if (left <= right) {
            return index;
        } else {
            return -1;
        }
    }
}
