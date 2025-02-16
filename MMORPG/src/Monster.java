public class Monster {
	private String name;
	private int hp; // 怪物的血量

	// implement one constructor
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// implement beAttacked method
	public void beAttacked(int damage) {
		if (hp > 0) {
			System.out.println("怪獸 " + this.name + " 受到 " + damage + " 點傷害");
			hp -= damage;
			if (hp <= 0) {
				System.out.println("怪獸 " + this.name + " 死掉了");
		} else {

				System.out.println("怪獸 " + this.name + " 已經死掉了，無法攻擊");
				
			}
		}
	}
}
