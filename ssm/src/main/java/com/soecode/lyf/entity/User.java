package com.soecode.lyf.entity;

public class User {
	
	private int user_id;
	private String user_code;
	private String user_name;
	private String user_pwd;//密码
	private String user_birthday;
	
	public User(){}

	public User(int id,String code,String name,String pwd,String birthday)
	{
		this.user_id=id;
		this.user_code=code;
		this.user_name=name;
		this.user_pwd=pwd;
		this.user_birthday=birthday;
	}
	
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_code
	 */
	public String getUser_code() {
		return user_code;
	}

	/**
	 * @param user_code the user_code to set
	 */
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the user_pwd
	 */
	public String getUser_pwd() {
		return user_pwd;
	}

	/**
	 * @param user_pwd the user_pwd to set
	 */
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	/**
	 * @return the user_birthday
	 */
	public String getUser_birthday() {
		return user_birthday;
	}

	/**
	 * @param user_birthday the user_birthday to set
	 */
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	
	@Override
	public String toString() {
		
		return "Safetyrecord [Id=" + user_id + ", name=" + user_name + "]";
	}
	

}
