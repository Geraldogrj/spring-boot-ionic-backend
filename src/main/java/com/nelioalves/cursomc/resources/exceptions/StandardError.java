package com.nelioalves.cursomc.resources.exceptions;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
//	public Long getTimeStamp() {
//		return timeStamp;
//	}

	//Alterei esse get para que retornasse o String formatado
	public String getTimeStamp() {
		Date date = new Date (timeStamp);
		Format format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return format.format(date);
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
