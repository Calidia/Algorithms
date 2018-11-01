import java.util.Arrays;

/**
 * Bubble Sort implementation.
 */
public class BackwardBubbleSort{
	public static void main(String[] args){
		int[] array = {7,1,4,2,3,10,15,29, 11,9,0};
		
		System.out.println(Arrays.toString(sort(array)));
	}
	
	public static int[] sort(int[] array){
		int temp = 0;
		int sortedIndex = 0;
		
		for(int i = array.length-1; i > sortedIndex; i--)
		{
			for(int j = array.length-1; j > sortedIndex; j--){
				// Elements are swapped if the succeeding elem is smaller than
				// the preceding.
				if(array[j] < array[j-1]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			// Sorted boundary is updated so that the elements are not gone over again.
			sortedIndex++;
		}
		
		return array;
	}
}