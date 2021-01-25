package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashOnDelivery{

	@JsonProperty("amt")
	private Double amount;

	@JsonProperty("amtChkDgt")
	private String amountCheckDigit;

	@JsonProperty("accType")
	private String accountType;

	@JsonProperty("modSvcId")
	private String modifiedProgramId;

	@JsonProperty("ctrlIdNo")
	private String controlIdentificationNumber;

	@JsonProperty("accNo")
	private String accountNumber;

	@JsonProperty("crtdSvcId")
	private String createProgramId;

	@JsonProperty("modTs")
	private String modifiedTimestamp;

	@JsonProperty("amtCur")
	private String amountCurrency;

	@JsonProperty("crtdTs")
	private String createTimestamp;

	public void setAmount(Double amount){
		this.amount = amount;
	}

	public Double getAmount(){
		return amount;
	}

	public void setAmountCheckDigit(String amountCheckDigit){
		this.amountCheckDigit = amountCheckDigit;
	}

	public String getAmountCheckDigit(){
		return amountCheckDigit;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType(){
		return accountType;
	}


	public void setControlIdentificationNumber(String controlIdentificationNumber){
		this.controlIdentificationNumber = controlIdentificationNumber;
	}

	public String getControlIdentificationNumber(){
		return controlIdentificationNumber;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public void setCreateProgramId(String createProgramId){
		this.createProgramId = createProgramId;
	}

	public String getCreateProgramId(){
		return createProgramId;
	}

	public void setAmountCurrency(String amountCurrency){
		this.amountCurrency = amountCurrency;
	}

	public String getAmountCurrency(){
		return amountCurrency;
	}

	public void setCreateTimestamp(String createTimestamp){
		this.createTimestamp = createTimestamp;
	}

	public String getCreateTimestamp(){
		return createTimestamp;
	}

	public String getModifiedProgramId() {
		return modifiedProgramId;
	}

	public void setModifiedProgramId(String modifiedProgramId) {
		this.modifiedProgramId = modifiedProgramId;
	}

	public String getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(String modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
}