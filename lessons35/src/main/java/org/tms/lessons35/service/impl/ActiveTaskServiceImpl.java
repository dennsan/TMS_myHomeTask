package org.tms.lessons35.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.tms.lessons35.config.HibernateConfig;
import org.tms.lessons35.enumerated.Status;
import org.tms.lessons35.service.ActiveTaskService;

import java.util.List;

public class ActiveTaskServiceImpl implements ActiveTaskService {
    @Override
    public void findByUser(String status) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        NativeQuery nativeQuery = session.createNativeQuery("select u.name from users_task.public.users u join users_task.public.task t on u.id = t.user_id where t.status =:taskStatus");
        nativeQuery.setParameter("taskStatus", status.toUpperCase());
        List result = nativeQuery.getResultList();
        System.out.println(result);
        transaction.commit();
        session.close();
    }
}
