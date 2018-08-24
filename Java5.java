
//Author Kiran
package com.p1;
abstract class shape5
{
	abstract void area(); 
}
class circle5 extends shape5
{
	void area()
	{
		System.out.println("Circle......");
	}
}
class rectangle5 extends shape5
{
	void area()
	{
		System.out.println("Rectangle......");
	}
}

class square5 extends shape5
{
	void area()
	{
		System.out.println("Square....");
	}
}
class cylinder5 extends shape5
{
	void area()
	{
		System.out.println("Cylinder.......");
	}
}
public class Java5 {

	public static void main(String[] args)
	{
	shape5 s1=new circle5();
	s1.area();
		
	}

}
