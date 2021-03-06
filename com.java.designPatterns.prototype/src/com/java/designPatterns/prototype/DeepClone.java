package com.java.designPatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 深拷贝，采用序列化实现深度拷贝
//要实现深克隆必须实现Serializable接口
public class DeepClone implements Serializable{
	private int a;
	private String b;
	private int[] c;
	
	public Object deepClone(Object src){
		Object o = null;
		
		try{
			if( src != null){
				// 将对象写到流中
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(src);
				oos.close();
				// 将对象从流中读出来
				ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				o = ois.readObject();
				ois.close();
			}
		} catch (IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return o;
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
