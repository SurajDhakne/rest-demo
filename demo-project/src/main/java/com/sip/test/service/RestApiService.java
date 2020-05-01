package com.sip.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sip.test.entity.DamageImage;
import com.sip.test.repository.DamageRepository;

@Service
public class RestApiService {
	@Autowired
	DamageRepository repository;
	
	public DamageImage addDamageImage(DamageImage dImage) {
		return repository.save(dImage); 
	}

}
