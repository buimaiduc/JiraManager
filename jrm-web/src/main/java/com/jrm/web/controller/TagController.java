package com.jrm.web.controller;

import com.jrm.core.domain.Tag;
import com.jrm.core.service.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 16/2/2017<br/>
 * Creation Time: 4:20 PM<br/>
 *
 * @author DucB<br/>
 */
@Controller
@RequestMapping(value = "/tags")
public class TagController {
	final Logger logger = LoggerFactory.getLogger(StoryController.class);
	
	@Autowired
	private TagService tagService;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		logger.info("Listing all tags");
		
		List<Tag> tags = tagService.getAll();
		model.addAttribute("tags", tags);
		
		logger.info("No. of tags: " + tags.size());


		return "tags/list";
	}
	
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		if ("GET".equalsIgnoreCase(request.getMethod())) {
			logger.info("Adding new tag");
			return "tags/add";
		} else if ("POST".equalsIgnoreCase(request.getMethod())) {
			logger.info("Saving new tag");
			Tag tag = new Tag();
			tag.setName(request.getParameter("tagName"));
			tag.setDescription(request.getParameter("tagDescription"));
			tagService.save(tag);
			
			logger.info("Saved new tag");
			logger.info("Listing all tags");
			
			List<Tag> tags = tagService.getAll();
			model.addAttribute("tags", tags);
			
			logger.info("No. of tags: " + tags.size());
			
			return "tags/list";
		}
		return "tags/add";
	}

	@RequestMapping(value = "/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Tag tag = tagService.getById(id);
		model.addAttribute(tag);
		return "tags/detail";
	}

	@RequestMapping(value = "amend", method = RequestMethod.POST, params = "operation=Delete")
	public String delete(HttpServletRequest request, Model model) {
		Long id = Long.valueOf(request.getParameter("tagId"));
		Tag tag = tagService.getById(id);
		tagService.delete(tag);

		return "redirect:/tags/list";
	}

	@RequestMapping(value = "amend", method = RequestMethod.POST, params = "operation=Update")
	public String update(HttpServletRequest request, Model model) {
		return "";
	}


	@RequestMapping(value = "/test")
	public String test(HttpServletRequest request, Model model) {
		return "redirect:/tags/list";
	}
}
