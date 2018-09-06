import java.awt.Font;
import java.awt.List;
import java.awt.datatransfer.FlavorListener;
import java.lang.reflect.Array;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import javax.naming.spi.DirStateFactory.Result;

public class RecreationTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=2;
		long b=3;
		long c=4;
		long d=5;
		
		ArrayList<long[]> results  = prod2Sum(a, b, c, d);
		for(long num[]: results) {
			System.out.println(num[0]);
			System.out.println(num[1]);

		}

	}
    public static ArrayList<long[]> prod2Sum(long a, long b, long c, long d) {
        long first = (a*a)+(b*b);
        long second = (c*c)+(d*d);
        long result = first * second;
        ArrayList<long[]> answers = new ArrayList<long[]>();
        int counter=1;
        for(int loop =0; loop<result; loop++) {
        	for(int loop2=0; loop2<result;loop2++) {
        		if((long)((loop*loop)+ (loop2* loop2))==result) {
        			long[] foundMatch = {(long) Math.min(loop, loop2),(long)Math.max(loop, loop2)};
        			//Arrays.sort(foundMatch);
        			boolean canBeAdded= true;	
        			for(long[] addedCombo: answers) {
        				if(addedCombo[0]== foundMatch[0]&& addedCombo[1]== foundMatch[1]) {
        					canBeAdded =false;
        				}	
        			}
        			if(canBeAdded) {
        				answers.add(foundMatch);
        			}			
        		}
        	}
        }
 
        return answers;
    }

}
