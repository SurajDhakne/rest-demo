package com.sip.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sip.test.entity.DamageImage;
import com.sip.test.repository.DamageRepository;
import com.sip.test.response.DamageApiResponse;

@Service
public class RestApiService {
	@Autowired
	DamageRepository repository;
	HttpStatus status;
	public DamageImage addDamageImage(DamageImage dImage) {
		
//		DamageImage dm= repository.save(dImage);
//		DamageApiResponse ff= new DamageApiResponse(dm,null,status.OK,"ok",false);
		return repository.save(dImage); 
	}

}
