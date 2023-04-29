package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Sign;
import com.example.crud.repository.SignRepository;

@Service
public class SignService {

	@Autowired
	SignRepository ur;
	
	public List<Sign> getUserDetail()
	{
		return ur.findAll();
	}

	public Sign saveUserDetail(Sign u)
	{
		return ur.save(u);
	}
}