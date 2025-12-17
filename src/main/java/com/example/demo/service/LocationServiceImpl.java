package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repositary.LocationRepositary;
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepositary Locationrepo;

    @Override
    public LocationEntity createlocation(LocationEntity location) {
        return Locationrepo.save(location);
    }

    @Override
    public List<LocationEntity> getalllocation() {
        return Locationrepo.findAll();

        
    }




}
