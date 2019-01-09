package org.zigi.programming.designpattern.repository;

import java.util.Date;

public class Article {
	private static Long globalId = 1L;

	private Long id;
	private String title;
	private Date published;
	private String author;

	public Article(String title, String author, Date published) {
		this.id = globalId++;
		this.title = title;
		this.author = author;
		this.published = published;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
