package Bubble;

public class Shell {
	public static void main(String[] args)
	{
		int[] Array= {-20,30,40,10,-100,20,10};
		for(int gap=Array.length/2;gap>0;gap=gap/2)
		{
			for(int i=gap;i<Array.length;i++)
			{
				int element=Array[i];
				int j=i;
				while(j>=gap&&Array[j-gap]>element)
				{
					Array[j]=Array[j-gap];
					j-=gap;
				}
				Array[j]=element;
			}
		}
			
	for(int i=0;i<Array.length;i++)
	{
		System.out.println(Array[i]);
	}

}
}
