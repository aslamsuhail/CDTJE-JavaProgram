package forloop;

import java.util.Scanner;

public class Sas 
{
	int n,i;
	Scanner g1=new Scanner(System.in);
	void f1()
	{
		System.out.println("enter the value is:\n");
		n=g1.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("I value is:\n"+i);
			
		}
	}
}
	class demo
	{

	public static void main(String[] args)
	{
   Sas n=new Sas();
   n.f1();
	}
	}

