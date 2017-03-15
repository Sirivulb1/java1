
public class nestedloop {

	public static void main(String[] args) {
		/*
		 * while-->3
		 * for--->5
		 * Do while--->6
		 */
		int i=0;
		int count=0;
		while(i<3)
		{
		 for(int j=0;j<5;j++)
		 {
			int k=0;
			 do
			 {
				 System.out.println("i--->"+i +"j---->"+ j +"k---->"+ k);
				 System.out.println(count);
				 k++;
				 count++;
			 }
			 while(k<6);
			
		 }
		 i++;
		
				 
		}
	}

}
