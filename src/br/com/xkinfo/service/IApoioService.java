package br.com.xkinfo.service;

import java.util.Calendar;
import java.util.Date;

public interface IApoioService {
	
	public String converteDataBanco(Calendar data) throws Exception;
	
	public String converteDataBrasil (Calendar data) throws Exception;
	
	public Integer converteBoolean (boolean campo) throws Exception;
	
	public Calendar converteCalendar(Date data) throws Exception;

}
