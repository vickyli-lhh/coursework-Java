public class AdventureTeam {
	private Adventurer a1, a2; // 隊伍一定要包含剛好兩位冒險家

	// implement one constructor and one method.
	public AdventureTeam(Adventurer a1, Adventurer a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	public void teamAttack(Monster m) {
		this.a1.attack(m);
		this.a2.attack(m);		
	}
}
