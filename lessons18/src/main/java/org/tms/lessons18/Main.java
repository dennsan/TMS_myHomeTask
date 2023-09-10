package org.tms.lessons18;

import org.tms.lessons18.service.impl.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Ivan", "men", "1999-05-03");
        User user1 = new User("Polina", "women", "1995-01-14");
        User user2 = new User("Petr", "men", "1997-04-09");
        User user3 = new User("Angelina", "women", "2001-01-02");
        User user4 = new User("Platon", "men", "1999-09-09");
        User user5 = new User("Sidor", "men", "2003-07-24");
        User user6 = new User("Marina", "women", "2000-11-22");
        User user7 = new User("Alina", "women", "2005-12-31");
        User user8 = new User("Kent", "men", "1998-10-02");
        User user9 = new User("Ignat", "men", "1990-05-31");
        User user10 = new User("Boris", "men", "2004-06-16");
        User user11 = new User("Semen", "men", "1990-01-02");
        User user12 = new User("Svetlana", "women", "1997-03-06");

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