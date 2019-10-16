package task6;

public class Students {

	String name;
	String lastName;

	Students(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return name + " " + lastName + " ";
	}

}
