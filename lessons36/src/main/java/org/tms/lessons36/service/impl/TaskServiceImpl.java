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
}
