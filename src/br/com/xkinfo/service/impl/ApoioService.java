package br.com.xkinfo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.xkinfo.service.IApoioService;

public class ApoioService implements IApoioService{

	@Override
	public String converteDate(Date data) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String dia = sdf.format(data);
		return dia;
	}
	
	public String converteCalendar (Calendar data) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/yyyy");
		String dia = sdf.format(data.getTime());
		return dia;
	}

	@Override
	public Integer converteBoolean(boolean campo) throws Exception {
		Integer ret = null;;
		if (campo == true){
			ret = 1;
		}
		if (campo == false) {
			ret = 0;
		}
		return ret;
	}

}
