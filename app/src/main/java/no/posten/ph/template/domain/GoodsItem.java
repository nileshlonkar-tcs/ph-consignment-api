package no.posten.ph.template.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsItem{

	@JsonProperty("documentType")
	private String documentType;

	@JsonProperty("consignmentNo")
	private String consignmentNo;

	@JsonProperty("goodsLines")
	private List<GoodsLinesItem> goodsLines;

	public void setDocumentType(String documentType){
		this.documentType = documentType;
	}

	public String getDocumentType(){
		return documentType;
	}

	public void setConsignmentNo(String consignmentNo){
		this.consignmentNo = consignmentNo;
	}

	public String getConsignmentNo(){
		return consignmentNo;
	}

	public void setGoodsLines(List<GoodsLinesItem> goodsLines){
		this.goodsLines = goodsLines;
	}

	public List<GoodsLinesItem> getGoodsLines(){
		return goodsLines;
	}
}