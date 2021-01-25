package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MsgHeader{

	@JsonProperty("ts")
	private String timeStamp;

	@JsonProperty("sendEdiId")
	private String senderId;

	@JsonProperty("ver")
	private String version;

	@JsonProperty("senderBroker")
	private String senderBroker;

	@JsonProperty("upd")
	private String update;

	@JsonProperty("type")
	private String type;

	@JsonProperty("batId")
	private String batchId;

	@JsonProperty("tsOrig")
	private String timeStampOrig;

	@JsonProperty("senderTMS")
	private String senderTMS;

	@JsonProperty("senderSubId")
	private String senderSubId;

	@JsonProperty("procReq")
	private String processRequest;

	public void setTimeStamp(String timeStamp){
		this.timeStamp = timeStamp;
	}

	public String getTimeStamp(){
		return timeStamp;
	}

	public void setSenderId(String senderId){
		this.senderId = senderId;
	}

	public String getSenderId(){
		return senderId;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setSenderBroker(String senderBroker){
		this.senderBroker = senderBroker;
	}

	public String getSenderBroker(){
		return senderBroker;
	}

	public void setUpdate(String update){
		this.update = update;
	}

	public String getUpdate(){
		return update;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setBatchId(String batchId){
		this.batchId = batchId;
	}

	public String getBatchId(){
		return batchId;
	}

	public void setTimeStampOrig(String timeStampOrig){
		this.timeStampOrig = timeStampOrig;
	}

	public String getTimeStampOrig(){
		return timeStampOrig;
	}

	public void setSenderTMS(String senderTMS){
		this.senderTMS = senderTMS;
	}

	public String getSenderTMS(){
		return senderTMS;
	}

	public void setSenderSubId(String senderSubId){
		this.senderSubId = senderSubId;
	}

	public String getSenderSubId(){
		return senderSubId;
	}

	public void setProcessRequest(String processRequest){
		this.processRequest = processRequest;
	}

	public String getProcessRequest(){
		return processRequest;
	}
}