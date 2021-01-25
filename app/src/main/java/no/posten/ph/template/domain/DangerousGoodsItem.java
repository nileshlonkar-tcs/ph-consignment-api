package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DangerousGoodsItem{

	@JsonProperty("netWeightKg")
	private Integer netWeightKg;

	@JsonProperty("hazardousGoodsPoints")
	private Integer hazardousGoodsPoints;

	@JsonProperty("hazardCode")
	private String hazardCode;

	@JsonProperty("tunnellRestrictions")
	private String tunnellRestrictions;

	@JsonProperty("regulationCode")
	private String regulationCode;

	@JsonProperty("techName")
	private String techName;

	@JsonProperty("additionalHazardCode")
	private String additionalHazardCode;

	@JsonProperty("aging")
	private String aging;

	@JsonProperty("unNo")
	private Integer unNo;

	@JsonProperty("pack")
	private String pack;

	@JsonProperty("netVolumeLiter")
	private Integer netVolumeLiter;

	public void setNetWeightKg(Integer netWeightKg){
		this.netWeightKg = netWeightKg;
	}

	public Integer getNetWeightKg(){
		return netWeightKg;
	}

	public void setHazardousGoodsPoints(Integer hazardousGoodsPoints){
		this.hazardousGoodsPoints = hazardousGoodsPoints;
	}

	public Integer getHazardousGoodsPoints(){
		return hazardousGoodsPoints;
	}

	public void setHazardCode(String hazardCode){
		this.hazardCode = hazardCode;
	}

	public String getHazardCode(){
		return hazardCode;
	}

	public void setTunnellRestrictions(String tunnellRestrictions){
		this.tunnellRestrictions = tunnellRestrictions;
	}

	public String getTunnellRestrictions(){
		return tunnellRestrictions;
	}

	public void setRegulationCode(String regulationCode){
		this.regulationCode = regulationCode;
	}

	public String getRegulationCode(){
		return regulationCode;
	}

	public void setTechName(String techName){
		this.techName = techName;
	}

	public String getTechName(){
		return techName;
	}

	public void setAdditionalHazardCode(String additionalHazardCode){
		this.additionalHazardCode = additionalHazardCode;
	}

	public String getAdditionalHazardCode(){
		return additionalHazardCode;
	}

	public void setAging(String aging){
		this.aging = aging;
	}

	public String getAging(){
		return aging;
	}

	public void setUnNo(Integer unNo){
		this.unNo = unNo;
	}

	public Integer getUnNo(){
		return unNo;
	}

	public void setPack(String pack){
		this.pack = pack;
	}

	public String getPack(){
		return pack;
	}

	public void setNetVolumeLiter(Integer netVolumeLiter){
		this.netVolumeLiter = netVolumeLiter;
	}

	public Integer getNetVolumeLiter(){
		return netVolumeLiter;
	}
}