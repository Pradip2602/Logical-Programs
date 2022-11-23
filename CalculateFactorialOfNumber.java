import java.util.Scanner;
class Test
{
		public static void main(String [] args)
		{
				// Reverse the number 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number : ");
				int num = sc.nextInt();
				factorial(num);
		}
		static void factorial(int n)
		{
			int num = n;
			int factorial = 1;
			for(int i = 1; i<=num; i++)
			{
				factorial = factorial*i;
			}
			System.out.println("Factorial of number is : "+factorial);
		}
}
