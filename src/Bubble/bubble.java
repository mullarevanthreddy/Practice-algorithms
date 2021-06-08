package Bubble;

public class bubble {
	public static void main(String[] args)
	{
		int[] Array = {20,-10,35,1,-22,30,45};
		for(int i=Array.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(Array[j]>Array[j+1])
					Swap(Array,j,j+1);
			}
		}
		
		for(int i=0;i<Array.length;i++)
		{
			System.out.println(Array[i]);
		}
		
	}

	private static void Swap(int[] Array, int i, int j) {
	int temp= Array[i];
	Array[i]=Array[j];
	Array[j]=temp;
		
	}



}
