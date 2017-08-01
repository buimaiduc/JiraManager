package com.jrm.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * * Creation date: 7/2/2017<br/>
 * Creation Time: 4:50 PM<br/>
 *
 * @author DucB<br/>
 */
@Entity
@Table(name = "project")
public class Project implements Serializable {
    private Long id;
    private String name;
    private Set<Story> stories;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

//    @ManyToOne
//    @JoinColumn(name = "STORY_ID")
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Story> getStories() {
        return stories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStories(Set<Story> stories) {
        this.stories = stories;
    }
}
