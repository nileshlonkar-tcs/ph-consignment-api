package no.posten.ph.template.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsignmentItem{

	@JsonProperty("grossVolumeDm3")
	private Integer grossVolumeDm3;

	@JsonProperty("insurance")
	private Insurance insurance;

	@JsonProperty("packageNoType")
	private String packageNoType;

	@JsonProperty("palletFootprints")
	private Integer palletFootprints;

	@JsonProperty("documentType")
	private String documentType;

	@JsonProperty("grossWeightGram")
	private Integer grossWeightGram;

	@JsonProperty("heigthCm")
	private Integer heigthCm;

	@JsonProperty("packageTypeCode")
	private String packageTypeCode;

	@JsonProperty("packageSerialNo")
	private String packageSerialNo;

	@JsonProperty("coodsLineNr")
	private String coodsLineNr;

	@JsonProperty("packageNo")
	private String packageNo;

	@JsonProperty("reference")
	private List<ReferenceItem> reference;

	@JsonProperty("bookingReference")
	private String bookingReference;

	@JsonProperty("lengthCm")
	private Integer lengthCm;

	@JsonProperty("goodsDescription")
	private String goodsDescription;

	@JsonProperty("packageNoIdentifier")
	private String packageNoIdentifier;

	@JsonProperty("netWeightGram")
	private Integer netWeightGram;

	@JsonProperty("loadingMetres")
	private Integer loadingMetres;

	@JsonProperty("vas")
	private List<VasItem> vas;

	@JsonProperty("consignmentNo")
	private String consignmentNo;

	@JsonProperty("charges")
	private List<ChargesItem> charges;

	@JsonProperty("packageNoIssuer")
	private String packageNoIssuer;

	@JsonProperty("marking")
	private String marking;

	@JsonProperty("freeText")
	private List<FreeTextItem> freeText;

	@JsonProperty("auditFields")
	private AuditFields auditFields;

	@JsonProperty("widthCm")
	private Integer widthCm;

	@JsonProperty("syntheticStatus")
	private String syntheticStatus;

	public void setGrossVolumeDm3(Integer grossVolumeDm3){
		this.grossVolumeDm3 = grossVolumeDm3;
	}

	public Integer getGrossVolumeDm3(){
		return grossVolumeDm3;
	}

	public void setInsurance(Insurance insurance){
		this.insurance = insurance;
	}

	public Insurance getInsurance(){
		return insurance;
	}

	public void setPackageNoType(String packageNoType){
		this.packageNoType = packageNoType;
	}

	public String getPackageNoType(){
		return packageNoType;
	}

	public void setPalletFootprints(Integer palletFootprints){
		this.palletFootprints = palletFootprints;
	}

	public Integer getPalletFootprints(){
		return palletFootprints;
	}

	public void setDocumentType(String documentType){
		this.documentType = documentType;
	}

	public String getDocumentType(){
		return documentType;
	}

	public void setGrossWeightGram(Integer grossWeightGram){
		this.grossWeightGram = grossWeightGram;
	}

	public Integer getGrossWeightGram(){
		return grossWeightGram;
	}

	public void setHeigthCm(Integer heigthCm){
		this.heigthCm = heigthCm;
	}

	public Integer getHeigthCm(){
		return heigthCm;
	}

	public void setPackageTypeCode(String packageTypeCode){
		this.packageTypeCode = packageTypeCode;
	}

	public String getPackageTypeCode(){
		return packageTypeCode;
	}

	public void setPackageSerialNo(String packageSerialNo){
		this.packageSerialNo = packageSerialNo;
	}

	public String getPackageSerialNo(){
		return packageSerialNo;
	}

	public void setCoodsLineNr(String coodsLineNr){
		this.coodsLineNr = coodsLineNr;
	}

	public String getCoodsLineNr(){
		return coodsLineNr;
	}

	public void setPackageNo(String packageNo){
		this.packageNo = packageNo;
	}

	public String getPackageNo(){
		return packageNo;
	}

	public void setReference(List<ReferenceItem> reference){
		this.reference = reference;
	}

	public List<ReferenceItem> getReference(){
		return reference;
	}

	public void setBookingReference(String bookingReference){
		this.bookingReference = bookingReference;
	}

	public String getBookingReference(){
		return bookingReference;
	}

	public void setLengthCm(Integer lengthCm){
		this.lengthCm = lengthCm;
	}

	public Integer getLengthCm(){
		return lengthCm;
	}

	public void setGoodsDescription(String goodsDescription){
		this.goodsDescription = goodsDescription;
	}

	public String getGoodsDescription(){
		return goodsDescription;
	}

	public void setPackageNoIdentifier(String packageNoIdentifier){
		this.packageNoIdentifier = packageNoIdentifier;
	}

	public String getPackageNoIdentifier(){
		return packageNoIdentifier;
	}

	public void setNetWeightGram(Integer netWeightGram){
		this.netWeightGram = netWeightGram;
	}

	public Integer getNetWeightGram(){
		return netWeightGram;
	}

	public void setLoadingMetres(Integer loadingMetres){
		this.loadingMetres = loadingMetres;
	}

	public Integer getLoadingMetres(){
		return loadingMetres;
	}

	public void setVas(List<VasItem> vas){
		this.vas = vas;
	}

	public List<VasItem> getVas(){
		return vas;
	}

	public void setConsignmentNo(String consignmentNo){
		this.consignmentNo = consignmentNo;
	}

	public String getConsignmentNo(){
		return consignmentNo;
	}

	public void setCharges(List<ChargesItem> charges){
		this.charges = charges;
	}

	public List<ChargesItem> getCharges(){
		return charges;
	}

	public void setPackageNoIssuer(String packageNoIssuer){
		this.packageNoIssuer = packageNoIssuer;
	}

	public String getPackageNoIssuer(){
		return packageNoIssuer;
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

	public void setAuditFields(AuditFields auditFields){
		this.auditFields = auditFields;
	}

	public AuditFields getAuditFields(){
		return auditFields;
	}

	public void setWidthCm(Integer widthCm){
		this.widthCm = widthCm;
	}

	public Integer getWidthCm(){
		return widthCm;
	}

	public void setSyntheticStatus(String syntheticStatus){
		this.syntheticStatus = syntheticStatus;
	}

	public String getSyntheticStatus(){
		return syntheticStatus;
	}
}