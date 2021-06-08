package Bubble;

public class Selection {
	public static void main(String[] args) {
		int [] Array= {-20,33,-100,75,23,12,18};
		for(int i=Array.length-1;i>0;i--)
		{
			int largest=0;
			for(int j=1;j<i;j++)
			{
				if(Array[j]>Array[largest])
					largest=j;
		}
			swap( Array,largest,i);
		}
		
		for(int i=0;i<Array.length;i++)
		{
			System.out.println(Array[i]);
		}
		
	}


	
	private static void swap(int[] Array, int a, int b) {
		int temp=Array[a];
		Array[a]=Array[b];
		Array[b]=temp;
				
	}

}
