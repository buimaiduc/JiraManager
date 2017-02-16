package com.jrm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
@Controller
public class StoryController {
    final Logger logger = LoggerFactory.getLogger(StoryController.class);
    @Autowired
    private StoryService storyService;

    @RequestMapping(value ="/list", method = RequestMethod.GET)
    public String list(Model model) {
        logger.info("Listing all stories");

        List<Story> stories = storyService.getAll();
        model.addAttribute("stories", stories);

        logger.info("No. of stories: ", stories.size());
        return "stories/list";
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String get(@RequestParam("q") String summary, Model model) {
    	logger.info("Getting stories by summary");    	
    	List<Story> stories = storyService.getBySummary(summary);
    	model.addAttribute("stories", stories);
    	
    	logger.info("No. of stories: ", stories.size());
    	return "stories/list";
    }
    
    @RequestMapping(value = "/add")
    public String add(HttpServletRequest request, Model model) {
    	if ("GET".equalsIgnoreCase(request.getMethod())) {
    		return "stories/add";
    	} else if ("POST".equalsIgnoreCase(request.getMethod())) {
    		return "stories/list";
    	}
    	return "stories/add";
    }
}
