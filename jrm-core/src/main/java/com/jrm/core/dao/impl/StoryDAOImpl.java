package com.jrm.core.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Story> getBySummary(String summary) {
		if (summary == null || summary.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		
		String queryString = "from Story s where s.summary LIKE :summary";
		Query query = getCurrentSession().createQuery(queryString);
		query.setParameter("summary", "%" + summary + "%");
		if (query.getResultList().size() == 0) {
			return Collections.EMPTY_LIST;
		}
		
		return query.getResultList();
	}
}
