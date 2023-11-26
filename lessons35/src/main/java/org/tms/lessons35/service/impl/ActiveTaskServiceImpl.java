package org.tms.lessons35.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.tms.lessons35.config.HibernateConfig;
import org.tms.lessons35.entity.UserEntity;
import org.tms.lessons35.enumerated.Status;
import org.tms.lessons35.service.ActiveTaskService;

import javax.persistence.Query;
import java.util.List;

public class ActiveTaskServiceImpl implements ActiveTaskService {
    @Override
    public List<UserEntity> findByUser(Status status) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("select user.name from TaskEntity where status =:taskStatus");
        query.setParameter("taskStatus", status);
        List result = query.getResultList();
        transaction.commit();
        session.close();
        return result;
    }
}
