package com.tms.lessons11;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] myList;
    private int size;

    private final int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        myList = (T[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int size) {
        myList = (T[]) new Object[size];
    }

    public void add(T t) {

        if (myList[myList.length - 1] != null) {
            int newSize = myList.length * 2;
            myList = Arrays.copyOf(myList, newSize);
            myList[size++] = t;
        } else {
            myList[size++] = t;
        }
    }

    public void delete(T t) {
        for (int i = 0; i < size; i++) {
            if (myList[i] == t) {
                myList[i] = myList[i + 1];
                while (myList[i] != null) {
                    myList[i] = myList[i + 1];
                    i++;
                }
            }
        }
        size--;
    }

    public void indexEl(int index) {
        System.out.println("Element number " + index + ":" + myList[index]);
    }

    public void searchEl(T t) {
        int count = 0;
        for (T item : myList) {
            if (item == t) {
                count++;
            }
        }
        System.out.println("Element " + t + " found in colection " + count + " times");
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            myList[i] = null;
        }
    }

    public void print() {
        for (T t : myList) {
            System.out.print(t + " ");
        }
    }

}
