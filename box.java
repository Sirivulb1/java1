
public class box
{
	private double length,bredth,height;
	
	public void setLength(double l)
	{
		length=l;
    }
	public void setBredth(double b)
	{
		bredth =b;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public double volume()
	{
		return length*bredth*height;
	}
	public static void main (String args[])
	{
		box b=new box();
		b.setLength (10.0);
		b.setBredth(15.0);
		b.setHeight(10.0);
		
		System.out.println("volume "+b.volume());
		
	}
	
}
