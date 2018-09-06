import java.util.LinkedList;

import javax.swing.JOptionPane;

public class tesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> theList = new LinkedList<Integer>();
		theList.add(8);
		theList.add(9);
		JOptionPane.showMessageDialog(null, theList.pop());
		for(int digit: theList) {
			System.out.println(digit);
		}

	}

}
