package com.jrm.core.dao.impl;

import com.jrm.core.common.AbstractGenericDAO;
import com.jrm.core.dao.TagDAO;
import com.jrm.core.domain.Tag;
import org.springframework.stereotype.Repository;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 16/2/2017<br/>
 * Creation Time: 10:26 PM<br/>
 *
 * @author DucB<br/>
 */
@Repository("tagDAO")
public class TagDAOImpl extends AbstractGenericDAO<Tag> implements TagDAO {

    protected TagDAOImpl() {
        super(Tag.class);
    }
}
