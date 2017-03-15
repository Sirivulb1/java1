package JAVA2;

public class Rectangle extends Shape {
	
	public Rectangle(double d1,double d2)
	{
		super(d1,d2);
	}
	public double area()
	{
		return dim1*dim2;
	}

	public static void main(String args[])
	{
	Rectangle r=new Rectangle(40,20);
	System.out.println("area of recatngle"+r.area());
	}



}
