package primenumber;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) 
	{
       int var1,result=0;
		
		System.out.println("Enter the Value:");
		Scanner scanner=new Scanner(System.in);
		var1=scanner.nextInt();
		
		while(var1>0)
		{
			result+=(var1%10);
			var1=var1/10;
		}
		
		System.out.println("Added Digits Result:"+result);
	}
	}


