

/*
class RandomNumberPattern
{
	public static void main(String[] args)                            //1
	{																  //3 2
																	  //6 5 4
 int j = 1;
  System.out.println(j);
  for(int i = 3 ; i >1 ; i--)
  {
    System.out.print(i+" ");
   }
   System.out.println();
    for(int i = 6 ; i >3 ; i--)
  {
    System.out.print(i+" ");
   }
   System.out.println();

    for(int i = 10 ; i >6 ; i--)
  {
    System.out.print(i+" ");
   }
   System.out.println();
   
    for(int i = 15 ; i >10 ; i--)
  {
    System.out.print(i+" ");
   }
   System.out.println();

}
}
*/



class RandomNumberPattern
{
	public static void main(String[] args) {
		int num1=1, num2=1;
		
		for(int i=1;i<=5;i++)
		{
			        
			for(int j=1;j<=i;j++)
				{
					System.out.print(num1-- +" ");
					++num2;

				}
				num1=++num2;
				System.out.println();
		}
			
	}
}




