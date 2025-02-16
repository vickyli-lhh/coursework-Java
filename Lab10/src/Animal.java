
public class Animal {
	protected String name;
	protected int gender;

	public Animal(String name, int gender) {
		this.name = name;
		this.gender = gender;
	}

	public void breathe() {
		System.out.println(name + " is breathing.");
	}
	public String getName() {
		return name;
	}
	public int getGender() {
		return gender;
	}
}