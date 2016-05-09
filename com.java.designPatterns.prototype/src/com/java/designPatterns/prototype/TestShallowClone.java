package com.java.designPatterns.prototype;

/**
 * 浅拷贝测试
 * @author oulijian
 *
 */
public class TestShallowClone {

	public static void main(String[] args) {
		ShallowClone sc1 = new ShallowClone();
		sc1.setA(100);
		sc1.setB("100");
		sc1.setC(new int[]{100});
		
		System.out.println("克隆前：sc1.a = "+sc1.getA());
		System.out.println("克隆前：sc1.b = "+sc1.getB());
		System.out.println("克隆前：sc1.c[0] = "+sc1.getC()[0]);
		System.out.println("--------------分隔线----------------");
		
		//克隆出对象sc2
		ShallowClone sc2 = (ShallowClone) sc1.clone();
		sc2.setA(50);
		sc2.setB("50");
		int[] a =sc2.getC();
		a[0] = 50;
		sc2.setC(a);
		
		// 克隆后sc1 的值
		System.out.println("克隆前：sc1.a = "+sc1.getA());
		System.out.println("克隆前：sc1.b = "+sc1.getB());
		System.out.println("克隆前：sc1.c[0] = "+sc1.getC()[0]);
		System.out.println("--------------分隔线----------------");
		// 克隆后sc2的值
		System.out.println("克隆后：sc2.a = "+sc2.getA());
		System.out.println("克隆后：sc2.b = "+sc2.getB());
		System.out.println("克隆后：sc2.c[0] = "+sc2.getC()[0]);
	}

}
