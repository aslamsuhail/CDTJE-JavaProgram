import java.util.Scanner;

public class Bank 
{
	void get_BankInfo(String name,long acc_no,String IFSC_code)
	{
		System.out.println(name);
		System.out.println(acc_no);
		System.out.println(IFSC_code);
	//	System.out.println(amount);
	}
}
	class balanceInfo extends Bank
	{
		void getBankInfo(float balance,float deposite,float amount)
		{
			System.out.println(balance);
			balance=deposite+amount;
		}
		
		public static void main(String[] args) 
	{
		balanceInfo b=new balanceInfo();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		long acc_no=sc.nextLong();
		String IFSC_code=sc.next();
		float amount=sc.nextFloat();
		float balance=sc.nextFloat();
		float deposite=0;
		b.get_BankInfo(name,acc_no,IFSC_code);
		b.getBankInfo(balance, deposite, amount);
	
	}

}
