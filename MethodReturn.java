package JAVA1;

public class MethodReturn {
	
	
		java.lang.String printString()
		{
			return "Any String";
		}
		
		int printInt()
		{
			int k = 35; //Variable scope is within method only
			return k; // returning through value
		}

		double printDouble(double d) // return type with parameter
		{
			return d;
		}
		float printfloat()
		{
			float k = 6.8f; // a float value should always end with f 
			return k;
		}
		public static void main(String[] args) {
			MethodReturn m = new MethodReturn(); // creating an object to access the methods
			 java.lang.String val = m.printString(); // as printString method returns a value, Created val to store the returned value
			 System.out.println(val);
			 System.out.println(m.printInt()); // can be printed directly
			 double d = 2.9773;
			 System.out.println(m.printDouble(d));
			 
			 
		}
	}


