package dev.pustelnikov.model.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dev.pustelnikov.datasource.DataSource;
import dev.pustelnikov.model.dao.HomeDeviceDao;
import dev.pustelnikov.model.entity.HomeDevice;

public class HomeDeviceDaoImpl implements HomeDeviceDao {

	@Override
	public void create(HomeDevice entity) {
	}

	@Override
	public void update(HomeDevice entity) {
	}

	@Override
	public void delete(HomeDevice entity) {
	}

	@Override
	public List<HomeDevice> getDevices() {
		try {
			Connection connection = DataSource.getInstance().getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM home_device");
			List<HomeDevice> devices = new ArrayList<>();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String description = resultSet.getString("description");
				int power = resultSet.getInt("power");
				boolean status = false;
				HomeDevice device = new HomeDevice(id, description, power, status);
				devices.add(device);
			}
			return devices;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
