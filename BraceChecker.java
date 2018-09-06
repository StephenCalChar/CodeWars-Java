
public class BraceChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String braces ="[(])]";
		String [] inputAsArray = braces.split("");
		boolean sqrBracket = false;
		boolean bracket = false;
		boolean crlyBracket = false;
		boolean isBroke =false;
		
		for(String item: inputAsArray) {
			if(item.equals("[")) {
				if(sqrBracket== true) {
					isBroke=true;
				}
				else {
					sqrBracket= true;
				}				
			}
			else if(item.equals("{")) {
				if(crlyBracket== true) {
					isBroke=true;
				}
				else {
					crlyBracket= true;
				}
				
			}
			else if(item.equals("(")) {
				if(bracket== true) {
					isBroke=true;
				}
				else {
					bracket= true;
				}
			}
			else if(item.equals("]")) {
				if(sqrBracket== true) {
					sqrBracket=false;
				}
				else {
					isBroke=true;
				}
			}
			else if(item.equals("}")) {
				if(crlyBracket== true) {
					crlyBracket=false;
				}
				else {
					isBroke=true;
				}
			}
			else if(item.equals(")")) {
				if(bracket== true) {
					bracket=false;
				}
				else {
					isBroke=true;
				}
			}
				
		}
		System.out.println(isBroke);
	}

}
