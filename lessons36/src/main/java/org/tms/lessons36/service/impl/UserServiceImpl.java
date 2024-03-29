package org.tms.lessons36.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.lessons36.config.HibernateConfig;
import org.tms.lessons36.entity.UserEntity;
import org.tms.lessons36.service.UserService;

import javax.swing.text.html.parser.Entity;

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
}
