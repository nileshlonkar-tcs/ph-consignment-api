package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackingRecipientsItem{

	@JsonProperty("ident")
	private String ident;

	@JsonProperty("aktorNo")
	private String aktorNo;

	@JsonProperty("type")
	private String type;

	public TrackingRecipientsItem() {
	}

	public TrackingRecipientsItem(String ident, String aktorNo, String type) {
		this.ident = ident;
		this.aktorNo = aktorNo;
		this.type = type;
	}

	public void setIdent(String ident){
		this.ident = ident;
	}

	public String getIdent(){
		return ident;
	}

	public void setAktorNo(String aktorNo){
		this.aktorNo = aktorNo;
	}

	public String getAktorNo(){
		return aktorNo;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}