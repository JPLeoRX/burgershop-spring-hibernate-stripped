package org.moskito.demo.burgershop.burgershopstripped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        }

        catch (Exception e) {
            // Make sure you log the exception, as it might be swallowed
            e.printStackTrace();
            System.err.println("SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void saveObject(Object o) {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
    }
}
