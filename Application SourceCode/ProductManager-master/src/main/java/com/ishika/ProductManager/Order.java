package com.ishika.ProductManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable")
public class Order {
	
	@Column(name="oid")
	private long oid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cid")
	private int cid;
	
	@Column(name="odate")
	private String odate;
	
	@Column(name="ovalue")
	private int ovalue;
	
	@Column(name="city")
	private String city;
	
	@Column(name="shipcost")
	private int shipcost;
	
	@Column(name="gst")
	private int gst;
	
	@Column(name="totalvalue")
	private int totalvalue;
	
	@Column(name="status")
	private String status;
	
	public Order() {
			
	}
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getOvalue() {
		return ovalue;
	}
	public void setOvalue(int ovalue) {
		this.ovalue = ovalue;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getShipcost() {
		return shipcost;
	}
	public void setShipcost(int shipcost) {
		this.shipcost = shipcost;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public int getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(int totalvalue) {
		this.totalvalue = totalvalue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	

}
