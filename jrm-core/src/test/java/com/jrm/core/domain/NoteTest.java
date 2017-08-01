package com.jrm.core.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 5/16/2017<br/>
 * Creation Time: 10:46 PM<br/>
 *
 * @author DucB<br/>
 */
public class NoteTest extends GenericTest {

    @Test
    public void test() {
        Note note = new Note();
        note.setContent("abc");
        assertEquals("Compare content of note", note.getContent(), "abc");
    }
}
