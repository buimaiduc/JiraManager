package com.jrm.core.domain;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 5/16/2017<br/>
 * Creation Time: 10:50 PM<br/>
 *
 * @author DucB<br/>
 */
public class GenericTest {

    @BeforeClass
    public static void setup() {
        SessionUtil.getSession();
    }

    @AfterClass
    public static void shutdown() {
        SessionUtil.getSession().getTransaction().rollback();
        SessionUtil.getSession().close();
    }
}
