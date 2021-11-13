package com.kmv.immoblier.enums;

/**
* @author : KOURMOU Omar
* @see : <kourmou.omar@gmail.com>
* @creation : 13/11/21
* @version : 1.0
*/
public enum RsMethodEnum {
	GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE");

	private final String value;

	private RsMethodEnum(String value) {
	this.value = value;
	}

	/**
	* @return the value
	*/
	public String getValue() {
	return value;
	}
}
