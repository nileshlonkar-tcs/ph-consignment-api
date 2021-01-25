package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferenceItem{

	@JsonProperty("txt")
	private String text;

	@JsonProperty("type")
	private String type;

	public ReferenceItem() {
	}

	public ReferenceItem(String text, String type) {
		this.text = text;
		this.type = type;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}