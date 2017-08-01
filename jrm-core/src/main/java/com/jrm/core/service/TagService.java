package com.jrm.core.service;

import com.jrm.core.domain.Tag;

import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 16/2/2017<br/>
 * Creation Time: 5:09 PM<br/>
 *
 * @author DucB<br/>
 */
public interface TagService {
    public List<Tag> getAll();
    public Tag getById(Long id);
    public Tag save(Tag tag);
    public boolean delete(Tag tag);
}

