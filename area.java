

public class area

{
    private final double pi=3.14;
    
    private double radius,area,peremeter;
    
    public void setradius(double r)
    {
    	radius=r;
    }
    public double areaofcircle()
    {
    	return area=pi*radius*radius;
    	
    }
    public double peremeterofcircle()
    {
    return 	peremeter=2*pi*radius;
    }
    public static void main(String args[])
    {
    	area a=new area();
    	a.setradius(10);
    	
    	System.out.println("area of circle: "+a.areaofcircle());
    	System.out.println("peremeter of circle: "+a.peremeterofcircle());
    	
    	
    }
    
    
    	
        
    
    
    
    
}
