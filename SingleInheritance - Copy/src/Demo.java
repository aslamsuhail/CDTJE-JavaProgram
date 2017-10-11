import java.util.Scanner;

public class Demo
{
  int pid;
  Scanner g1=new Scanner(System.in);
  void get()
  {
	  System.out.println("BaseClass"+pid);
	 pid= g1.nextInt();
  }
}
class D extends Demo
{
	void get2()
	{
		System.out.println("Derived Class"+pid);
	}
}
class Foo
{
	public static void main(String[] args) 
	{
		
		D f=new D();
		f.get();
		f.get2();

	}

}
