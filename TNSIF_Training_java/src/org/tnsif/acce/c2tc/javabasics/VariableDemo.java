package org.tnsif.acce.c2tc.javabasics;

public class VariableDemo {
	int price=10;
	void print() 
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message="Hello Student";

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
		
		// TODO Auto-generated method stub

	}

}


