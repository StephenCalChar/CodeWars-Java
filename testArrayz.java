
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.naming.LinkLoopException;

public class testArrayz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] theArrayz = {1,2,3,4,5,6,7,8,9};
		int[] newArray = reverseArray(theArrayz);
		for(int number: newArray) {
			System.out.println(number);
		}
		
		



	}
	
	
	public static int[] reverseArray(int[] array) {
		int arrayLen = array.length;
		int[] newArray = new int[arrayLen];
		arrayLen-=1;
		for(int loop =0;loop<newArray.length; loop++) {
			newArray[loop]=array[arrayLen-loop];
		}
		return newArray;
	}

}
