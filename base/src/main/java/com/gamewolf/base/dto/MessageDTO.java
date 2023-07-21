package com.gamewolf.base.dto;

import java.util.HashMap;

public class MessageDTO {
	
String code;
	
	String message;
	
	Object data;
	
	HashMap<String,Object> arrayData;
	
	
	public MessageDTO(){
		arrayData=new HashMap<String,Object>();
		code="200";
		message="成功";
	}
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		if(data==null) {
			if(arrayData!=null) {
				return arrayData;
			}else {
				return "";
			}
		}else {
			return data;
		}
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public void setData(String name,Object data) {
		arrayData.put(name, data);
	}


}
