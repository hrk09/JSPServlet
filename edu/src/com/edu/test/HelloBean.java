package com.edu.test;

public class HelloBean {

	private String name;
	private String num;

	// 기본생성자
	public HelloBean() {
		this.name = "no name";
		this.num = "no num";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
