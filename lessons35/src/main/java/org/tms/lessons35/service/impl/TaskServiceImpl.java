package org.tms.lessons35.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
        Query query = session.createQuery("select  title from TaskEntity where user.name =:username");
        query.setParameter("username", username);
        List resultList = query.getResultList();
        System.out.println(resultList.toString());

        transaction.commit();
        session.close();


    }


}
