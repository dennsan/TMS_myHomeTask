package org.tms.lessons36;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.tms.lessons36.config.HibernateConfig;
import org.tms.lessons36.dto.PersonSearchDto;
import org.tms.lessons36.entity.TaskEntity;
import org.tms.lessons36.entity.UserEntity;
import org.tms.lessons36.enumerated.Role;
import org.tms.lessons36.enumerated.Status;
import org.tms.lessons36.service.impl.TaskServiceImpl;
import org.tms.lessons36.service.impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.nonNull;

public class Main {
    public static void main(String[] args) {



        UserEntity user = UserEntity.builder()
                .name("user1")
                .sex("women")
                .role(Role.USER)
                .birthday(LocalDate.now())
                .build();
        UserEntity user2 = UserEntity.builder()
                .name("user2")
                .sex("men")
                .role(Role.ADMIN)
                .birthday(LocalDate.now())
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
        user.addTask(task);
        user2.addTask(task1);
        TaskServiceImpl taskService = new TaskServiceImpl();
        taskService.createTask(task);
        taskService.createTask(task1);



        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        var search = PersonSearchDto.builder()
                .name("user1")
                .role(Role.USER)
                .from(LocalDate.of(2023,11,1))
                .to(LocalDate.of(2023,11,30))
                .status(Status.IN_PROGRESS)
                .build();


            Criteria criteria = session.createCriteria(UserEntity.class, "user");
            List result;

            if(search ==null)
                result= criteria.list();
            else {
                if (search.getName() != null && !search.getName().isBlank()) {
                    criteria.add(Restrictions.eq("name", search.getName()));
                }
            if(search.getRole()!=null && !search.getRole().name().isBlank()){
                criteria.add(Restrictions.eq("role", search.getRole()));
            }
            if(search.getFrom()!=null && search.getTo()!=null){
                criteria.add(Restrictions.between("birthday",search.getFrom(),search.getTo()));
            }
                criteria.createAlias("user.tasks", "task");
                criteria.add(Restrictions.eq("user.tasks.status",search.getStatus()));
            }


        result = criteria.list();

        System.out.println(result);
        transaction.commit();
        session.close();


    }
}