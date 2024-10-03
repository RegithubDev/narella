package com.resustainability.reisp.model;

public class NoidaLog {

	private String  id
    ,WeightTransNo
    ,VEHICLENO
    ,PTC_Status
    ,GFC_Status
    ,PTCDT
    ,GFCDT
    ,MSG;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWeightTransNo() {
		return WeightTransNo;
	}

	public void setWeightTransNo(String weightTransNo) {
		WeightTransNo = weightTransNo;
	}

	public String getVEHICLENO() {
		return VEHICLENO;
	}

	public void setVEHICLENO(String vEHICLENO) {
		VEHICLENO = vEHICLENO;
	}

	public String getPTC_Status() {
		return PTC_Status;
	}

	public void setPTC_Status(String pTC_Status) {
		PTC_Status = pTC_Status;
	}

	public String getGFC_Status() {
		return GFC_Status;
	}

	public void setGFC_Status(String gFC_Status) {
		GFC_Status = gFC_Status;
	}

	public String getPTCDT() {
		return PTCDT;
	}

	public void setPTCDT(String pTCDT) {
		PTCDT = pTCDT;
	}

	public String getGFCDT() {
		return GFCDT;
	}

	public void setGFCDT(String gFCDT) {
		GFCDT = gFCDT;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}
	
	
}
