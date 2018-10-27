public class LinearSearch{
    public static void main(String[] args)
    {
        int[] array = new int[100];
	
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}
		
		System.out.println(search(array, 101));
    }
	
	public static boolean search(int[] array, int elem)
	{
		int pos = 0;
		
		while(pos < array.length)
		{
			if(array[pos] == elem)
				return true;
			else
				pos++;
		}
		return false;
	}
}