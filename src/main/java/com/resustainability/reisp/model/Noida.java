package com.resustainability.reisp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
public class Noida {

private String VehicleNo,TransferStation,Transporter,TimeRecorded,OutTime,
LoadWeight,EmptyWeight,NetWeight,MaterialName,SupplierName,PostedBy;

private String TicketNo;


public String getTicketNo() {
	return TicketNo;
}

public void setTicketNo(String TicketNo) {
	this.TicketNo = TicketNo;
}

public String getVehicleNo() {
	return VehicleNo;
}

public void setVehicleNo(String VehicleNo) {
	this.VehicleNo = VehicleNo;
}

public String getTransferStation() {
	return TransferStation;
}

public void setTransferStation(String TransferStation) {
	this.TransferStation = TransferStation;
}

public String getTransporter() {
	return Transporter;
}

public void setTransporter(String Transporter) {
	this.Transporter = Transporter;
}

public String getTimeRecorded() {
	return TimeRecorded;
}

public void setTimeRecorded(String TimeRecorded) {
	this.TimeRecorded = TimeRecorded;
}

public String getOutTime() {
	return OutTime;
}

public void setOutTime(String OutTime) {
	this.OutTime = OutTime;
}

public String getLoadWeight() {
	return LoadWeight;
}

public void setLoadWeight(String LoadWeight) {
	this.LoadWeight = LoadWeight;
}


public String getEmptyWeight() {
	return EmptyWeight;
}

public void setEmptyWeight(String EmptyWeight) {
	this.EmptyWeight = EmptyWeight;
}

public String getNetWeight() {
	return NetWeight;
}

public void setNetWeight(String NetWeight) {
	this.NetWeight = NetWeight;
}

public String getMaterialName() {
	return MaterialName;
}

public void setMaterialName(String MaterialName) {
	this.MaterialName = MaterialName;
}

public String getSupplierName() {
	return SupplierName;
}

public void setSupplierName(String SupplierName) {
	this.SupplierName = SupplierName;
}

public String getPostedBy() {
	return PostedBy;
}

public void setPostedBy(String PostedBy) {
	this.PostedBy = PostedBy;
}



}
