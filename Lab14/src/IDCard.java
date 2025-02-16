
public class IDCard extends Card{
	private int version = 1;
	public IDCard(String name, int ID) {
		super(name, ID);
	}
	public void replace() {
		
		this.version++;
	}
	public int getID(){
		return super.getID();
	}
	public void getInfo() {
		System.out.println("<ID CARD INFO>");
		System.out.println("Name: " + super.getName());
		System.out.println("ID: " + getID());
		System.out.println("Card version: " + this.version);
		System.out.println();
	}

}
