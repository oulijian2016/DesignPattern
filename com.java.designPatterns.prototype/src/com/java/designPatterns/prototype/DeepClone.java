package com.java.designPatterns.prototype;

import java.io.Serializable;

// ������������л�ʵ����ȿ���
//Ҫʵ�����¡����ʵ��Serializable�ӿ�
public class DeepClone implements Serializable{
	private int a;
	private String b;
	private int[] c;
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
