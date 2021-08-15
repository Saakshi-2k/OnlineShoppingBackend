package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adminretailer")
public class Admin {

	@Id
	private int retid;
	private String retname;
	private String retemail;
	private String retmobile;

	public int getRetid() {
		return retid;
	}

	public void setRetid(int retid) {
		this.retid = retid;
	}

	public String getRetname() {
		return retname;
	}

	public void setRetname(String retname) {
		this.retname = retname;
	}

	public String getRetemail() {
		return retemail;
	}

	public void setRetemail(String retemail) {
		this.retemail = retemail;
	}

	public String getRetmobile() {
		return retmobile;
	}

	public void setRetmobile(String retmobile) {
		this.retmobile = retmobile;
	}

	public Admin(int retid, String retname, String retemail, String retmobile) {
		super();
		this.retid = retid;
		this.retname = retname;
		this.retemail = retemail;
		this.retmobile = retmobile;
	}

	public Admin() {
		super();
	}

}
