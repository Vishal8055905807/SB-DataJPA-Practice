package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.Vehicle;

public interface VehicleRepo  extends JpaRepository<Vehicle, Integer>{

}
