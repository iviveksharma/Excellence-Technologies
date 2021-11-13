import java.util.Scanner;
class SumMul
{
	public static void calc(int a, int b)
	{
		int num1= a, num2=b, result=0;
					
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select the Option :-(*, +) ");
		String sym=sc.next();
		
		switch(sym)
		{
			case "+": result= a+b;
			System.out.println("Sum of A and B is :- "+result);
			break;
			
			case "*": result= a*b;
			System.out.println("Multiplication of A and B is :- "+result);
			break;
			
			default : 
			        System.out.println("invalid Symbol ");
					break;
		}
	}
	public static void main(String[] args)
	{
		calc(10,20);
		
	}
}