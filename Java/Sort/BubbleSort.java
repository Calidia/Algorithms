import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){
		int[] array = {7,1,4,2,3,10,15,29, 11,9,0};
		
		System.out.println(Arrays.toString(sort(array)));
	}
	
	public static int[] sort(int[] array){
		int temp = 0;
		int sortedIndex = 0;
		
		for(int i = array.length-1; i > sortedIndex; i--)
		{
      System.out.println("First for loop" + Arrays.toString(array));
			for(int j = array.length-1; j > sortedIndex; j--){
        System.out.println("Second for loop" + Arrays.toString(array));
				if(array[j] < array[j-1]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			sortedIndex++;
		}
		
		return array;
	}
}