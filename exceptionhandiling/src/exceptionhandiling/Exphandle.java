package exceptionhandiling;

public class Exphandle 
{
	public static void main(String arg[])
	{
		int var1=42,var2=0,result;
		
		try
		{
		result=var1/var2;
		System.out.println("Result:"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Arised:"+ae);
		}
		System.out.println("After the Print");
	}
}



