package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.VehicleOwner;

public interface VehicleOwnerRepo extends JpaRepository<VehicleOwner, Integer> {

}

