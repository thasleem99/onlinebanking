package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="savingaccount")
public class SavingAccount 
{
	@Override
	public String toString() {
		return "SavingAccount [user_id=" + user_id + ", res_add=" + res_add + ", perm_add=" + perm_add + ", status="
				+ status + "]";
	}
	@Id
	private String user_id;
	private String res_add;
	private String perm_add;
	private String status;
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRes_add() {
		return res_add;
	}
	public void setRes_add(String res_add) {
		this.res_add = res_add;
	}
	public String getPerm_add() {
		return perm_add;
	}
	public void setPerm_add(String perm_add) {
		this.perm_add = perm_add;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
