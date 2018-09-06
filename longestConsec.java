import java.util.HashMap;

public class longestConsec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = longestConsec2(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3);
		System.out.println(answer);

	}
	
	
    public static String longestConsec2(String[] strarr, int k) {
        String ans ="";
        int stringLen = strarr.length;
        if(k>0|| stringLen>=k) {
        	int totalLength=0;
        	String stringCombo ="";
        	for(int loop=0; loop< strarr.length-k+1; loop++) {
        		int totalCount= 0;
        		StringBuilder stringBuilder = new StringBuilder();
        		for(int loop2=0; loop2< k; loop2++) {
        			totalCount+=strarr[loop+loop2].length();
        			stringBuilder.append(strarr[loop+loop2]);
        		}
        		if(totalCount>totalLength) {
        			totalLength= totalCount;
        			stringCombo = stringBuilder.toString();
        		}
        				
        		
        	}
        	ans = stringCombo;
        }
        
    	return ans;
    }

}
