package org.zigi.programming.designpattern.repository;

import java.util.List;

public interface IRepository<T, K> {
	public List<T> read();

	public T read(K key);

	public T create(T entity);

	public T update(T entity);

	public T delete(T entity);
}
