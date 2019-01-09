package org.zigi.programming.designpattern.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileArticleRepository implements IArticleRepository {

	private Map<Long, Article> articles;

	public List<Article> read() {
		if (articles == null)
			return null;

		return new ArrayList<Article>(articles.values());
	}

	public Article read(Long key) {
		if (articles == null)
			return null;

		return articles.get(key);
	}

	public Article create(Article entity) {
		if (entity == null || entity.getId() == null)
			return null;

		if (articles == null)
			articles = new HashMap<Long, Article>();
		else if (articles.containsKey(entity.getId()))
			return null;

		articles.put(entity.getId(), entity);
		return entity;
	}

	public Article update(Article entity) {
		if (entity == null || articles == null || entity.getId() == null)
			return null;

		Long id = entity.getId();
		Article selected = articles.get(id);
		if (selected != null)
			articles.put(id, entity);
		return articles.get(id);
	}

	public Article delete(Article entity) {
		if (articles == null || entity == null || entity.getId() == null)
			return null;
		return articles.remove(entity.getId());
	}

	public Article readLatest() {
		if (articles == null)
			return null;

		Date maxDate = null;
		Long id = null;
		for (Article a : articles.values()) {
			Date published = a.getPublished();
			if (published != null && (maxDate == null || maxDate.before(published))) {
				maxDate = published;
				id = a.getId();
			}
		}

		if (id == null)
			return null;

		return articles.get(id);
	}

	public List<Article> readByAuthor(String author) {
		if (articles == null || author == null)
			return null;

		List<Article> result = new ArrayList<Article>();
		for (Article a : articles.values()) {
			String auth = a.getAuthor();
			if (auth != null && auth.equals(author)) {
				result.add(a);
			}
		}

		return result;
	}

}
