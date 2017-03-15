package JAVA2;

public class UsingString {
	


	public static void main(String[] args) {
		String value =  "Sample Text"; // gets already created value
		 
	     value = value+" Bobby"; //creating a new reference 
	     System.out.println("using String: "+value);
	     
	     
	     StringBuffer value1 = new StringBuffer("appended ");
	     value1.append("using append method"); // mutable
	     System.out.println(" using string Buffer: "+value1);
	     
	     
	     // using StringBuilder
	     StringBuilder value2 = new StringBuilder("appended ");
	     value2.append("using append method ");
	     System.out.println("using StringBuilder: "+value2);
	}

}


