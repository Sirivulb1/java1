package JAVA1;

public class ReturnandParameter {
	

	java.lang.String printString(java.lang.String val)
	{
		return "hello"+val;
	}
	public static void main(String[] args) {
		ReturnandParameter obj = new ReturnandParameter();
		java.lang.String val="  Bobby Sirivuluri";
		System.out.println(obj.printString(val));
	}
}


