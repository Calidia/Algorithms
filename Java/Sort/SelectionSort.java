import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args){
		int[] array = {7,1,4,2,3,10,15,29, 11,9,0};
		
		System.out.println(Arrays.toString(sort(array)));
	}
	
	public static int[] sort(int[] array){
		int minIndexPos = 0;
		int temp = 0;
			
		for(int i = 0; i < array.length - 1; i++){
			minIndexPos = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[minIndexPos]){
					minIndexPos = j;
				}
			}
      
			temp = array[i];
			array[i] = array[minIndexPos];
			array[minIndexPos] = temp;
		}
		
		return array;
	}
}