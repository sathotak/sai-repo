package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass salesClass=new SalesClass();
System.out.println("Hello world");
greet();
salesClass.show();
	}

	private static void greet() {
		System.out.println("Welcome");
		for(int i=0;i<=5;i++)
			System.out.print("*");
	}

}
