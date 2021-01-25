package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DateTimeItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("time")
	private String time;

	@JsonProperty("type")
	private String type;

	public DateTimeItem() {
	}

	public DateTimeItem(String date, String time, String type) {
		this.date = date;
		this.time = time;
		this.type = type;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}