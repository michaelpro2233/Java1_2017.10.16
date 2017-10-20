package ru.spec.java1.lec4;

public class Ext extends Base{
	
	String title = "123";	
	
	int age = 2;
	
	public Ext() {
		// TODO Auto-generated constructor stub
		super("asd");
		//init title
		System.out.println("Ext()");
		m();
		super.m();
	}
	
	@Override
	void m() {
		// TODO Auto-generated method stub
		System.out.println("Ext.m()" + title);
	}
}
