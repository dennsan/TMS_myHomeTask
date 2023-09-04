package org.tms.lessons18;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String sex;
    private String date;

    public User(String name, String sex, String date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public User(int id, String name, String sex, String date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}