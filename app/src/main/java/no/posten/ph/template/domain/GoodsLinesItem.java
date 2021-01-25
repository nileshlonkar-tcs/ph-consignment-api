package no.posten.ph.template.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsLinesItem{

	@JsonProperty("loadingMetres")
	private Integer loadingMetres;

	@JsonProperty("dangerousGoods")
	private List<DangerousGoodsItem> dangerousGoods;

	@JsonProperty("packageTypeCode")
	private String packageTypeCode;

	@JsonProperty("grossWeigth")
	private Integer grossWeigth;

	@JsonProperty("numberOfPackages")
	private Integer numberOfPackages;

	@JsonProperty("volume")
	private Integer volume;

	@JsonProperty("reference")
	private List<ReferenceItem> reference;

	@JsonProperty("marking")
	private String marking;

	@JsonProperty("freeText")
	private List<FreeTextItem> freeText;

	@JsonProperty("auditFields")
	private List<AuditFields> auditFields;

	@JsonProperty("netWeigth")
	private Integer netWeigth;

	@JsonProperty("lineNumber")
	private String lineNumber;

	@JsonProperty("goodsDescription")
	private String goodsDescription;

	public void setLoadingMetres(Integer loadingMetres){
		this.loadingMetres = loadingMetres;
	}

	public Integer getLoadingMetres(){
		return loadingMetres;
	}

	public void setDangerousGoods(List<DangerousGoodsItem> dangerousGoods){
		this.dangerousGoods = dangerousGoods;
	}

	public List<DangerousGoodsItem> getDangerousGoods(){
		return dangerousGoods;
	}

	public void setPackageTypeCode(String packageTypeCode){
		this.packageTypeCode = packageTypeCode;
	}

	public String getPackageTypeCode(){
		return packageTypeCode;
	}

	public void setGrossWeigth(Integer grossWeigth){
		this.grossWeigth = grossWeigth;
	}

	public Integer getGrossWeigth(){
		return grossWeigth;
	}

	public void setNumberOfPackages(Integer numberOfPackages){
		this.numberOfPackages = numberOfPackages;
	}

	public Integer getNumberOfPackages(){
		return numberOfPackages;
	}

	public void setVolume(Integer volume){
		this.volume = volume;
	}

	public Integer getVolume(){
		return volume;
	}

	public void setReference(List<ReferenceItem> reference){
		this.reference = reference;
	}

	public List<ReferenceItem> getReference(){
		return reference;
	}

	public void setMarking(String marking){
		this.marking = marking;
	}

	public String getMarking(){
		return marking;
	}

	public void setFreeText(List<FreeTextItem> freeText){
		this.freeText = freeText;
	}

	public List<FreeTextItem> getFreeText(){
		return freeText;
	}

	public void setAuditFields(List<AuditFields> auditFields){
		this.auditFields = auditFields;
	}

	public List<AuditFields> getAuditFields(){
		return auditFields;
	}

	public void setNetWeigth(Integer netWeigth){
		this.netWeigth = netWeigth;
	}

	public Integer getNetWeigth(){
		return netWeigth;
	}

	public void setLineNumber(String lineNumber){
		this.lineNumber = lineNumber;
	}

	public String getLineNumber(){
		return lineNumber;
	}

	public void setGoodsDescription(String goodsDescription){
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsDescription(){
		return goodsDescription;
	}
}