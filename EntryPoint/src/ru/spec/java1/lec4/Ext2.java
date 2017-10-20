package ru.spec.java1.lec4;

public class Ext2 extends Ext {

	public Ext2() {
		// TODO Auto-generated constructor stub
		System.out.println("Ext2");
		super.m();
		
		System.out.println(super.equals(this));
	}
	
	
	@Override
	void m() {
		System.out.println("Ext2.m()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
