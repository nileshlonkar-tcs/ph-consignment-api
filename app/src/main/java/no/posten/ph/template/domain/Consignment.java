package no.posten.ph.template.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.List;

@Container(containerName = "ediConsignment")
public class Consignment {

    @Id
    @GeneratedValue
    private String id;

    @PartitionKey
    @JsonProperty("consignmentNo")
    private String consignmentNo;

    @JsonProperty("documentType")
    private String documentType;

    @JsonProperty("termsCode")
    private String termsCode;

    @JsonProperty("orderType")
    private String orderType;

    @JsonProperty("palletFootprints")
    private Integer palletFootprints;

    @JsonProperty("dgsTotalPoints")
    private Integer dgsTotalPoints;

    @JsonProperty("temperatureStorageMax")
    private Double temperatureStorageMax;

    @JsonProperty("temperatureTransportMin")
    private Double temperatureTransportMin;

    @JsonProperty("numberOfPackages")
    private Integer numberOfPackages;

    @JsonProperty("bookingReference")
    private String bookingReference;

    @JsonProperty("partyConsignor")
    private PartyConsignor partyConsignor;

    @JsonProperty("partyConsignee")
    private PartyConsignee partyConsignee;

    @JsonProperty("consignmentMaster")
    private String consignmentMaster;

    @JsonProperty("consignmentNoType")
    private String consignmentNoType;

    @JsonProperty("discountRegisteredBy")
    private String discountRegisteredBy;

    @JsonProperty("temperatureStorageMin")
    private Double temperatureStorageMin;

    @JsonProperty("goodsDescription")
    private String goodsDescription;

    @JsonProperty("termsOfDeliver")
    private String termsOfDeliver;

    @JsonProperty("auditFields")
    private AuditFields auditFields;

    @JsonProperty("consignmentNoIdentifier")
    private String consignmentNoIdentifier;

    @JsonProperty("loadingMetres")
    private Double loadingMetres;

    @JsonProperty("termsLocation")
    private String termsLocation;

    @JsonProperty("cashOnDelivery")
    private CashOnDelivery cashOnDelivery;

    @JsonProperty("senderReference")
    private String senderReference;

    @JsonProperty("serviceGroup")
    private String serviceGroup;

    @JsonProperty("netWeight")
    private Integer netWeight;

    @JsonProperty("grossWeight")
    private Integer grossWeight;

    @JsonProperty("productCode")
    private String productCode;

    @JsonProperty("receiverReference")
    private String receiverReference;

    @JsonProperty("grossVolume")
    private Integer grossVolume;

    @JsonProperty("agreedDiscount")
    private Double agreedDiscount;

    @JsonProperty("insurance")
    private Insurance insurance;

    @JsonProperty("syntheticStatus")
    private String syntheticStatus;

    @JsonProperty("consignmentNoIssuer")
    private String consignmentNoIssuer;

    @JsonProperty("termsType")
    private String termsType;

    @JsonProperty("temperatureTransportMax")
    private Double temperatureTransportMax;

    @JsonProperty("dangerousGoods")
    private List<DangerousGoodsItem> dangerousGoods;

    @JsonProperty("reference")
    private List<ReferenceItem> reference;

    @JsonProperty("vas")
    private List<VasItem> vas;

    @JsonProperty("equipment")
    private List<EquipmentItem> equipment;

    @JsonProperty("freeText")
    private List<FreeTextItem> freeText;

    @JsonProperty("party")
    private List<Party> party;

    @JsonProperty("charges")
    private List<ChargesItem> charges;

    @JsonProperty("trackingRecipients")
    private List<TrackingRecipientsItem> trackingRecipients;

    @JsonProperty("dateTime")
    private List<DateTimeItem> dateTime;

    @JsonProperty("msgHeader")
    private MsgHeader msgHeader;

    public Consignment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsignmentNo() {
        return consignmentNo;
    }

    public void setConsignmentNo(String consignmentNo) {
        this.consignmentNo = consignmentNo;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getTermsCode() {
        return termsCode;
    }

    public void setTermsCode(String termsCode) {
        this.termsCode = termsCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getPalletFootprints() {
        return palletFootprints;
    }

    public void setPalletFootprints(Integer palletFootprints) {
        this.palletFootprints = palletFootprints;
    }

    public Integer getDgsTotalPoints() {
        return dgsTotalPoints;
    }

    public void setDgsTotalPoints(Integer dgsTotalPoints) {
        this.dgsTotalPoints = dgsTotalPoints;
    }

    public Double getTemperatureStorageMax() {
        return temperatureStorageMax;
    }

    public void setTemperatureStorageMax(Double temperatureStorageMax) {
        this.temperatureStorageMax = temperatureStorageMax;
    }

    public Double getTemperatureTransportMin() {
        return temperatureTransportMin;
    }

    public void setTemperatureTransportMin(Double temperatureTransportMin) {
        this.temperatureTransportMin = temperatureTransportMin;
    }

    public Integer getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(Integer numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public PartyConsignor getPartyConsignor() {
        return partyConsignor;
    }

    public void setPartyConsignor(PartyConsignor partyConsignor) {
        this.partyConsignor = partyConsignor;
    }

    public String getConsignmentMaster() {
        return consignmentMaster;
    }

    public void setConsignmentMaster(String consignmentMaster) {
        this.consignmentMaster = consignmentMaster;
    }

    public String getConsignmentNoType() {
        return consignmentNoType;
    }

    public void setConsignmentNoType(String consignmentNoType) {
        this.consignmentNoType = consignmentNoType;
    }

    public String getDiscountRegisteredBy() {
        return discountRegisteredBy;
    }

    public void setDiscountRegisteredBy(String discountRegisteredBy) {
        this.discountRegisteredBy = discountRegisteredBy;
    }

    public PartyConsignee getPartyConsignee() {
        return partyConsignee;
    }

    public void setPartyConsignee(PartyConsignee partyConsignee) {
        this.partyConsignee = partyConsignee;
    }

    public Double getTemperatureStorageMin() {
        return temperatureStorageMin;
    }

    public void setTemperatureStorageMin(Double temperatureStorageMin) {
        this.temperatureStorageMin = temperatureStorageMin;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public String getTermsOfDeliver() {
        return termsOfDeliver;
    }

    public void setTermsOfDeliver(String termsOfDeliver) {
        this.termsOfDeliver = termsOfDeliver;
    }

    public AuditFields getAuditFields() {
        return auditFields;
    }

    public void setAuditFields(AuditFields auditFields) {
        this.auditFields = auditFields;
    }

    public String getConsignmentNoIdentifier() {
        return consignmentNoIdentifier;
    }

    public void setConsignmentNoIdentifier(String consignmentNoIdentifier) {
        this.consignmentNoIdentifier = consignmentNoIdentifier;
    }

    public Double getLoadingMetres() {
        return loadingMetres;
    }

    public void setLoadingMetres(Double loadingMetres) {
        this.loadingMetres = loadingMetres;
    }

    public String getTermsLocation() {
        return termsLocation;
    }

    public void setTermsLocation(String termsLocation) {
        this.termsLocation = termsLocation;
    }

    public CashOnDelivery getCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(CashOnDelivery cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public String getSenderReference() {
        return senderReference;
    }

    public void setSenderReference(String senderReference) {
        this.senderReference = senderReference;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public Integer getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getReceiverReference() {
        return receiverReference;
    }

    public void setReceiverReference(String receiverReference) {
        this.receiverReference = receiverReference;
    }

    public Integer getGrossVolume() {
        return grossVolume;
    }

    public void setGrossVolume(Integer grossVolume) {
        this.grossVolume = grossVolume;
    }

    public Double getAgreedDiscount() {
        return agreedDiscount;
    }

    public void setAgreedDiscount(Double agreedDiscount) {
        this.agreedDiscount = agreedDiscount;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getSyntheticStatus() {
        return syntheticStatus;
    }

    public void setSyntheticStatus(String syntheticStatus) {
        this.syntheticStatus = syntheticStatus;
    }

    public String getConsignmentNoIssuer() {
        return consignmentNoIssuer;
    }

    public void setConsignmentNoIssuer(String consignmentNoIssuer) {
        this.consignmentNoIssuer = consignmentNoIssuer;
    }

    public String getTermsType() {
        return termsType;
    }

    public void setTermsType(String termsType) {
        this.termsType = termsType;
    }

    public Double getTemperatureTransportMax() {
        return temperatureTransportMax;
    }

    public void setTemperatureTransportMax(Double temperatureTransportMax) {
        this.temperatureTransportMax = temperatureTransportMax;
    }

    public List<DangerousGoodsItem> getDangerousGoods() {
        return dangerousGoods;
    }

    public void setDangerousGoods(List<DangerousGoodsItem> dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }

    public List<ReferenceItem> getReference() {
        return reference;
    }

    public void setReference(List<ReferenceItem> reference) {
        this.reference = reference;
    }

    public List<VasItem> getVas() {
        return vas;
    }

    public void setVas(List<VasItem> vas) {
        this.vas = vas;
    }

    public List<EquipmentItem> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentItem> equipment) {
        this.equipment = equipment;
    }

    public List<FreeTextItem> getFreeText() {
        return freeText;
    }

    public void setFreeText(List<FreeTextItem> freeText) {
        this.freeText = freeText;
    }

    public List<Party> getParty() {
        return party;
    }

    public void setParty(List<Party> party) {
        this.party = party;
    }

    public List<ChargesItem> getCharges() {
        return charges;
    }

    public void setCharges(List<ChargesItem> charges) {
        this.charges = charges;
    }

    public List<TrackingRecipientsItem> getTrackingRecipients() {
        return trackingRecipients;
    }

    public void setTrackingRecipients(List<TrackingRecipientsItem> trackingRecipients) {
        this.trackingRecipients = trackingRecipients;
    }

    public List<DateTimeItem> getDateTime() {
        return dateTime;
    }

    public void setDateTime(List<DateTimeItem> dateTime) {
        this.dateTime = dateTime;
    }

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }
}