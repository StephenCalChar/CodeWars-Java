import java.util.ArrayList;


public class Outlier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
		int ans =find(exampleTest2);
		System.out.println(ans);

	}
	public static int find(int[] integers){
		int outlier;
		ArrayList<Integer> odds = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		for(int loop=0;loop< integers.length; loop++) {
			if(integers[loop]%2== 0) {
				evens.add(integers[loop]);
			}
			else {
				odds.add(integers[loop]);
			}
		}
		if(odds.size()==1) {
			outlier = odds.get(0);
		}
		else {
			outlier= evens.get(0);
		}
		
		return outlier;
	}

	

}
