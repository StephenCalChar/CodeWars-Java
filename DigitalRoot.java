
public class DigitalRoot {

	public static void main(String[] args) {
		int ans = digital_root(456);
		System.out.println(ans);

	}
	
	
  public static int digital_root(int n) {
	    if (n>9) {
	    	String[] numArray = Integer.toString(n).split("");
	    	int runningTotal =0;
	    	for(String num: numArray) {
	    		int singleDigit = Integer.parseInt(num);
	    		runningTotal+= singleDigit;
	    	}
	    	if (runningTotal>9) {
	    		runningTotal = digital_root(runningTotal);
			}
	    	return runningTotal;
	    	
	    }
	    return n;
	  }

}
