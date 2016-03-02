package br.com.xkinfo.service;

import java.util.Calendar;
import java.util.Date;

public interface IApoioService {
	
	public String converteDate (Date data) throws Exception;
	
	public String converteCalendar (Calendar data) throws Exception;
	
	public Integer converteBoolean (boolean campo) throws Exception;

}
