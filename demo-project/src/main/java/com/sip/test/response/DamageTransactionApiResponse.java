package com.sip.test.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.sip.test.dto.DamageImageDto;

public class DamageTransactionApiResponse {
	private List<DamageImageDto> damageImageDtos;
	private HttpStatus status;
	private String message;
	private boolean error;

	public DamageTransactionApiResponse(List<DamageImageDto> damageImageDtos, HttpStatus status, String message,
			boolean error) {
		super();
		this.damageImageDtos = damageImageDtos;
		this.status = status;
		this.message = message;
		this.error = error;
	}

	public List<DamageImageDto> getDamageImageDtos() {
		return damageImageDtos;
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

	public void setDamageImageDtos(List<DamageImageDto> damageImageDtos) {
		this.damageImageDtos = damageImageDtos;
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
