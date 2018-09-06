import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int theBoard [][]= new int[10][10];
		
		Person peter = new Person();
		peter.setAge(12);
		peter.setName("Peter");
		Person juan = new Person();
		juan.setName("Juan");
		peter.friends.add(juan);
		
		theBoard[4][5] =7;

		for(int loop =0; loop<5; loop++) {
			juan.friends.add(juan);
		}
		
		for(Person person: peter.friends) {
			person.setName("Tomoooo");
			System.out.println(person.getName());
	
		}
		
		
		
		
		
		

	}

}
