package dev.pustelnikov.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dev.pustelnikov.datasource.DataSource;
import dev.pustelnikov.model.dao.UserDao;
import dev.pustelnikov.model.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void create(User user) {
	}
	
	@Override
	public void update(User user) {
	}
	
	@Override
	public void delete(User user) {
	}
	
	@Override
	public boolean isUserSignedUp(String username, String password) {
		try {
			Connection connection = DataSource.getInstance().getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
