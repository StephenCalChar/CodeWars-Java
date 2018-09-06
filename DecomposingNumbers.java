import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;

public class DecomposingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = decompose(50);
		//System.out.println(result);
		

	}
	
	public static String decompose(long n) {
		
		//Will Use these for the calculation
		long sqrdInput = n * n;
		int numSize =(int)n-1;
		int[] numberArray = new int[numSize];
		String data = "";
		int counter=0;
		for(int loop=numSize-1;loop>=0;loop--) {
			numberArray[counter] = (loop+1)*(loop+1);
			data+= numberArray[counter]+ ", ";
			counter++;
		}
		System.out.println(data);
		ArrayList<Integer> ans = getRecursive(numberArray, 0, (int)sqrdInput);
		
		//Recursion call here

		System.out.println(ans);	
		return null;
		  
	}
	/*
	public static int getTotal(int[] numberArray, int pos1, int pos2) {
		int sum =0;
		for(int loop=0; loop< pos2; loop++) {
			sum+= numberArray[loop+pos1];
		}
		return sum;
	}
	*/
	
	public static ArrayList<Integer> getRecursive(int[] numberArray, int total, int target) {
		if(total==target) {
			ArrayList<Integer> answerList = new ArrayList<Integer>();
			answerList.add(numberArray[])
		}
		
		//System.out.println(index);
		//System.out.println(total);
		//System.out.println(target);
		//check here toi make sure not end of array.
		for(int loop =0; loop< numberArray.length; loop++) {
			if(target-numberArray[loop]>0) {
				ArrayList<Integer> answerList = getRecursive(numberArray, total-numberArray[loop], target);
				return answerList;
			}

		}
		

	}
	
	
	

}
