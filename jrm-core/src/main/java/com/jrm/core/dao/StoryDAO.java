package com.jrm.core.dao;

import java.util.List;

import com.jrm.core.common.GenericDAO;
import com.jrm.core.domain.Story;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 8/2/2017<br/>
 * Creation Time: 4:22 PM<br/>
 *
 * @author DucB<br/>
 */
public interface StoryDAO extends GenericDAO<Story> {
	public List<Story> getBySummary(String summary);
}
