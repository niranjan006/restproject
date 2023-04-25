package com.example.scrap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.scrap.model.ScrapClass;

@Repository
public interface ScraprepClass extends JpaRepository <ScrapClass,Integer>{

}
