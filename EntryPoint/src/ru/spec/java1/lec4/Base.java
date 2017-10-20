package ru.spec.java1.lec4;

public class Base {
	
	String name = "123";	
	
	int age = 1;
	
	public Base() {
		super();
		//init fields
		System.out.println("Base() name=" + name);
//		m();
	}
	
	public Base(String name) {
		this();
		this.name = name;
	}
	

	
	void m() {
		System.out.println("Base.m()" + name);
	}
	
	static String getName(String name) {
		System.out.println("getName("+name+")");
		return name;
	}

	public static void main(String[] args) {
		Ext ext2 = new Ext2();
		
		System.out.println(ext2.age);
		ext2.m();
	}

}