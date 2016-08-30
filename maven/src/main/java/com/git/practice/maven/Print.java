package com.git.practice.maven;

public class Print {

	private int number;
	private String name, mail;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Print [number=" + number + ", name=" + name + ", mail=" + mail + "]";
	}
	public void setName(String name) {
		this.name=name;
		
	}
	

}
