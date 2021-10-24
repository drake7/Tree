package recursiveProblem;

public class Fibbonacci {

	public static void main(String...s)
	{
		int n=20;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(fibb(i) +"  ");
		}
		
	}
	
	
	public static int fibb(int n)
	{
		if (n==0)
		return 0;
		
		if(n==1 || n==2)
			return 1;
		else 
			return (fibb(n-1)+fibb(n-2));
		
		
		
	}
}
