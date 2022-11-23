class Test 
{
		public static void main(String [] args)
		{
				/* swapping number by using third variable 
				
				int a = 10 , b = 20;
				int temp = 0;
				
				System.out.println("Before swapping "+a+" "+b );
			
						temp = a;
						a = b;
						b = temp;

				System.out.println("after swapping "+a+" "+b );
				
				*/

				// swapping number without using third variable
				
				int a = 10 , b = 20;
				int temp = 0;
				
				System.out.println("Before swapping "+a+" "+b );
			
						a = a+b;
						b = a-b;
						a = a-b;
	
				System.out.println("after swapping "+a+" "+b );
				
		}
}
