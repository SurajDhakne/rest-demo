package com.sip.test.dto;

import java.util.List;

public class DamageImageDto {
	private String imageName;
	private String comment;
	private String positionName;
	private List<DamageDto> damageDtos;

	public DamageImageDto(String imageName, String comment, String positionName, List<DamageDto> damageDtos) {
		super();
		this.imageName = imageName;
		this.comment = comment;
		this.positionName = positionName;
		this.damageDtos = damageDtos;
	}

	public String getComment() {
		return comment;
	}

	public List<DamageDto> getDamageDtos() {
		return damageDtos;
	}

	public String getImageName() {
		return imageName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDamageDtos(List<DamageDto> damageDtos) {
		this.damageDtos = damageDtos;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
}
