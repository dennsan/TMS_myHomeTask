package com.tms.lessons14;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Denis");
        student.add("Petr");
        student.add("Vladislav");
        student.add("Evgenij");
        student.add("Denis");
        student.add("Angelina");
        student.add("Aleksej");
        student.add("Andrej");
        student.add("Dmitrij");
        student.add("Denis");
        student.add("Sergej");
        student.add("Fedor");

        /*- Вернуть количество количество людей с вашим именем (вне
        зависимости от верхнего/нижнего регистра букв)*/

        long count = student.stream()
                .map(String::toLowerCase)
                .filter(name -> "denis".equals(name))
                .count();
        System.out.println(count);

        System.out.println("///-------------///");

  /*      - Выбрать все имена, начинающиеся на "а" (вне зависимости от
        верхнего/нижнего регистра букв)*/

        student.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("///-------------///");

       /* - Отсортировать и вернуть первый элемент коллекции или
        "Empty@, если коллекция пуста*/

        student.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

    }
}
