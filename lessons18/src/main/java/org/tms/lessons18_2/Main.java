package org.tms.lessons18_2;

import org.tms.lessons18_2.service.impl.CityServiceImpl;
import org.tms.lessons18_2.service.impl.UserServiceImpl;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        City city = new City("Minsk");
        City city1 = new City("Brest");
        City city2 = new City("Grodno");
        City city3 = new City("Slonim");
        City city4 = new City("Sluck");
        City city5 = new City("Bereza");
        City city6 = new City("Homsk");
        City city7 = new City("Vitebsk");

        CityServiceImpl cityService = new CityServiceImpl();
        cityService.addCity(city);
        cityService.addCity(city1);
        cityService.addCity(city2);
        cityService.addCity(city3);
        cityService.addCity(city4);
        cityService.addCity(city5);
        cityService.addCity(city6);
        cityService.addCity(city7);



        User user = new User("Ivan", "men", "1999-05-03", 1);
        User user1 = new User("Polina", "women", "1995-01-14",2);
        User user2 = new User("Petr", "men", "1997-04-09", 5);
        User user3 = new User("Angelina", "women", "2001-01-02",6);
        User user4 = new User("Platon", "men", "1999-09-09",3);
        User user5 = new User("Sidor", "men", "2003-07-24", 8);
        User user6 = new User("Marina", "women", "2000-11-22",2);
        User user7 = new User("Alina", "women", "2005-12-31",3);
        User user8 = new User("Kent", "men", "1998-10-02",4);
        User user9 = new User("Ignat", "men", "1990-05-31",7);
        User user10 = new User("Boris", "men", "2004-06-16",4);
        User user11 = new User("Semen", "men", "1990-01-02",1);
        User user12 = new User("Svetlana", "women", "1997-03-06",8);

        UserServiceImpl userService = new UserServiceImpl();

        userService.save(user);
        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);
        userService.save(user9);
        userService.save(user10);
        userService.save(user11);
        userService.save(user12);

        List<User> userList = userService.printInfo();

            System.out.println(userList);




    }
}