import java.util.Scanner;

public class Foo 
{
   int n,i;
   int productid[]=new int[10];
   Scanner g=new Scanner(System.in);
   void f1()
   {
	   System.out.println("enter the value is:\n");
	   n=g.nextInt();
	   for(i=0;i<=n;i++)
	   {
		   System.out.println("eneter the array value is:\n");
		   productid[i]=g.nextInt();
	   }
	   for(i=0;i<=n;i++)
	   {
		   System.out.println("the result is:\n");
	   }
	   }
}
   class Demo
   {

	public static void main(String[] args)
	{
	Foo n=new Foo();
	n.f1();
	}

}
