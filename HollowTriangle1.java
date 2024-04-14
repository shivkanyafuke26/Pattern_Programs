class HollowTriangle1{
public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------------------------");

		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++){
				if(i==5 || j==1 || i==j){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}


		System.out.println("-----------------------------------------------------------------------------------");

		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--)
			{

				if(i==5 || j==5 || i+j==6)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}
System.out.println("-----------------------------------------------------------------------------------");


}

}
