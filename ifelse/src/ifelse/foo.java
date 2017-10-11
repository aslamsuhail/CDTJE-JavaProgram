package ifelse;

import java.util.Scanner;

public class foo 
{
int salary,bns;
Scanner g1=new Scanner(System.in);
void f1()
{
	System.out.println("your salary is:\n");
	salary=g1.nextInt();
}
void f2()
{
	if (salary>3000)
	{
		bns=salary-1000;
		System.out.println("your salaryis:\n"+bns);
	}
}
}
class Aoo
{
	
	public static void main(String[] args)
	{
	foo n=new foo();
	n.f1();
	n.f2();

	}

}
