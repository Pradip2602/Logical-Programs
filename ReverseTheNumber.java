import java.util.Scanner;
class Test
{
		public static void main(String [] args)
		{
				// Reverse the number 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number : ");
				int num = sc.nextInt();
				reverse(num);
		}
		static void reverse(int n)
		{
			int num = n;
			int r, rev = 0;
			while(num!=0)
			{
				r = num%10;
				rev = (rev*10)+r;
				num = num/10;
			}
			System.out.println("The reverse is: "+rev);
		}
}
