package JAVA1;

public class Voidmethod {
	
	void printit() //void method
	{
		System.out.println("This is a void method and doesnt have return type");
	}
   void printName(java.lang.String string)
   {
	   System.out.println(string);
   }
	public static void main(String[] args) { //main method: execution starts from here
		Voidmethod m = new Voidmethod(); // creating an object to invoke the method 
		m.printit(); // calling method with object m
		m.printName("Bobby");		
	}

}
