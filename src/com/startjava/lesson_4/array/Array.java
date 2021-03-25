package com.startjava.lesson_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите длину массива: ");
		int arrayLength = scanner.nextInt();
		int[] numbers = new int[arrayLength];

		System.out.print("Заполните массив целыми числами через пробел: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("Исходный массив: " + Arrays.toString(numbers));

		//	сортировка массива
		System.out.print("Отсортированный массив: ");
		Arrays.sort(numbers);
		for (int numb : numbers) {
			System.out.print(numb + " ");
		}
		System.out.println();

		// Сумма четных положительных элементов массива
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 == 0 && number >= 0) {
				sum += number;
			}
		}
		System.out.println("Cумма четных положительных элиментов = " + sum);
	}
}