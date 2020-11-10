package com.simhadri.vo;

public class APIResponse {
	
	private String msg;
	private int status;
	private Object result;
	
	
	
	public APIResponse(String msg, int status, Object result) {
		super();
		this.msg = msg;
		this.status = status;
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "APIResponse [msg=" + msg + ", status=" + status + ", result=" + result + "]";
	}
	
	

}
