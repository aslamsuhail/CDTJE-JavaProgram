package reverseconcept;

import java.util.Scanner;

public class string 
{
public static void main(String[]args )
{
	Scanner sc=new Scanner(System.in);
	String first=sc.nextLine();
	String[] s=first.split(" . ");
	String temp="";
	int opt=sc.nextInt();
	for (int i = 0; i < s.length; i++) 
	{
	temp=temp+" "+new StringBuffer(s[i]).reverse().toString();
	}
	temp=temp.trim();
	if(opt==0)
	{
		System.out.println(temp);
	}
	char c[]=temp.toCharArray();
	if(opt==1)
	{
		for (int i = 0; i < first.length(); i++) 
		{
			if(Character.isUpperCase(first.charAt(i)))
			c[i]=Character.toLowerCase(c[i]);
			else if(Character.isLowerCase(first.charAt(i)))
			c[i]=Character.toLowerCase(c[i]);
		}
		String s2=String.valueOf(c);
		System.out.println(s2);
	}
	char c1[]=temp.toCharArray();
	if(opt==2)
	{
		for (int i = 0; i < first.length(); i++) 
		{
		if(Character.isUpperCase(temp.charAt(i)))
		c1[i]=Character.toLowerCase(c1[i]);
		else if(Character.isLowerCase(temp.charAt(i)))
		c1[i]=Character.toUpperCase(c1[i]);
		}
		String s3=String.valueOf(c1);
		System.out.println(s3);
	}
		}
		}
	
	
			
