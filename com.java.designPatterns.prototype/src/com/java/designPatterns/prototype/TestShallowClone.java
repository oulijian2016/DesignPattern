package com.java.designPatterns.prototype;

/**
 * ǳ��������
 * @author oulijian
 *
 */
public class TestShallowClone {

	public static void main(String[] args) {
		ShallowClone sc1 = new ShallowClone();
		sc1.setA(100);
		sc1.setB("100");
		sc1.setC(new int[]{100});
		
		System.out.println("��¡ǰ��sc1.a = "+sc1.getA());
		System.out.println("��¡ǰ��sc1.b = "+sc1.getB());
		System.out.println("��¡ǰ��sc1.c[0] = "+sc1.getC()[0]);
		System.out.println("--------------�ָ���----------------");
		
		//��¡������sc2
		ShallowClone sc2 = (ShallowClone) sc1.clone();
		sc2.setA(50);
		sc2.setB("50");
		int[] a =sc2.getC();
		a[0] = 50;
		sc2.setC(a);
		
		// ��¡��sc1 ��ֵ
		System.out.println("��¡ǰ��sc1.a = "+sc1.getA());
		System.out.println("��¡ǰ��sc1.b = "+sc1.getB());
		System.out.println("��¡ǰ��sc1.c[0] = "+sc1.getC()[0]);
		System.out.println("--------------�ָ���----------------");
		// ��¡��sc2��ֵ
		System.out.println("��¡��sc2.a = "+sc2.getA());
		System.out.println("��¡��sc2.b = "+sc2.getB());
		System.out.println("��¡��sc2.c[0] = "+sc2.getC()[0]);
	}

}
