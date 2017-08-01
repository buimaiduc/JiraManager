package com.jrm.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
    private Project project;
    private Set<Note> notes;
    private Set<Tag> tags;
    private String link;
    private String storyNumber;
    private Date creationDate;
    private Date updatedDate;
    private List<String> attachments;

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

    @Lob
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

//    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, orphanRemoval = true)
    @ManyToOne
    @JoinColumn(name = "STORY_ID")
    public Project getProject() {
        return project;
    }

    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, orphanRemoval = true)
//    @ManyToOne
//    @JoinColumn(name = "STORY_ID")
    public Set<Note> getNotes() {
        return notes;
    }
    
    @ManyToMany
    @JoinTable(name = "story_to_tag",
    joinColumns = {@JoinColumn(name = "STORY_ID")},
    inverseJoinColumns = {@JoinColumn(name = "TAG_ID")})
    public Set<Tag> getTags() {
    	return tags;
    }

    @Column(name = "LINK")
    public String getLink() {
        return link;
    }
    
    @Column(name = "STORY_NUMBER")
    public String getStoryNumber() {
		return storyNumber;
	}

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE")
	public Date getCreationDate() {
		return creationDate;
	}

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE")
	public Date getUpdatedDate() {
		return updatedDate;
	}

    @ElementCollection
    @Column(name = "ATTACHMENTS")
	public List<String> getAttachments() {
		return attachments;
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

    public void setProject(Project project) {
        this.project = project;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
    
    public void setTags(Set<Tag> tags) {
    	this.tags = tags;
    }

    public void setLink(String link) {
        this.link = link;
    }

	public void setStoryNumber(String storyNumber) {
		this.storyNumber = storyNumber;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}
}
