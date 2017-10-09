import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {
	
	public static void printPairsUsingHashSet(int[] numbersArr, int n){ 
		if(numbersArr.length < 2){ 
			return; 
		} 
		
		Set set = new HashSet(numbersArr.length); 
		//System.out.println("Set"+set);
		for(int number : numbersArr){ 
			int target = n - number; 
			if(!set.contains(target)){ 
				set.add(number); 
			}else 
			{ System.out.printf("(%d, %d) %n", number, target);
			} 
		} 
		
		//System.out.println("Set"+set);
		
	} 
	public static void printPairs(int[] array, int key){ 
		System.out.println("Given Array is : " + Arrays.toString(array)); 
		System.out.println("Sum number is: " + key); 
		System.out.println("Required pair of numbers: "); 
		printPairsUsingHashSet(array, key); 
	} 
	
	public static void main(String args[]) { 
		int[] array1 = {8, 9, 5, 4, 0, 10, 2, 11, 1, 7};
		printPairs(array1, 12); 
	} 
} 

