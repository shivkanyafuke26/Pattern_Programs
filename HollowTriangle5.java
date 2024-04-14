class HollowTriangle5{
	public static void main(String[] args) {

for(int i=1;i<=5;i++)
		{

			for(int m=1;m<=i-1;m++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=i;k--)
			{
				if(i==1 || k==5 ||i==k)
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