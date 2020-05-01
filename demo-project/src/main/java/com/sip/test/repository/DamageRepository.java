package com.sip.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sip.test.entity.DamageImage;

public interface DamageRepository extends JpaRepository<DamageImage,Integer> {

}
