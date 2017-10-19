package ru.spec.java1.lec2;

import java.util.Date;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Date();
		System.out.println(o.getClass().getName());
		
		Object[] array = {new Date(),5, "asd", new int[] {1, 2, 3}};
		System.out.println(((int[])array[3])[2]);
		Object[][][] matrix = new Object[5][5][5];
		
		String s = new String("hello");
		
	}

}
