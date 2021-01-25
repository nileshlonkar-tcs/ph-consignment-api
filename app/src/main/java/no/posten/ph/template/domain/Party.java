package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Party {

	@JsonProperty("type")
	private String type;

	@JsonProperty("name")
	private String name;

	@JsonProperty("idCodeList")
	private String idCodeList;

	@JsonProperty("contMob")
	private String contactMobile;

	@JsonProperty("contTelfx")
	private String contactTelefax;

	@JsonProperty("crtdSvcId")
	private String createdProgramId;

	@JsonProperty("contName")
	private String contactName;

	@JsonProperty("subpartyId")
	private String subpartyId;

	@JsonProperty("contFunc")
	private String contactFunction;

	@JsonProperty("system")
	private String system;

	@JsonProperty("contPh")
	private String contactPhone;

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

	@JsonProperty("adrs")
	private String addresses;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
}