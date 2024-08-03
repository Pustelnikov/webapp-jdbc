package dev.pustelnikov.model.dao;

import dev.pustelnikov.model.entity.User;

public interface UserDao extends DefaultDao<User> {

	public boolean isUserSignedUp(String username, String password);
}
