package no.posten.ph.template.mapper;

import no.posten.ph.consignment.model.*;
import no.posten.ph.consignment.model.Consignment;
import no.posten.ph.template.domain.*;
import no.posten.ph.template.domain.Address;
import no.posten.ph.template.domain.Party;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;


public class ConsignmentMapper {

    /**
     * This method converts consignment domain values to consignment model
     * @param consignmentDO
     * @return
     */
    public static Consignment transformDOtoModel(no.posten.ph.template.domain.Consignment consignmentDO){

        Consignment consignment = new Consignment();
        consignment.setConsignmentNo(consignmentDO.getConsignmentNo());
        consignment.setConsignmentMaster(consignmentDO.getConsignmentMaster());
        consignment.setConsignmentNoType(consignmentDO.getConsignmentNoType());
        consignment.setConsignmentNoIssuer(consignmentDO.getConsignmentNoIssuer());
        consignment.setAgreedDiscount(new BigDecimal(consignmentDO.getAgreedDiscount()));
        consignment.setBookingReference(consignmentDO.getBookingReference());
        consignment.setConsignmentNoIdentifier(consignmentDO.getConsignmentNoIdentifier());
        consignment.setProductCode(consignmentDO.getProductCode());
        consignment.setTermsType(consignmentDO.getTermsType());
        consignment.setTermsOfDeliver(consignmentDO.getTermsOfDeliver());
        consignment.setDgsTotalPoints(consignmentDO.getDgsTotalPoints());
        consignment.setTermsLocation(consignmentDO.getTermsLocation());
        consignment.setTermsCode(consignmentDO.getTermsCode());
        consignment.setServiceGroup(consignmentDO.getServiceGroup());
        consignment.setDiscountRegisteredBy(consignmentDO.getDiscountRegisteredBy());
        consignment.setGoodsDescription(consignmentDO.getGoodsDescription());
        consignment.setTemperatureTransportMin(new BigDecimal(consignmentDO.getTemperatureTransportMin()));
        consignment.setTemperatureTransportMax(new BigDecimal(consignmentDO.getTemperatureTransportMax()));
        consignment.setTemperatureStorageMin(new BigDecimal(consignmentDO.getTemperatureStorageMin()));
        consignment.setTemperatureStorageMax(new BigDecimal(consignmentDO.getTemperatureStorageMax()));
        consignment.setGrossVolume(consignmentDO.getGrossVolume());
        consignment.setGrossWeight(consignmentDO.getGrossWeight().longValue());
        consignment.setSyntheticStatus(consignmentDO.getSyntheticStatus());
        consignment.setReceiverReference(consignmentDO.getReceiverReference());
        consignment.setNumberOfPackages(consignmentDO.getNumberOfPackages());
        consignment.setPalletFootprints(consignmentDO.getPalletFootprints().longValue());
        consignment.setOrderType(consignmentDO.getOrderType());

        consignment.getPartyConsignor().setActorNo(consignmentDO.getPartyConsignor().getAktorNr());
        consignment.getPartyConsignor().setCreatedProgramId(consignmentDO.getPartyConsignor().getCreatedProgramId());
        consignment.getPartyConsignor().setPartyId(consignmentDO.getPartyConsignor().getPartyId());
        consignment.getPartyConsignor().setEmail(consignmentDO.getPartyConsignor().getContactEmail());
        consignment.getPartyConsignor().setFunction(consignmentDO.getPartyConsignor().getContactFunction());
        consignment.getPartyConsignor().setCreatedTimestamp(OffsetDateTime.parse(consignmentDO.getPartyConsignor().getCreatedTimestamp()));
        consignment.getPartyConsignor().setIdCodeList(consignmentDO.getPartyConsignor().getIdCodeList());
        consignment.getPartyConsignor().setMobile(consignmentDO.getPartyConsignor().getContactMobile());
        consignment.getPartyConsignor().setName(consignmentDO.getPartyConsignor().getName());
        consignment.getPartyConsignor().setPhone(consignmentDO.getPartyConsignor().getContactPhone());
        consignment.getPartyConsignor().setModifiedProgramId(consignmentDO.getPartyConsignor().getModifiedProgramId());
        consignment.getPartyConsignor().setModifiedTimestamp(OffsetDateTime.parse(consignmentDO.getPartyConsignor().getModifiedTimestamp()));
        consignment.getPartyConsignor().setSoundexName(consignmentDO.getPartyConsignor().getSoundexName());
        consignment.getPartyConsignor().setSubpartyId(consignmentDO.getPartyConsignor().getSubpartyId());
        consignment.getPartyConsignor().setSystem(consignmentDO.getPartyConsignor().getSystem());
        consignment.getPartyConsignor().setTelefax(consignmentDO.getPartyConsignor().getContactTelefax());
        consignment.getPartyConsignor().getPickupAddress().setAddressLine1(consignmentDO.getPartyConsignor().getPickupAddress().getAddressLine1());
        consignment.getPartyConsignor().getPickupAddress().setAddressLine2(consignmentDO.getPartyConsignor().getPickupAddress().getAddressLine2());
        consignment.getPartyConsignor().getPickupAddress().setCity(consignmentDO.getPartyConsignor().getPickupAddress().getCity());
        consignment.getPartyConsignor().getPickupAddress().setStreet(consignmentDO.getPartyConsignor().getPickupAddress().getStreet());
        consignment.getPartyConsignor().getPickupAddress().setPostalCode(consignmentDO.getPartyConsignor().getPickupAddress().getPostalCode());
        consignment.getPartyConsignor().getPickupAddress().setCountryCode(consignmentDO.getPartyConsignor().getPickupAddress().getCountryCode());
        consignment.getPartyConsignor().getPostalAddress().setAddressLine1(consignmentDO.getPartyConsignor().getPostalAddress().getAddressLine1());
        consignment.getPartyConsignor().getPostalAddress().setAddressLine2(consignmentDO.getPartyConsignor().getPostalAddress().getAddressLine2());
        consignment.getPartyConsignor().getPostalAddress().setStreet(consignmentDO.getPartyConsignor().getPostalAddress().getStreet());
        consignment.getPartyConsignor().getPostalAddress().setCity(consignmentDO.getPartyConsignor().getPostalAddress().getCity());
        consignment.getPartyConsignor().getPostalAddress().setPostalCode(consignmentDO.getPartyConsignor().getPostalAddress().getPostalCode());
        consignment.getPartyConsignor().getPostalAddress().setCountryCode(consignmentDO.getPartyConsignor().getPostalAddress().getCountryCode());


        consignment.getPartyConsignee().setActorNo(consignmentDO.getPartyConsignee().getAktorNr());
        consignment.getPartyConsignee().setCreatedProgramId(consignmentDO.getPartyConsignee().getCreatedProgramId());
        consignment.getPartyConsignee().setPartyId(consignmentDO.getPartyConsignee().getPartyId());
        consignment.getPartyConsignee().setEmail(consignmentDO.getPartyConsignee().getContactEmail());
        consignment.getPartyConsignee().setFunction(consignmentDO.getPartyConsignee().getContactFunction());
        consignment.getPartyConsignee().setCreatedTimestamp(OffsetDateTime.parse(consignmentDO.getPartyConsignee().getCreatedTimestamp()));
        consignment.getPartyConsignee().setIdCodeList(consignmentDO.getPartyConsignee().getIdCodeList());
        consignment.getPartyConsignee().setMobile(consignmentDO.getPartyConsignee().getContactMobile());
        consignment.getPartyConsignee().setName(consignmentDO.getPartyConsignee().getName());
        consignment.getPartyConsignee().setPhone(consignmentDO.getPartyConsignee().getContactPhone());
        consignment.getPartyConsignee().setModifiedProgramId(consignmentDO.getPartyConsignee().getModifiedProgramId());
        consignment.getPartyConsignee().setModifiedTimestamp(OffsetDateTime.parse(consignmentDO.getPartyConsignee().getModifiedTimestamp()));
        consignment.getPartyConsignee().setSoundexName(consignmentDO.getPartyConsignee().getSoundexName());
        consignment.getPartyConsignee().setSubpartyId(consignmentDO.getPartyConsignee().getSubpartyId());
        consignment.getPartyConsignee().setSystem(consignmentDO.getPartyConsignee().getSystem());
        consignment.getPartyConsignee().setTelefax(consignmentDO.getPartyConsignee().getContactTelefax());
        consignment.getPartyConsignee().getDeliveryAddress().setAddressLine1(consignmentDO.getPartyConsignee().getDeliveryAddress().getAddressLine1());
        consignment.getPartyConsignee().getDeliveryAddress().setAddressLine2(consignmentDO.getPartyConsignee().getDeliveryAddress().getAddressLine2());
        consignment.getPartyConsignee().getDeliveryAddress().setCity(consignmentDO.getPartyConsignee().getDeliveryAddress().getCity());
        consignment.getPartyConsignee().getDeliveryAddress().setStreet(consignmentDO.getPartyConsignee().getDeliveryAddress().getStreet());
        consignment.getPartyConsignee().getDeliveryAddress().setPostalCode(consignmentDO.getPartyConsignee().getDeliveryAddress().getPostalCode());
        consignment.getPartyConsignee().getDeliveryAddress().setCountryCode(consignmentDO.getPartyConsignee().getDeliveryAddress().getCountryCode());
        consignment.getPartyConsignee().getPostalAddress().setAddressLine1(consignmentDO.getPartyConsignee().getPostalAddress().getAddressLine1());
        consignment.getPartyConsignee().getPostalAddress().setAddressLine2(consignmentDO.getPartyConsignee().getPostalAddress().getAddressLine2());
        consignment.getPartyConsignee().getPostalAddress().setStreet(consignmentDO.getPartyConsignee().getPostalAddress().getStreet());
        consignment.getPartyConsignee().getPostalAddress().setCity(consignmentDO.getPartyConsignee().getPostalAddress().getCity());
        consignment.getPartyConsignee().getPostalAddress().setPostalCode(consignmentDO.getPartyConsignee().getPostalAddress().getPostalCode());
        consignment.getPartyConsignee().getPostalAddress().setCountryCode(consignmentDO.getPartyConsignee().getPostalAddress().getCountryCode());


        consignment.getCashOnDelivery().setAccountNumber(consignmentDO.getCashOnDelivery().getAccountNumber());
        consignment.getCashOnDelivery().setAccountType(consignmentDO.getCashOnDelivery().getAccountType());
        consignment.getCashOnDelivery().setAmount(new BigDecimal(consignmentDO.getCashOnDelivery().getAmount()));
        consignment.getCashOnDelivery().setAmountCheckDigit(consignmentDO.getCashOnDelivery().getAmountCheckDigit());
        consignment.getCashOnDelivery().setAmountCurrency(consignmentDO.getCashOnDelivery().getAmountCurrency());
        consignment.getCashOnDelivery().setControlIdentificationNumber(consignmentDO.getCashOnDelivery().getControlIdentificationNumber());
        consignment.getCashOnDelivery().setCreatedProgramId(consignmentDO.getCashOnDelivery().getCreateProgramId());
        consignment.getCashOnDelivery().setCreatedTimestamp(OffsetDateTime.parse(consignmentDO.getCashOnDelivery().getCreateTimestamp()));
        consignment.getCashOnDelivery().setModifiedProgramId(consignmentDO.getCashOnDelivery().getCreateProgramId());
        consignment.getCashOnDelivery().setModifiedTimestamp(OffsetDateTime.parse(consignmentDO.getCashOnDelivery().getModifiedTimestamp()));

        for(ChargesItem chargeItem: consignmentDO.getCharges()){
            Charges charges = new Charges();
            charges.setChargeCode(chargeItem.getChargeCode());
            charges.setChargeType(chargeItem.getChargeType());
            charges.setGrossAmount(new BigDecimal(chargeItem.getGrossAmount()));
            charges.setGrossCurrency(chargeItem.getGrossCurrency());
            charges.setNetAmount(new BigDecimal(chargeItem.getNetAmount()));
            charges.setNetCurrency(chargeItem.getNetCurrency());
            consignment.getCharges().add(charges);
        }

        for(VasItem vasItem: consignmentDO.getVas()){
            Vas vas = new Vas();
            vas.setVasCode(vasItem.getVASCode());
            vas.setDiscountPercent(vasItem.getDiscountPercent().toString());
            vas.setServiceRequirements(vasItem.getServiceRequirements());
            vas.setCreatedProgramId(vasItem.getCreateProgramId());
            vas.setCreatedTimestamp(OffsetDateTime.parse(vasItem.getCreateTimestamp()));
            vas.setModifiedProgramId(vasItem.getModifiedProgramId());
            vas.setModifiedTimestamp(OffsetDateTime.parse(vasItem.getModifiedTimestamp()));
            consignment.getVas().add(vas);
        }

        for(ReferenceItem referenceItem: consignmentDO.getReference()){
            Reference reference = new Reference();
            reference.setText(referenceItem.getText());
            reference.setType(referenceItem.getType());
            consignment.getReference().add(reference);
        }
        for(FreeTextItem freeTextItem: consignmentDO.getFreeText()){
            FreeText freeText = new FreeText();
            freeText.setText(freeTextItem.getText().toString());
            freeText.setType(freeTextItem.getType());
            freeText.setSequence(Integer.parseInt(freeTextItem.getSequence()));
            consignment.getFreeText().add(freeText);
        }
        for(DateTimeItem dateTimeItem: consignmentDO.getDateTime()){
            DateAndTime dateAndTime = new DateAndTime();
            dateAndTime.setDate(LocalDate.parse(dateTimeItem.getDate()));
            dateAndTime.setTime(dateTimeItem.getTime());
            dateAndTime.setType(dateTimeItem.getType());
            consignment.getDateTime().add(dateAndTime);
        }

        for(TrackingRecipientsItem trackingRecipientsItem: consignmentDO.getTrackingRecipients()){
            TrackingRecipients trackingRecipients = new TrackingRecipients();
            trackingRecipients.setActorNo(trackingRecipientsItem.getAktorNo());
            trackingRecipients.setType(trackingRecipientsItem.getType());
            trackingRecipients.setIdent(trackingRecipientsItem.getIdent());
            consignment.getTrackingRecipients().add(trackingRecipients);
        }

        for(Party partyItem: consignmentDO.getParty()){
            no.posten.ph.consignment.model.Party party = new no.posten.ph.consignment.model.Party();
            party.setActorNo(partyItem.getAktorNr());
            party.setEmail(partyItem.getContactEmail());
            party.setFunction(partyItem.getContactFunction());
            party.setPartyId(partyItem.getPartyId());
            party.setMobile(partyItem.getContactMobile());
            party.setIdCodeList(partyItem.getIdCodeList());
            party.setName(partyItem.getName());
            party.setPhone(partyItem.getContactPhone());
            party.setSubpartyId(partyItem.getSubpartyId());
            party.setSystem(partyItem.getSystem());
            party.setTelefax(partyItem.getContactTelefax());
            party.setType(partyItem.getType());
            party.setCreatedProgramId(partyItem.getCreatedProgramId());
            party.setCreatedTimestamp(OffsetDateTime.parse(partyItem.getCreatedTimestamp()));
            party.setModifiedProgramId(partyItem.getModifiedProgramId());
            party.setModifiedTimestamp(OffsetDateTime.parse(partyItem.getModifiedTimestamp()));
            //Check on party Item address DO & Reference
            /*for(Address address: partyItem.getAddresses()){
                partyItem.
            }*/

            consignment.getParty().add(party);
        }

        for (DangerousGoodsItem dangerousGoodsItem: consignmentDO.getDangerousGoods()) {
            DangerousGoods dangerousGoods = new DangerousGoods();
            dangerousGoods.setHazardCode(dangerousGoodsItem.getHazardCode());
            dangerousGoods.setHazardousGoodsPoints(dangerousGoodsItem.getHazardousGoodsPoints());
            dangerousGoods.setAdditionalHazardCode(dangerousGoodsItem.getAdditionalHazardCode());
            dangerousGoods.setPackaging(dangerousGoodsItem.getPack());
            dangerousGoods.setNetVolumeLitre(Long.valueOf(dangerousGoodsItem.getNetVolumeLiter()));
            dangerousGoods.setNetWeightKg(Long.valueOf(dangerousGoodsItem.getNetWeightKg()));
            dangerousGoods.setRegulationCode(dangerousGoodsItem.getRegulationCode());
            dangerousGoods.setTechName(dangerousGoodsItem.getTechName());
            dangerousGoods.setTunnelRestrictions(dangerousGoodsItem.getTunnellRestrictions());
            dangerousGoods.setUnNo(dangerousGoodsItem.getUnNo());
            consignment.getDangerousGoods().add(dangerousGoods);
        }

        for (EquipmentItem equipmentItem: consignmentDO.getEquipment()) {
            Equipment equipment = new Equipment();
            equipment.setEquipmentType(equipmentItem.getEquipmentType());
            equipment.setEquipmentQuantity(BigDecimal.valueOf(equipmentItem.getEquipmentQuantity()));
            consignment.getEquipment().add(equipment);
        }

        consignment.getInsurance().setGoodsDescription(consignmentDO.getInsurance().getGoodsDescription());
        consignment.getInsurance().setInsuredAmount(BigDecimal.valueOf(consignmentDO.getInsurance().getInsuredAmount()));
        consignment.getInsurance().setInsuredAmountCurrency(consignmentDO.getInsurance().getInsuredAmountCurrency());

        consignment.getAuditLog().setMessageId(consignmentDO.getAuditFields().getMessageID());
        consignment.getAuditLog().setCreatedProgramId(consignmentDO.getAuditFields().getCreatedProgramId());
        consignment.getAuditLog().setCreatedTimestamp(consignmentDO.getAuditFields().getCreatedTimestamp());
        consignment.getAuditLog().setModifiedProgramId(consignmentDO.getAuditFields().getModifiedProgramId());
        consignment.getAuditLog().setCreatedCompanyCode(consignmentDO.getAuditFields().getCreatedCompanyCode());
        consignment.getAuditLog().setModifiedTimestamp(consignmentDO.getAuditFields().getModifiedTimestamp());
        consignment.getAuditLog().setModifiedCompanyCode(consignmentDO.getAuditFields().getModifiedCompanyCode());
        consignment.getAuditLog().setModifiedUserId(consignmentDO.getAuditFields().getModifiedUserId());
        consignment.getAuditLog().setWeekNumber(consignmentDO.getAuditFields().getWeekNr());

        return consignment;

    }

}
