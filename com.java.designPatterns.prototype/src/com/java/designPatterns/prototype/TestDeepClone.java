package com.java.designPatterns.prototype;

public class TestDeepClone {
	public static void main(String[] args){
		DeepClone c1 = new DeepClone();
		c1.setA(1);
		c1.setB("deepclone");
		c1.setC(new int[]{100});
		
		System.out.println("��ȿ�¡ǰ��");
		System.out.println("c1.a = "+c1.getA());
		System.out.println("c1.b = "+c1.getB());
		System.out.println("c1.c[0] = "+ c1.getC()[0]);
		
		// ��ȿ�¡��c2
		DeepClone c2 = (DeepClone) c1.deepClone(c1);
		c2.setA(2);
		c2.setB("deepclone2");
		c2.setC(new int[]{5});
		
		// ��ȿ�¡��c2��c1��ֵΪ
		System.out.println("��ȿ�¡��c2��c1��ֵΪ ��");
		System.out.println("c1.a = "+c1.getA());
		System.out.println("c1.b = "+c1.getB());
		System.out.println("c1.c[0] = "+ c1.getC()[0]);
		
		System.out.println("��ȿ�¡��c2��c2��ֵΪ ��");
		System.out.println("c2.a = "+c2.getA());
		System.out.println("c2.b = "+c2.getB());
		System.out.println("c2.c[0] = "+ c2.getC()[0]);
	}
}
