package com.example.demo.mayank;

import javax.persistence.*;



@Entity
@Table(name="VENDOR")
public class Vendor {
    
	@Id
	@Column(nullable=false)
	public Integer vCode;
	public String vName;
	public String vEmail;
	public String vCountry;
	

	public Vendor() {
		this.vCode = 1;
		this.vName = "Mayank";
		this.vEmail = "mayankmittal24@yahoo.com";
		this.vCountry = "India";
	}
	public Integer getvCode() {
		return vCode;
	}
	public void setvCode(Integer vCode) {
		this.vCode = vCode;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvEmail() {
		return vEmail;
	}
	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}
	public String getvCountry() {
		return vCountry;
	}
	public void setvCountry(String vCountry) {
		this.vCountry = vCountry;
	}
	
}
