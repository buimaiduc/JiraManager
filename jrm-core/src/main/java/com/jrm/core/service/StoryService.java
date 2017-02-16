package com.jrm.core.service;

import java.util.List;

import com.jrm.core.domain.Story;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * * Creation date: 8/2/2017<br/>
 * Creation Time: 9:24 PM<br/>
 *
 * @author DucB<br/>
 */
public interface StoryService {
    public List<Story> getAll();
    public Story getById(Long id);
    public Story save(Story story);
    public boolean delete(Story story);
    public List<Story> getBySummary(String summary);
}
