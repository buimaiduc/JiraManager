package com.jrm.core.domain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * * Creation date: 5/17/2017<br/>
 * Creation Time: 10:40 PM<br/>
 *
 * @author DucB<br/>
 */
public class SessionUtil {
    private static final SessionUtil instance = new SessionUtil();
    private final SessionFactory factory;

    private SessionUtil() {
        Configuration configuration = new Configuration();
        configuration.configure();
        factory = configuration.buildSessionFactory();
    }

    public static Session getSession() {
        return getInstance().factory.openSession();
    }

    private static SessionUtil getInstance() {
        return instance;
    }
}
