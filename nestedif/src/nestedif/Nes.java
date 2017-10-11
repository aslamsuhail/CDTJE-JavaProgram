package nestedif;

import java.util.Scanner;

public class Nes
{
 int age,salary,ans;
 Scanner s1=new Scanner(System.in);
 void f1()
 {
	 System.out.println("enetr the age is:\n");
	 age=s1.nextInt();
 }
 void f2()
 {
	 if(age>58)
	 {
		 System.out.println("enter the salary is:\n");
		 salary=s1.nextInt();
	 }
	 if (salary>40000)
	 {
		 ans=salary-4000;
		 System.out.println("your salary is:\n "+ans);
		 
		 
	 }
 }
}
 class Ass
 {
 
	public static void main(String[] args) 
	{
		Nes n=new Nes();
		n.f1();
		n.f2();
	}

}
