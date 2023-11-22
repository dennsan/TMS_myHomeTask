package org.tms.lessons36.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tms.lessons36.entity.TaskEntity;
import org.tms.lessons36.entity.UserEntity;

public class HibernateConfig {
    private static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .setProperty("hibernate.connection.url","jdbc:postgresql://localhost:5432/users_task")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "postgres")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.hbm2ddl.auto", "create-drop")
                .addAnnotatedClass(UserEntity.class)
                .addAnnotatedClass(TaskEntity.class)
                .buildSessionFactory();
    }

    public static Session create(){
        return sessionFactory.openSession();
    }
}
