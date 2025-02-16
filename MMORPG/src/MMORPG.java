public class MMORPG {

	public static void main(String[] args) {
		// you cannot change the code in main method
		Adventurer a1 = new Adventurer("小呆", 10);
		Adventurer a2 = new Adventurer("Jack", 15);

		Weapon w1 = new Weapon("雷神之錘", 10);
		a1.setWeapon(w1);
		
		Monster m1 = new Monster("史萊姆", 30);
		Monster m2 = new Monster("岩盔丘丘王", 35);
		
		a1.attack(m1);
		a2.attack(m1);
		a1.attack(m1);
		System.out.println("-".repeat(40));
		
		AdventureTeam team = new AdventureTeam(a1, a2);
		team.teamAttack(m2);
		team.teamAttack(m2);		
	}
}
