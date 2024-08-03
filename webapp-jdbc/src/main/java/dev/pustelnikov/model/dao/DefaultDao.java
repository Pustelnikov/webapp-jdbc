package dev.pustelnikov.model.dao;

public interface DefaultDao<T> {

	public void create(T entity);
	public void update(T entity);
	public void delete(T entity);
}
