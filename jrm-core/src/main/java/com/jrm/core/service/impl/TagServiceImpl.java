package com.jrm.core.service.impl;

import com.jrm.core.dao.TagDAO;
import com.jrm.core.domain.Tag;
import com.jrm.core.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 16/2/2017<br/>
 * Creation Time: 5:10 PM<br/>
 *
 * @author DucB<br/>
 */
@Service("tagService")
@Transactional
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDAO tagDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Tag> getAll() {
        return tagDAO.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tag getById(Long id) {
        return tagDAO.getById(id);
    }

    @Override
    public Tag save(Tag tag) {
        return tagDAO.save(tag);
    }

    @Override
    public boolean delete(Tag tag) {
        return tagDAO.delete(tag);
    }
}
