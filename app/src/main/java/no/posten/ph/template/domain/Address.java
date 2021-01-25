package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

	@JsonProperty("str")
	private String street;

	@JsonProperty("postCd")
	private String postalCode;

	@JsonProperty("ctryCd")
	private String countryCode;

	@JsonProperty("city")
	private String city;

	@JsonProperty("adrLn1")
	private String addressLine1;

	@JsonProperty("adrLn2")
	private String addressLine2;

	@JsonProperty("type")
	private String type;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}