
import java.util.HashMap;
import java.util.Map;

public class Demo 
{
	Map<Integer,String> g1=new HashMap<Integer,String>();
	void get()
	{
		g1.put(101,"suhail");
		g1.put(102,"aslam");
		
		for(Map .Entry m:g1.entrySet())
		{
			System.out.println("your value is:\n"+m.getKey()+""+m.getValue());
		}
		System.out.println("your size is:\n"+g1.size());
		System.out.println("remove the element is:\n"+g1.remove(101));
		System.out.println("search the data is:\n"+g1.containsKey(101));
		System.out.println("after removing size is :\n"+g1.size());
		}

	}
class Demo1
{

	public static void main(String[] args)
	{
	 Demo h=new Demo();
	 h.get();
	}

}
