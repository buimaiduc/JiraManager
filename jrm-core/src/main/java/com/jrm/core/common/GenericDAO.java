package com.jrm.core.common;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 8/2/2017<br/>
 * Creation Time: 3:59 PM<br/>
 *
 * @author DucB<br/>
 */
@Transactional
public interface GenericDAO<T> {
    public List<T> getAll();
    public T getById(Long id);
    public T save(T t);
    public boolean delete(T t);
}
