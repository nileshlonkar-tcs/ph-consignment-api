package no.posten.ph.template.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EquipmentItem{

	@JsonProperty("qty")
	private Integer equipmentQuantity;

	@JsonProperty("type")
	private String equipmentType;

	public EquipmentItem() {
	}

	public EquipmentItem(Integer equipmentQuantity, String equipmentType) {
		this.equipmentQuantity = equipmentQuantity;
		this.equipmentType = equipmentType;
	}

	public void setEquipmentQuantity(Integer equipmentQuantity){
		this.equipmentQuantity = equipmentQuantity;
	}

	public Integer getEquipmentQuantity(){
		return equipmentQuantity;
	}

	public void setEquipmentType(String equipmentType){
		this.equipmentType = equipmentType;
	}

	public String getEquipmentType(){
		return equipmentType;
	}
}