package com.jrm.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jrm.core.domain.Story;
import com.jrm.core.service.StoryService;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 10/2/2017<br/>
 * Creation Time: 11:54 AM<br/>
 *
 * @author DucB<br/>
 */
@RequestMapping("/stories")
@Controller
public class StoryController {
    final Logger logger = LoggerFactory.getLogger(StoryController.class);
    @Autowired
    private StoryService storyService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        logger.info("Listing all stories");

        List<Story> stories = storyService.getAll();
        model.addAttribute("stories", stories);

        logger.info("No. of stories: ", stories.size());
        return "story/list";
    }
}
