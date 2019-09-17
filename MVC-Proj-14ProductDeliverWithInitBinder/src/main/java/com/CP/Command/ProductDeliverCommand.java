package com.CP.Command;

import java.util.Date;

public class ProductDeliverCommand {
	
	public ProductDeliverCommand() {
		System.out.println("ProductDeliverCommand::0Param");
	}
	private String productName;
	private String sourceCompanyname="Shree Fitness and Gym Equipment";
	private String clientCompanyName;
	private Date deliveryDate;
	
	public String getProductName() {
		return productName;
	}
	public String getSourceCompanyname() {
		return sourceCompanyname;
	}
	public String getClientCompanyName() {
		return clientCompanyName;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setSourceCompanyname(String sourceCompanyname) {
		this.sourceCompanyname = sourceCompanyname;
	}
	public void setClientCompanyName(String clientCompanyName) {
		this.clientCompanyName = clientCompanyName;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	@Override
	public String toString() {
		return "ProductDeliverCommand [productName=" + productName + ", sourceCompanyname=" + sourceCompanyname
				+ ", clientCompanyName=" + clientCompanyName + ", deliveryDate=" + deliveryDate + "]";
	}
	
}
