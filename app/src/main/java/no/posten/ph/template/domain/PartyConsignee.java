package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartyConsignee{

	@JsonProperty("personalAlias")
	private String personalAlias;

	@JsonProperty("url")
	private String url;

	@JsonProperty("digipostId")
	private String digipostId;

	@JsonProperty("idCodeList")
	private String idCodeList;

	@JsonProperty("contMob")
	private String contactMobile;

	@JsonProperty("contTelfx")
	private String contactTelefax;

	@JsonProperty("crtdSvcId")
	private String createdProgramId;

	@JsonProperty("postAdr")
	private Address postalAddress;

	@JsonProperty("contName")
	private String contactName;

	@JsonProperty("subpartyId")
	private String subpartyId;

	@JsonProperty("pupAdr")
	private Address deliveryAddress;

	@JsonProperty("soundexName")
	private String soundexName;

	@JsonProperty("contFunc")
	private String contactFunction;

	@JsonProperty("system")
	private String system;

	@JsonProperty("contPh")
	private String contactPhone;

	@JsonProperty("name")
	private String name;

	@JsonProperty("crtdTs")
	private String createdTimestamp;

	@JsonProperty("modTs")
	private String modifiedTimestamp;

	@JsonProperty("aktorNr")
	private String aktorNr;

	@JsonProperty("partyId")
	private String partyId;

	@JsonProperty("modSvcId")
	private String modifiedProgramId;

	@JsonProperty("contEml")
	private String contactEmail;

	public String getPersonalAlias() {
		return personalAlias;
	}

	public void setPersonalAlias(String personalAlias) {
		this.personalAlias = personalAlias;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDigipostId() {
		return digipostId;
	}

	public void setDigipostId(String digipostId) {
		this.digipostId = digipostId;
	}

	public String getIdCodeList() {
		return idCodeList;
	}

	public void setIdCodeList(String idCodeList) {
		this.idCodeList = idCodeList;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactTelefax() {
		return contactTelefax;
	}

	public void setContactTelefax(String contactTelefax) {
		this.contactTelefax = contactTelefax;
	}

	public String getCreatedProgramId() {
		return createdProgramId;
	}

	public void setCreatedProgramId(String createdProgramId) {
		this.createdProgramId = createdProgramId;
	}

	public Address getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getSubpartyId() {
		return subpartyId;
	}

	public void setSubpartyId(String subpartyId) {
		this.subpartyId = subpartyId;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getSoundexName() {
		return soundexName;
	}

	public void setSoundexName(String soundexName) {
		this.soundexName = soundexName;
	}

	public String getContactFunction() {
		return contactFunction;
	}

	public void setContactFunction(String contactFunction) {
		this.contactFunction = contactFunction;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(String modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	public String getAktorNr() {
		return aktorNr;
	}

	public void setAktorNr(String aktorNr) {
		this.aktorNr = aktorNr;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getModifiedProgramId() {
		return modifiedProgramId;
	}

	public void setModifiedProgramId(String modifiedProgramId) {
		this.modifiedProgramId = modifiedProgramId;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
}