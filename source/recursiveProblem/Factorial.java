package recursiveProblem;

public class Factorial {

	public static void main(String...s)
	{
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		
		return (n* factorial(n-1));
		
	}
}
