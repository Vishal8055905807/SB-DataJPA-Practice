package com.vishal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.entity.Worker;

public interface WorkerRepo extends JpaRepository<Worker, Integer>{

}

