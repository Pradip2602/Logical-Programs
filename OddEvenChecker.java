import java.util.Scanner;
class Test
{
		public static void main(String [] args)
		{
				// find the number is odd or even

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int num = sc.nextInt();
				
				if(num!=0)
				{
					if(num%2==0)
					{
						System.out.println(num+" is even number");
					}
					else
					{
						System.out.println(num+" is odd number");
					}
				}
		}

}
