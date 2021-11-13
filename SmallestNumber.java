class SmallestNumber
{
	public static void SmallSearch(int[] arrry)
	{
		for(int i=0; i<arrry.length; i++)
		{
		   for(int j=i+1; j<arrry.length; j++)
		   {
			   if(arrry[i]>arrry[j])
			   {
				   int temp=arrry[i];
				   arrry[i] = arrry[j];
				   arrry[j] = temp;
			   }
		   }
		}
		System.out.println("Two Smallest Number is "+arrry[0]+ " and " +arrry[1]);
	}
	public static void main(String[] args)
	{
		int[] arrry={23,12,10,45,54,24,78,};
		SmallSearch(arrry);
	}
}