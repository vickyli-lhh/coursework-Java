
public class Bird extends Animal {
	private boolean flyable;

	public Bird(String name, int gender, Boolean flyable) {
//		this.name = name;
//		this.gender = gender;
		super(name, gender);
		this.flyable = flyable;
	}

	public void fly() {
//		System.out.println(this.name + " is flying~");
//		System.out.println(this.name + " can’t fly QQ");
		if (flyable) {
			System.out.println(super.getName() + " is flying~");
		} else {
			System.out.println(super.getName() + " can’t fly QQ");
		}
	}

	public void breathe() {
		System.out.println("Birdie " + super.getName() + " is breathing.");
	}

	public boolean getFlyable() {
		return flyable;
	}
}
