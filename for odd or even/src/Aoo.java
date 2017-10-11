import java.util.Scanner;

public class Aoo 
{
	int n,i;
	Scanner g1=new Scanner(System.in);
	void f1()
	{
		System.out.println("enter the n value:\n");
		n=g1.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println("the number is even:\n");
				}
			else
			{
				System.out.println("the number is odd:\n");
			}
		}
	}
}
class Spp
{

	public static void main(String[] args) 
	{
     Aoo n=new Aoo();
     n.f1();
	}
}

