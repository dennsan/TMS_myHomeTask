package org.tms.lessons35.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.lessons35.config.HibernateConfig;
import org.tms.lessons35.entity.TaskEntity;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
            session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateUser(UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

            session.update(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        UserEntity user = session.find(UserEntity.class, id);
        session.delete(user);
        transaction.commit();
        session.close();

    }

    @Override
    public void deleteAllUsers() {
        setNullForUser();
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.createQuery("delete from UserEntity")
                .executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void findByID(int idUser) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        UserEntity user = session.find(UserEntity.class, idUser);
        System.out.println(user);
        transaction.commit();
        session.close();

    }

    public void setNullForUser(){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        List list = session.createQuery("from TaskEntity ").list();
        int size = list.size();
        for (int i = 1; i <= size; i++) {
            TaskEntity task = session.find(TaskEntity.class, i);
            task.setUser(null);
            session.update(task);
        }
        transaction.commit();
        session.close();
    }
}
