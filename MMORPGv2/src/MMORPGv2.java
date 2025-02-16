import java.util.ArrayList;

public class MMORPGv2 {

	public static void main(String[] args) {
		// you cannot change the code in main method
		Adventurer a1 = new Adventurer("小呆1", 15);
		Adventurer a2 = new Adventurer("呆呆2", 10);
		Adventurer a3 = new Adventurer("呆呆3", 5);
		AdventureTeam team = new AdventureTeam();
		team.addAdventurer(a1);
		team.addAdventurer(a2);
		team.addAdventurer(a3);
		team.addAdventurer(a1);

		System.out.println("-".repeat(40));
		team = new AdventureTeam();
		team.addAdventurer(a1);
		team.addAdventurer(a2);

		MonsterGroup monsterGroup = new MonsterGroup();
		monsterGroup.addMonster(new Monster("史萊姆", 10));
		monsterGroup.addMonster(new Monster("岩盔丘丘王", 20));
		monsterGroup.addMonster(new Monster("無相之火", 30));
		monsterGroup.addMonster(new Monster("古岩龍蜥", 57));

		monsterGroup.battle(team);
	}
}

class Adventurer {
	private String name;
	private int atk; // 冒險家的基礎攻擊力

	public Adventurer(String name, int atk) {
		this.name = name;
		this.setAtk(atk);
	}

	public void attack(Monster m) {
		System.out.printf("%-5s進行攻擊：", this.name);
		m.beAttacked(getAtk());
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}

class Monster {
	private String name;
	private int hp; // 怪物的血量
	private boolean isAlive; // 怪物是否活著的狀態

	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void beAttacked(int damage) {
		if (hp > 0) {
			hp -= damage;
			System.out.printf("怪物 %s 受到 %d 點傷害\n", name, damage);
			if (hp <= 0) {
				System.out.printf("怪物 %s 死掉了\n", name);
				this.isAlive = false;
			}
		} else {
			System.out.printf("怪物 %s 已經死掉了，無法攻擊\n", name);
		}
	}

}

class AdventureTeam{
	private Adventurer[] adventurers; // 隊伍最多3位冒險家
	private int addIndex;
	
	public AdventureTeam() {
		// implement your code here
	}
	
	public void addAdventurer(Adventurer a) {
		// System.out.println(e); 將此行放在此 method中合適的位置
		// e 的type為 Exception 或 ArrayIndexOutOfBoundsException
		// implement your code here
		try {
			adventurers[adventurers.length] = a;
		}
		catch(Exception e) {
			System.out.println("隊伍人數已滿，無法加入新冒險家");
		}
	}
	
	public void teamAttack(Monster m) {
		
		for (Adventurer adventurer : adventurers) {
			if(adventurer != null) {
				adventurer.attack(m);
				if (!m.isAlive()) {
					break;
				}
			}
		}
		// 要注意 array 剛初始化時，內容物都是 null 的問題
		// implement your code here
	}
}

class MonsterGroup{
	// 怪物群沒有限制最多幾隻怪物
	private ArrayList<Monster> monsters = new ArrayList<>();
	
	public void addMonster(Monster m) {
		monsters.add(m);
		// implement your code here
	}
	
	public void battle(AdventureTeam aTeam) {
		// 以下三行 output，請放置於此 method中合適的位置
		
		
			
			for (Monster m : monsters) {
					System.out.printf("　　第 %s 回合開始，登場的是 \"%s\"\n", monsters.indexOf(m), m.getName());
					aTeam.teamAttack(m);
					System.out.printf("　　第 %s 回合結束\n", monsters.indexOf(m));
					System.out.println("-".repeat(40));
				}
				
			}

		// implement your code here
	}


