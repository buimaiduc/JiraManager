package com.jrm.core;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.jrm.core.dao.StoryDAO;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 9/2/2017<br/>
 * Creation Time: 9:22 PM<br/>
 *
 * @author DucB<br/>
 */
public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context.xml");
        ctx.refresh();

        StoryDAO storyDAO = ctx.getBean("storyDAO", StoryDAO.class);
        System.out.println(storyDAO.getAll().size());
    }
}
