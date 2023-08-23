package com.DataApi1.beans;


public class OrganizationDetails {
	private String tenderName;
	private String tenderDeadline;
	private String tenderType;
	private String tenderCategory;
	private String tenderLocation;
	private String tenderAmount;
	private String invitingAuthorityName;
	private String invitingAuthorityAmount;
	private String address;
	private String paymentMode;
	public String getTenderName() {
		return tenderName;
	}
	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}
	public String getTenderDeadline() {
		return tenderDeadline;
	}
	public void setTenderDeadline(String tenderDeadline) {
		this.tenderDeadline = tenderDeadline;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getTenderCategory() {
		return tenderCategory;
	}
	public void setTenderCategory(String tenderCategory) {
		this.tenderCategory = tenderCategory;
	}
	public String getTenderLocation() {
		return tenderLocation;
	}
	public void setTenderLocation(String tenderLocation) {
		this.tenderLocation = tenderLocation;
	}
	public String getTenderAmount() {
		return tenderAmount;
	}
	public void setTenderAmount(String tenderAmount) {
		this.tenderAmount = tenderAmount;
	}
	public String getInvitingAuthorityName() {
		return invitingAuthorityName;
	}
	public void setInvitingAuthorityName(String invitingAuthorityName) {
		this.invitingAuthorityName = invitingAuthorityName;
	}
	public String getInvitingAuthorityAmount() {
		return invitingAuthorityAmount;
	}
	public void setInvitingAuthorityAmount(String invitingAuthorityAmount) {
		this.invitingAuthorityAmount = invitingAuthorityAmount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "OrganizationDetails [tenderName=" + tenderName + ", tenderDeadline=" + tenderDeadline + ", tenderType="
				+ tenderType + ", tenderCategory=" + tenderCategory + ", tenderLocation=" + tenderLocation
				+ ", tenderAmount=" + tenderAmount + ", invitingAuthorityName=" + invitingAuthorityName + ", Address="
				+ address + "]";
	}
	
	
}
