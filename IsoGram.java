import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IsoGram {

	public static void main(String[] args) {
		String input ="Dermatoglyphics";
		String[] inputAsList;
		Boolean isIsogram;
		Set<String> letters = new HashSet<String>();
		
		inputAsList=input.split("");

		for(int loop=0; loop<inputAsList.length;loop++) {
			isIsogram=letters.add(inputAsList[loop]);
			System.out.println(isIsogram);
		}
		
		
		
	}

}
