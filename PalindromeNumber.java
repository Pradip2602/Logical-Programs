import java.util.Scanner;
class Test
{
		public static void main(String [] args)
		{
				// check the number is palindrome 

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int num = sc.nextInt();
				
				palindrome(num);
		}
		static void palindrome(int n)
		{
			int num = n;
			int r, rev = 0;
			while(num!=0)
			{
				r = num%10;
				rev = (rev*10)+r;
				num = num/10;
			}
			if(rev == n)
			{
				System.out.println(n+" is palindrome number");
			}
			else
			{
				System.out.println(n+" is not palindrome number");
			}
		}
}
