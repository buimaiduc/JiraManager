package com.jrm.core.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 7/2/2017<br/>
 * Creation Time: 4:42 PM<br/>
 *
 * @author DucB<br/>
 */
@Entity
@Table(name = "note")
public class Note implements Serializable {
    private Long id;
    private String content;
    private Story story;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    @ManyToOne
    @JoinColumn(name = "STORY_ID")
    public Story getStory() {
        return story;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
