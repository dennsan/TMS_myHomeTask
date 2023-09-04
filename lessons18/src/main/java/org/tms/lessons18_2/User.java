package org.tms.lessons18_2;

public class User {
    private int id;
    private String name;
    private String sex;
    private String date;

    private int cityId;

    private String city;

    public User(String name, String sex, String date, int cityId) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.cityId = cityId;
    }

    public User(int id, String name, String sex, String date, String city) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.city = city;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                ", cityId=" + cityId +
                ", city='" + city + '\'' +
                '}';
    }
}