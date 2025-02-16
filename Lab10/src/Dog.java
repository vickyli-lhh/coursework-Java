
public class Dog extends Animal{
	private String breed;
	public Dog(String name, int gender, String breed) {
//		this.name = name;
//		this.gender = gender;
		super (name, gender);
		this.breed = breed;
	}

	public void bark() {
		System.out.println(super.getName() + " barks!");
//		System.out.println(this.name() + "barks!");
	}
	public void run() {
		System.out.println(super.getName() + " is running!");
//		System.out.println(this.name() + "is running!");
	}
	public String getBreed() {
		return breed;
	}
}
