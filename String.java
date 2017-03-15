package JAVA1;

public class String {

	public static void main(java.lang.String[] args) {
		
		
		// TODO Auto-generated method stub
		
		java.lang.String x="i live in india";
        java.lang.String[] y=x.split(" ");
        //System.out.println(y[3]+" "+y[2]+" "+y[1]+" "+y[0]);
// if the input string is different meaning if the number of words are greater than or less than four then try this way

for(int i=y.length-1;i>=0;i--)
        {
            System.out.print(y[i]+ " ");
        }



    }


	}


