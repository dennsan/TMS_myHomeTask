package org.tms.lessons18_2;

public class User {
    private String name;
    private String sex;
    private String date;

    private int cityId;

    public User(String name, String sex, String date, int cityId) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}