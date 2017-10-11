package mulitlevelinher;

import java.util.Scanner;

public class sorting
{

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	 int size=sc.nextInt();
	 int temp;
	 int array[]=new int[size];
	 for (int i = 0; i<size; i++)
	 {
		array[i]=sc.nextInt();
		System.out.println(array[i]);
	}
	 for (int i = 0; i < size; i++) 
	 {
		 for(int j = i+1; j < array.length; j++) 
		 {
			 
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
		
	}
	 for (int i = 0; i < size; i++) 
	 {
		System.out.println(array[i]);
	}
	}

}
