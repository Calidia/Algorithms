public class BinarySearch{
	public static void main(String[] args)
	{
		int[] array = new int[100];
	
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}
		
		System.out.println(search(array, 2));
	}
	
	public static int search(int[] array, int elem)
	{
		int midIndex, upper, lower;
		midIndex = lower = 0;
		upper = array.length;
		
		while(lower <= upper)
		{
			midIndex = lower + (upper - lower)/2;
			if(array[midIndex] == elem)
				return midIndex;
			else if(elem < array[midIndex])
				upper = midIndex - 1;
			else
				lower = midIndex + 1;
		}
		return -1;
	}
}