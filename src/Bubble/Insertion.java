package Bubble;

public class Insertion {
	public static void main(String[] args)
	{
		int[] Array= {100,40,1,97,3,89,-22};
		for(int i=1;i<Array.length;i++)
		{
			int element =Array[i];
			int j;
			for(j=i;j>0&&Array[j-1]>element;j--)
			{
				Array[j]=Array[j-1];
				
			}
			Array[j]=element;
	}
		for(int i=0;i<Array.length;i++)
		{
			System.out.println(Array[i]);
		}
	}


}
