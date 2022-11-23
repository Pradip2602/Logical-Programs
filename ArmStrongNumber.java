import java.util.Scanner;
class Test
{
		public static void main(String [] args)
		{
			// checking the number is armstrong.
 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			armStrong(num);
		}
		static void armStrong(int n)
		{
			int num1 = n;
			int len = 0;
		
			// checking length of number.
			while(num1!=0)
			{
				len = len+1;
				num1 = num1/10;
			}
			int num2 = n;
			int r, arm = 0;

			while(num2!=0)
			{
				int mult = 1;
				r = num2%10;

				for(int i = 1; i<=len; i++)
				{
					mult = mult*r;
				}
				arm = arm+mult;
				num2 = num2/10;
			}	
			if(arm==n)
			{
				System.out.println(n + " is armstrong number");
			}	
			else
			{
				System.out.println(n + " is not armstrong number");
			}	
		}
}
