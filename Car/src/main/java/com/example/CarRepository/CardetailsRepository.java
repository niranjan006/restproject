package com.example.CarRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Car.model.Car;

@Repository
public interface CardetailsRepository extends JpaRepository <Car,Integer>{

}
