package br.com.xkinfo.model;

import java.util.Calendar;

public class CopiaSeguranca {

	private int id;
	private String user;
	private Calendar dataIncial;
	private Calendar dataFinal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Calendar getDataIncial() {
		return dataIncial;
	}
	public void setDataIncial(Calendar dataIncial) {
		this.dataIncial = dataIncial;
	}
	public Calendar getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
}
