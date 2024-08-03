package dev.pustelnikov.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import dev.pustelnikov.model.dao.HomeDeviceDao;
import dev.pustelnikov.model.dao.impl.HomeDeviceDaoImpl;
import dev.pustelnikov.model.entity.HomeDevice;

public class HomeDeviceService {
	
	private List<HomeDevice> devices;
	
	public HomeDeviceService() {
		HomeDeviceDao dao = new HomeDeviceDaoImpl();
		devices = dao.getDevices();
	}
	
	public List<HomeDevice> getDevices() {
		return devices;
	}

	public void sortByPower() {
		devices.sort(Comparator.comparing(d -> d.getPower()));
	}
	
	public List<HomeDevice> filterByPowerRange(int fromPower, int toPower) {
		List<HomeDevice> filteredByPowerDevices = devices.stream()
				.filter(d -> d.getPower() >= fromPower && d.getPower() <= toPower)
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredByPowerDevices;
	}
	
	public int calculatePowerOfTurnedOnDevices() {
		int sum = devices.stream()
				.filter(d -> d.isStatus() == true)
				.mapToInt(d -> d.getPower())
				.sum();
		return sum;
	}
}
