package org.tms.lessons18;

import java.util.Date;

public class User {
    private String name;
    private String sex;
    private String date;

    public User(String name, String sex, String date) {
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
}