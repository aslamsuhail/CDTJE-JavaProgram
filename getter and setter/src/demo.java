import javax.swing.Box;

public class demo
{
	public static void main(String arg[])
	{
		box box=new box();
		
		box.setBase(10.0);
		box.setHeight(20);
		
		double area;
		area=0.5 * (box.getBase()*box.getHeight());
		
		System.out.println("total width of the box:"+area);
	}
}