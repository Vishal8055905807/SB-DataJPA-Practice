package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.PanCard;

public interface PanCardRepo extends JpaRepository<PanCard, Integer>{

}
