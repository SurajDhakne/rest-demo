package com.sip.test.dto;

public class DamageDto {
	private int id;

	private String name;

	private boolean isDamage;

	public DamageDto(int id, String name, boolean isDamage) {
		super();
		this.id = id;
		this.name = name;
		this.isDamage = isDamage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isDamage() {
		return isDamage;
	}

	public void setDamage(boolean isDamage) {
		this.isDamage = isDamage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
