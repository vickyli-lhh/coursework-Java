public class Adventurer {
	private String name;
	private int atk; // 冒險家的基礎攻擊力
	private Weapon weapon = null;

	// implement one constructor and two methods.
	public Adventurer(String name, int atk) {
		this.name = name;
		this.atk = atk;
	}	
	public void attack(Monster m) {
		if (this.weapon != null) {
			m.beAttacked(this.atk + this.weapon.getAddAtk());
		} else {
			m.beAttacked(this.atk);
		}
	}
	public void setWeapon(Weapon w) {
		this.weapon = w;
	}
}

