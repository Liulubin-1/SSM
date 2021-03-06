package com.soecode.lyf.entity;

public class MyDate {
	private int year;
	private int month;
	private int day;
	/**
	 * @return the year
	 */
	
	public MyDate(){}
	
	public MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		
		return  year + "年" + month + "月" + day+"日";
	}
}
