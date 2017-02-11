package com.jrm.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * ####################################################<br/>
 * Copyright © Duc Bui - 2017<br/>
 * ####################################################<br/>
 * Creation date: 7/2/2017<br/>
 * Creation Time: 4:51 PM<br/>
 *
 * @author DucB<br/>
 */
@Entity
@Table(name = "story")
public class Story implements Serializable {
    private Long id;
    private String summary;
    private String description;
    private Set<Project> projects;
    private Set<Note> notes;
    private String link;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Column(name = "SUMMARY")
    public String getSummary() {
        return summary;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Project> getProjects() {
        return projects;
    }

    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Note> getNotes() {
        return notes;
    }

    @Column(name = "LINK")
    public String getLink() {
        return link;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
