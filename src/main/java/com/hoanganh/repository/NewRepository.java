package com.hoanganh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoanganh.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long>{
	
}
