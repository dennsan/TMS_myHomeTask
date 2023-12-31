package org.tms.lessons35;

import org.tms.lessons35.entity.TaskEntity;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Role;
import org.tms.lessons35.enumerated.Status;
import org.tms.lessons35.service.impl.ActiveTaskServiceImpl;
import org.tms.lessons35.service.impl.TaskServiceImpl;
import org.tms.lessons35.service.impl.UserServiceImpl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserEntity user = UserEntity.builder()
                .name("user1")
                .sex("women")
                .role(Role.USER)
                .birthday(new Date())
                .build();
        UserEntity user2 = UserEntity.builder()
                .name("user2")
                .sex("men")
                .role(Role.ADMIN)
                .birthday(new Date())
                .build();

        TaskEntity task = TaskEntity.builder()
                .title("move")
                .description("move smt")
                .status(Status.NEW)
                .build();
        TaskEntity task1 = TaskEntity.builder()
                .title("put")
                .description("put smt")
                .status(Status.IN_PROGRESS)
                .build();


        UserServiceImpl service = new UserServiceImpl();
        service.saveUser(user);
        service.saveUser(user2);

        TaskServiceImpl taskService = new TaskServiceImpl();
        taskService.createTask(task,user);
        taskService.createTask(task1,user2);
        taskService.createTask(task1,user);
        taskService.updateTask(task, Status.DONE);

        List<UserEntity> user1 = taskService.findByUser("user1");
        Object[] array = user1.toArray();
        for (Object item: array){
            System.out.println( item);
        }

        ActiveTaskServiceImpl activeTaskService = new ActiveTaskServiceImpl();
        List<UserEntity> userList = activeTaskService.findByUser(Status.IN_PROGRESS);
        Object[] userListArray = userList.toArray();
        for (Object arr : userListArray) {
            System.out.println(arr);
        }

        service.deleteAllUsers();

    }
}