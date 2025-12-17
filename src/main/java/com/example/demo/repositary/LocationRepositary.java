package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LocationEntity;

public interface LocationRepositary extends JpaRepository<LocationEntity,Long> {

    
    
}
