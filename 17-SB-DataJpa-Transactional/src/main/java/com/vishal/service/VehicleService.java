package com.vishal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.entity.Vehicle;
import com.vishal.entity.VehicleOwner;
import com.vishal.repo.VehicleOwnerRepo;
import com.vishal.repo.VehicleRepo;

import jakarta.transaction.Transactional;

@Service
public class VehicleService {
	

	@Autowired
VehicleRepo vehicleRepo;

	@Autowired
VehicleOwnerRepo vehicleOwnerRepo;

@Transactional	
public void saveVehicleAndOwner() {
	
	
	Vehicle v = new Vehicle();
	v.setVehicleName("Jet");
	
	vehicleRepo.save(v);
	
	
	int a = 10/0;
	
	VehicleOwner vOwner = new VehicleOwner();
	
	vOwner.setOwnerName("Digvijay");
	
	vehicleOwnerRepo.save(vOwner); 
	
	
	
	
	
}
	
}
