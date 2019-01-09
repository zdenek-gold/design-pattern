package org.zigi.programming.designpattern.repository;

import java.util.List;

public interface IArticleRepository extends IRepository<Article, Long> {
	public Article readLatest();

	public List<Article> readByAuthor(String author);
}
