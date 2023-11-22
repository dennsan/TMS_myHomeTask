package org.tms.lessons36.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.lessons36.config.HibernateConfig;
import org.tms.lessons36.entity.TaskEntity;
import org.tms.lessons36.entity.UserEntity;
import org.tms.lessons36.enumerated.Status;
import org.tms.lessons36.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    @Override
    public void createTask(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

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
    public void findById(int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        TaskEntity task = session.find(TaskEntity.class, id);
        System.out.println(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void findByUser(String username) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("select title from TaskEntity where user.name =:username");
        query.setParameter("username", username);
        List resultList = query.getResultList();
        System.out.println(resultList);
        transaction.commit();
        session.close();
    }
}
