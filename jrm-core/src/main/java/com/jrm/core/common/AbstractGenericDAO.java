package com.jrm.core.common;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 8/2/2017<br/>
 * Creation Time: 4:01 PM<br/>
 *
 * @author DucB<br/>
 */
public class AbstractGenericDAO<T> implements GenericDAO<T> {

    private Class<T> type;
    @Autowired
    private SessionFactory sessionFactory;

    protected AbstractGenericDAO(Class<T> type) {
        super();
        this.type = type;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<T> getAll() {
        return getCurrentSession().createQuery("from " + type.getName() + " t").list();
    }

    public T getById(Long id) {
        if (id == null)
            return null;
        return (T) getCurrentSession().get(type.getName(), id);
    }

    public T save(T t) {
        try {
            getCurrentSession().persist(t);
        } catch(HibernateException ex) {
            return null;
        }
        return t;
    }

    public boolean delete(T t) {
        try {
            getCurrentSession().delete(t);
        } catch(HibernateException ex) {
            return false;
        }
        return true;
    }
}
