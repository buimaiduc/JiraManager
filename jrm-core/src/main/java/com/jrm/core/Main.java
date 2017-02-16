package com.jrm.core;

import java.util.Date;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.jrm.core.dao.StoryDAO;
import com.jrm.core.domain.Story;
import com.jrm.core.service.StoryService;

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

        StoryService storyService = ctx.getBean("storyService", StoryService.class);
        Story story = new Story();
        story.setSummary("DSA-10");
        story.setDescription("DSA-10");
        story.setLink("DSA-10");
        story.setStoryNumber("DSA-10");
        story.setCreationDate(new Date());
        story.setUpdatedDate(new Date());
        storyService.save(story);
        
    }
}
