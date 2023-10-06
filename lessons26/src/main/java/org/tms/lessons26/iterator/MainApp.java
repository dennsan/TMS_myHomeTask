package org.tms.lessons26.iterator;


import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "PostgrSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Denis", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println(javaDeveloper.getName() + " have skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
