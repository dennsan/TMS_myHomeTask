package org.tms.lessons35.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.tms.lessons35.config.HibernateConfig;
import org.tms.lessons35.entity.TaskEntity;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Status;
import org.tms.lessons35.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public void createTask(TaskEntity task, UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        task.setUser(user);
        session.save(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateTask(TaskEntity task, Status status) {

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        task.setStatus(status);
        session.update(task);
        transaction.commit();
        session.close();

    }

    @Override
    public void findById(int idTask) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
       TaskEntity task = session.find(TaskEntity.class, idTask);
        System.out.println(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void findByUser(String username) {

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        NativeQuery nativeQuery = session.createNativeQuery("select t.title from users_task.public.users u join users_task.public.task t on u.id = t.user_id where u.name =:username");
        nativeQuery.setParameter("username", username);
        List resultList = nativeQuery.getResultList();
        System.out.println(resultList.toString());

        transaction.commit();
        session.close();


    }


}
