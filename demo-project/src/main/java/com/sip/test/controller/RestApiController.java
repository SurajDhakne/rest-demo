package com.sip.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sip.test.entity.DamageImage;
import com.sip.test.repository.DamageRepository;
import com.sip.test.service.RestApiService;

@RestController
public class RestApiController {	
	@Autowired
	RestApiService service;
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	@PostMapping("/image")	
	DamageImage addDamageImage(@RequestBody DamageImage dImage) {
	 return service.addDamageImage(dImage);
	}
}
