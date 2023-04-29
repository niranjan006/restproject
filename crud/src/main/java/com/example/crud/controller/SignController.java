package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Sign;
import com.example.crud.service.SignService;

@RestController
public class SignController {
    @Autowired
	SignService us;
    
    @GetMapping("/getuser")
    public List<Sign> getUserDetail()
    {
    	return us.getUserDetail();
    }
    
    
    @PostMapping("/saveuser")
    public Sign saveUserDetail(@RequestBody Sign u)
    {
    	return us.saveUserDetail(u);
    }
}
