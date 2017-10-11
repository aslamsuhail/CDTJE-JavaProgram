package overriding;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class School
{
void get_School_marks(int mark1,int mark2,int mark3,int total_mark)
{
	System.out.println(mark1);
	System.out.println(mark2);
	System.out.println(mark3);
	System.out.println(total_mark);
}
}
class School_Info  extends School
{
	void get_School_marks(int mark1,int mark2,int mark3,int total_mark)
	{
		System.out.println("total_mark");
		total_mark=mark1+mark2+mark3;
		System.out.println(total_mark);


if(total_mark>250)
{
	System.out.println("the student is pass:\n");
}
else
{
	
	System.out.println("the student is fail");
}
	}	
	
	public static void main(String[] args) 
	{
		School_Info b=new School_Info();
		Scanner sc=new Scanner(System.in);
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int total_mark=0;
		b.get_School_marks(mark1, mark2, mark3, total_mark);
		
		
	}

}