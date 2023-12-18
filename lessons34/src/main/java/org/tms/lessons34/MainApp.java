package org.tms.lessons34;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tms.lessons34.config.HibernateConfig;
import org.tms.lessons34.entity.PersonEntity;
import org.tms.lessons34.entity.PhoneEntity;

import java.util.Date;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        PersonEntity person = PersonEntity.builder()
                .work(true)
                .dateWork(new Date())
                .name("Person1")
                .department(Department.IT)
                .build();
        session.save(person);

        PhoneEntity phone = PhoneEntity.builder()
                .number(12345667)
                .person(List.of(person))
                .build();
        session.save(phone);

        person.setPhone(phone);

        transaction.commit();
        session.close();

        PersonService.findById(1);
    }
}
