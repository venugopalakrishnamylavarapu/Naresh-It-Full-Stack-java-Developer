package com.prac;

public class NavalVessel {
	public int getVesselId() {
		return vesselId;
	}
	public String getVesselName() {
		return vesselName;
	}
	public int getNoOfVoyagesPlanned() {
		return noOfVoyagesPlanned;
	}
	public String getPurpose() {
		return purpose;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String clf) {
		this.classification=clf;
	}
	public int getNoOfVoyagesCompleted() {
		return noOfVoyagesCompleted;
	}
	private int vesselId;
	private String vesselName;
	private int noOfVoyagesPlanned;
	private int noOfVoyagesCompleted;
	private String purpose;
	private String classification;
	
	public NavalVessel(int vi,String vn,int novp,int novc,String prp)
	{
		this.vesselId=vi;
		this.vesselName=vn;
		this.noOfVoyagesCompleted=novc;
		this.noOfVoyagesPlanned=novp;
		this.purpose=prp;
	}
}