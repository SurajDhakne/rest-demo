package com.sip.test.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.sip.test.dto.DamageDto;

public class DamageApiResponse {
	private DamageDto damageDto;
	private List<DamageDto> damageDtos;
	private HttpStatus status;
	private String message;
	private boolean error;

	public DamageApiResponse(DamageDto damageDto, List<DamageDto> damageDtos, HttpStatus status, String message,
			boolean error) {
		super();
		this.damageDto = damageDto;
		this.damageDtos = damageDtos;
		this.status = status;
		this.message = message;
		this.error = error;
	}

	public DamageDto getDamageDto() {
		return damageDto;
	}

	public List<DamageDto> getDamageDtos() {
		return damageDtos;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public boolean isError() {
		return error;
	}

	public void setDamageDto(DamageDto damageDto) {
		this.damageDto = damageDto;
	}

	public void setDamageDtos(List<DamageDto> damageDtos) {
		this.damageDtos = damageDtos;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
