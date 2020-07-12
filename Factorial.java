package src;
import java.util.Scanner;

public class Factorial {

	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.println("enter the number");
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		if(number <= 30)
		{
			fact=factorial(number);
			System.out.println("Factorial of "+ number + " is " + fact);
		}
		else
		{
			System.out.println("It goes beyond the limit of int");
		}
	}

}
