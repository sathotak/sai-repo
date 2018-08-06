package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass salesClass=new SalesClass();
		CustomerClass customerClass=new CustomerClass();
System.out.println("Hello world");
greet();
salesClass.show();
salesClass.show();
customerClass.show();
	}

	private static void greet() {
		System.out.println("Welcome");
		for(int i=0;i<=5;i++)
			System.out.print("*");
	}

}
