package com.jrm.core.service.impl;

import com.jrm.core.dao.StoryDAO;
import com.jrm.core.domain.Story;
import com.jrm.core.service.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 8/2/2017<br/>
 * Creation Time: 9:28 PM<br/>
 *
 * @author DucB<br/>
 */
@Service("storyService")
@Transactional
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryDAO storyDAO;

    @Transactional(readOnly = true)
    public List<Story> getAll() {
        return storyDAO.getAll();
    }

    public Story getById(Long id) {
        return storyDAO.getById(id);
    }

    public Story save(Story story) {
        return storyDAO.save(story);
    }

    public boolean delete(Story story) {
        return storyDAO.delete(story);
    }
}
