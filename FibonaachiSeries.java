
class Test
{
		public static void main(String [] args)
		{
			// Fibonaachi Series.
 
			int a = 0 , b = 1;
			int c;
			System.out.print(a+" "+b);

			for(int i = 0; i<=10; i++)
			{
				c = a+b;
				System.out.print(" "+c);
				a = b;
				b = c;
			}
		}
}
