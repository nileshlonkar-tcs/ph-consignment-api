package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FreeTextItem{

	@JsonProperty("seq")
	private String sequence;

	@JsonProperty("txt")
	private Integer text;

	@JsonProperty("type")
	private String type;

	public FreeTextItem() {
	}

	public FreeTextItem(String sequence, Integer text, String type) {
		this.sequence = sequence;
		this.text = text;
		this.type = type;
	}

	public void setSequence(String sequence){
		this.sequence = sequence;
	}

	public String getSequence(){
		return sequence;
	}

	public void setText(Integer text){
		this.text = text;
	}

	public Integer getText(){
		return text;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;

	}
}