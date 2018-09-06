

public class Esolang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String theString = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.";
		String stringTwo = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++.+++++++..+++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++.+++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.";
		String firstAns =MyFirstInterpreter(stringTwo);
		System.out.println(interpret(firstAns));
	}
    public static String MyFirstInterpreter(String code) {
	    //TODO perhaps some smart things prior
    	StringBuilder newString = new StringBuilder();
    	for(int loop=0; loop<code.length(); loop++) {
    		char currentLetter = code.charAt(loop);
    		if(currentLetter=='+'||currentLetter=='.') {
    			newString.append(currentLetter);
    		}
    	}
    	
    	
    	return newString.toString();
    	
    	
	}
	public static String interpret(String newString) {
		int memCell=0;
		StringBuilder finalString = new StringBuilder();
		for(int loop=0; loop<newString.length(); loop++) {
			char currentLetter = newString.charAt(loop);
			if(currentLetter=='+') {
				memCell++;
				if(memCell==256) {
					memCell=0;
				}
			}
			else {
				finalString.append((char)memCell);
			}
		}
	    return finalString.toString();
	}
	

}
