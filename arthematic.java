

public class arthematic 
{

	public int a,b;
	 public void  calc(int n1,int n2)
	 {
		 a=n1;
		 b=n2;
		 
	 }
	 public int add()
	 {
		 return a+b;
		 
	 }
	 public int mul()
	 {
		 return a*b;
		 
	 }
	 public int sub()
	 {
		 return a-b;
		 
	 }
	 public int div()
	 {
		 return a/b;
		 
	 }
	 public static void main(String args[])
	 {
		 arthematic c= new arthematic();
		 c.calc(4,2);
		 System.out.println("add"+c.add());
		 System.out.println("add"+c.sub());
		 System.out.println("add"+c.mul());
		 System.out.println("add"+c.div());
		 
	 }
	 
	 
	
	 
	 

}
