import java.util.ArrayList;

public class Person {
	private int age;
	private String name;
	ArrayList<Person> friends;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		friends = new ArrayList<Person>();
	}
	
	
	public void setAge(int age) {
		this.age= age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Person> getFriends() {
		return friends;
	}


	public void setFriends(ArrayList<Person> friends) {
		this.friends = friends;
	}


	public int getAge() {
		return age;
	}

}

