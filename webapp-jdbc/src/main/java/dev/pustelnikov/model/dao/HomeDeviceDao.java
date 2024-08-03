package dev.pustelnikov.model.dao;

import java.util.List;
import dev.pustelnikov.model.entity.HomeDevice;

public interface HomeDeviceDao extends DefaultDao<HomeDevice> {
	
	public List<HomeDevice> getDevices();
}
