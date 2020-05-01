package com.sip.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DamageImage {
	@Id
	@GeneratedValue
	private int id;

	private String name;

	private boolean isDamage;

	public DamageImage(int id, String name, boolean isDamage) {
		super();
		this.id = id;
		this.name = name;
		this.isDamage = isDamage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDamage() {
		return isDamage;
	}

	public void setDamage(boolean isDamage) {
		this.isDamage = isDamage;
	}
}
