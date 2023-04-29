package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {

}
