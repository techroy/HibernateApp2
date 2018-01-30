package com.hibernateapp2.model;

public class BookBean {

	/* private int bid; */
	private String bname;
	private String bprice;
	private String bid;
	private int vercol;

	/*
	 * public int getBid() { return bid; }
	 * 
	 * public void setBid(int bid) { this.bid = bid; }
	 */

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBprice() {
		return bprice;
	}

	public void setBprice(String bprice) {
		this.bprice = bprice;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getVercol() {
		return vercol;
	}

	public void setVercol(int vercol) {
		this.vercol = vercol;
	}

}
