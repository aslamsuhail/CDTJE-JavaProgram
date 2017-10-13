package multilevelinher;

import java.util.Scanner;

public class Foo 
{ 
	int salary ,sid,s;
	Scanner g1=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the value is:\n");
		salary=g1.nextInt();
	}
}
	class D1 extends Foo
	{
		void get2()
		{
			if (salary>5000)
			{
			sid=salary-2000;
			System.out.println("Your Salary is:\n"+sid);
			}
			else
			{
				sid=salary+2000;
				System.out.println("your salary is:\n"+sid);
			}
			
		}
	}
		class D2 extends D1
		{
			void get3()
		
		{
				if(sid>1000)
				{
					s =sid+4000;
			System.out.println("total salary is:\n"+s);
				}
		}
	}



class Soo
{
	public static void main(String[] args) 
	{
		D2 F=new D2();
		F.get();
		F.get2();
		F.get3();
	}
		
	}


