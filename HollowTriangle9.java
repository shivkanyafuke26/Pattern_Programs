class HollowTriangle9{
	public static void main(String[] args) {
		for(int i=4;i>=1;i--)
		{

			for(int m=1;m<=i-1;m++)
			{
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--)
			{
				if( k==4 ||i==k)
				{
				System.out.print(" *");	
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

for(int i=1;i<=5;i++)
		{

			for(int m=1;m<=i-1;m++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=i;k--)
			{
				if(k==5 ||i==k)
				{
				System.out.print("* ");	
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}








	}
}