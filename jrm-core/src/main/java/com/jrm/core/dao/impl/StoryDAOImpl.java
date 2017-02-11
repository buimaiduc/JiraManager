package com.jrm.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.jrm.core.common.AbstractGenericDAO;
import com.jrm.core.dao.StoryDAO;
import com.jrm.core.domain.Story;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 8/2/2017<br/>
 * Creation Time: 4:25 PM<br/>
 *
 * @author DucB<br/>
 */
@Repository("storyDAO")
public class StoryDAOImpl extends AbstractGenericDAO<Story> implements StoryDAO {

    public StoryDAOImpl() {
        super(Story.class);
    }
}
