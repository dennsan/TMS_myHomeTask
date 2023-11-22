package org.tms.lessons36.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.tms.lessons36.config.HibernateConfig;
import org.tms.lessons36.enumerated.Status;
import org.tms.lessons36.service.ActiveTaskService;

import java.util.List;

public class ActiveTaskServiceImpl implements ActiveTaskService {
    @Override
    public void findByUser(Status status) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("select user.name from TaskEntity where status =:taskStatus");
        query.setParameter("taskStatus",status);
        List result = query.getResultList();
        System.out.println(result);
        transaction.commit();
        session.close();
    }
}
