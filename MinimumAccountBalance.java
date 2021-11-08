package EXCEPTIONHANDELING;
import java.util.Scanner;
public class MinimumAccountBalance extends Exception {
MinimumAccountBalance(String msg) {
	super(msg);
}

	static double current_balance=100;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("enter withdraw amount");
int c=sc.nextInt();
try
{
	if(current_balance>=c)
	{
		System.out.println("withrow ="+c);
	}
	else
	{
		throw new MinimumAccountBalance("insufficiantBalanceBException");
	}

	}
catch(MinimumAccountBalance e)
{
	e.printStackTrace();
}
try
{
	if(c<0)
	{
		throw new MinimumAccountBalance("illegalBankTransictionException");
	}
/*else
	{
		System.out.println("withdraw ammount"+c);
	}*/
}	
	catch(MinimumAccountBalance e)
	{
	   e.printStackTrace();
	}
}


		

}


