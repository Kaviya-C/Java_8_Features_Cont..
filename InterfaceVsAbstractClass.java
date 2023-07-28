package com.java8.continuity;

/*                    FIELDS:
 * Interface--- field or variables public static final
 * 
 * abstract --- field or variables static ,non static ,final ,non final ,private, protected, variables
 *  
 * 					Constructors
 * 
 * Interface can't have constructors
 * 
 * abstract class can have any number of constructors
 * 
 * 
 * 					METHODS
 * By default interface public abstract methods from java 8 onwards it also contain  default and static methods
 * 
 * abstract class contain abstract,non static,static,final method,non-final methods
 * 
 * 
 * 						Member Accessibility
 * 
 * Members of interface default public
 * 
 * members of abstract class support private protected public members
 * 
 * 
 * 					Multiple Inheritances
 * 
 * class can extend only one abstract class but can implement multiple interfaces 
 */


interface Shape{
       public static final int x = 100;
       double getArea();
      
}
class Circle implements Shape
{
   private int a;
	public Circle(int num)
	{
		super();
		this.a=num;
	}
	@Override
	public double getArea() {
		return Math.PI*a;
	}
	
}

public class InterfaceVsAbstractClass 
{
	public static void main(String...args)
	{
		Circle c=new Circle(4);
		System.out.println(c.getArea());
		System.out.println(c.x);
	}

}
