
public class box {
private double base,height; //class scope variable
	
	public void setBase(double b)
	{
		base=(b>0)?b:1;
	}
	
	public double getBase()
	{
		return base;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = (height>0)?height:1;
	}
	
	
}
	


