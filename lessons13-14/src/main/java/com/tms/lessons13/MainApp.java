package com.tms.lessons13;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> randomStream = new ArrayList<>();

        for (int i = 0; i < random.nextInt(1000); i++) {
            randomStream.add(random.nextInt(500));
        }
//        - Удалить дубликаты

        randomStream.stream()
                .limit(500)
                .distinct()
                .forEach(System.out::println);

//        - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)

        System.out.println("///-------------///");

        randomStream.stream()
                .limit(500)
                .filter(integer -> integer % 2 == 0 && integer >= 7 && integer <= 17)
                .forEach(System.out::println);

//        - Каждый элемент умножить на 2

        System.out.println("///-------------///");

        randomStream.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);

//        - Отсортировать и вывести на экран первых 4 элемента

        System.out.println("///-------------///");

        randomStream.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);

//        - Вывести количество элементов в стриме

        System.out.println("///-------------///");

        long count = randomStream.stream()
                .mapToLong(x -> x)
                .count();
        System.out.println(count);

//        - Вывести среднее арифметическое всех чисел в стриме

        System.out.println("///-------------///");

        OptionalDouble average = randomStream.stream()
                .mapToInt(x -> x)
                .average();
        System.out.println(average.orElse(0));
    }

}
