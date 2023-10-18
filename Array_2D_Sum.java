class Array_2D_Sum
{
	public static void main(String args[])
	{
		int i, j, r=2, c=2;
		
		int a[][]= { {1,2,},{4,5} };
		int b[][]= { {2,3,},{1,4} };
		int sum[][]= new int[r][c];
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				
			
			}
		}
		System.out.println("addtion of two d aray");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				
				System.out.println(sum[i][j]);
			
			}
			System.out.println();
		}
			
	}
}