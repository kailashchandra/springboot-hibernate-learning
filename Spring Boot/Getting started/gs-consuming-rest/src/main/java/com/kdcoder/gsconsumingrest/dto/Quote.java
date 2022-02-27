package com.kdcoder.gsconsumingrest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private String Type;
	private Value value;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Quote [Type=" + Type + ", value=" + value + "]";
	}	
}
