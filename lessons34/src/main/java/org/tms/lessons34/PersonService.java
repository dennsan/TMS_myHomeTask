package org.tms.lessons34;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.lessons34.config.HibernateConfig;
import org.tms.lessons34.entity.PersonEntity;

public class PersonService {
    public static void findById(Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        PersonEntity personEntity = session.find(PersonEntity.class, id);

        System.out.println(personEntity);
        transaction.commit();
        session.close();
    }
}
