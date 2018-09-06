
public class HighestScoringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String highest = high(" take me to semynak");
		System.out.println(highest);
	

	}
	
	public static String high(String s) {
		String words[] = s.split(" ");
		int highestScore =0;
		String highestWord ="";
		char aAsChar = (char)'a';
		int unicodeStartValue = (int) aAsChar-1;
		for(int loop=0; loop< words.length; loop++) {
			String[] splitWord = words[loop].split("");
			char[] charArray = words[loop].toCharArray();
			int currentScore =0;
			for(int loop2=0; loop2< charArray.length; loop2++) {
				int letterValue =(int)charArray[loop2]-unicodeStartValue;
				currentScore+=letterValue;
			}
			if(highestScore<currentScore) {
				highestScore=currentScore;
				highestWord=words[loop];
			}
		}
		return highestWord;
	}

}
