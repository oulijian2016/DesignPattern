package com.java.designPatterns.prototype;

import java.io.Serializable;

// Ç³¸´ÖÆ
public class ShallowClone implements Cloneable{
	
	private int a;
	private String b;
	private int[] c;
	
	public Object clone(){
		ShallowClone sc =null;
		try {
			sc = (ShallowClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sc;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int[] getC() {
		return c;
	}

	public void setC(int[] c) {
		this.c = c;
	}
	
	
}
