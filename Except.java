package EXCEPTIONHANDELING;
import java.util.Scanner;
public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter secound number");
		int b=sc.nextInt();
		try
		{
			int c= a/b;
			System.out.println(c);

	}
		catch(ArithmeticException e)
{
System.out.println(e);	

	System.out.println("unsupported opration");

}
}}
