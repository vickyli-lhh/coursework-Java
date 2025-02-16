public class Weapon {
	private String name;
	private int addAtk; // 武器可以提升多少傷害

	// implement one constructor and one method.
	public Weapon(String name, int addAtk) {
		this.name = name;
		this.addAtk = addAtk;
	}
	public int getAddAtk() {
		return this.addAtk;
	}
}