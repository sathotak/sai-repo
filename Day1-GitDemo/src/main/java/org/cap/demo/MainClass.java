package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass salesClass=new SalesClass();
		CustomerClass customerClass=new CustomerClass();
		ProducerClass producerClass=new ProducerClass();
System.out.println("Hello world");
greet();
salesClass.show();
salesClass.show();
customerClass.show();
producerClass.show();
for(int i=0;i<10;i++)
{
	System.out.println(i);
}
	}

	private static void greet() {
		System.out.println("Welcome");
		System.out.println("This is my first project");
		for(int i=0;i<=5;i++)
			System.out.print("*");
	}

}
