package com.soecode.lyf.entity;

public class Safetyrecordsig {
	private int id;
	private int inspector;//检查员ID
	private String remark=" ";
	private String exception=" ";
	private String date;
	private String name=" ";
	
	public Safetyrecordsig(){}
	
	public Safetyrecordsig(int id,int inspector,String remark,String exception,String date){
		this.id=id;
		this.inspector=inspector;
		this.remark=remark;
		this.exception=exception;
		this.date=date;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the inspector
	 */
	public int getInspector() {
		return inspector;
	}

	/**
	 * @param inspector the inspector to set
	 */
	public void setInspector(int inspector) {
		this.inspector = inspector;
	}

	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		
		return "Safetyrecord [Id=" + id + ", date=" + date + ", inspector=" + id+" "+name +", remark=" + remark+ "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
