
public class Passport extends IDCard{
	private String country;
	public Passport(String name, int ID, String country) {
		super(name, ID);
		this.country = country;
	}
	public void replace(String country) {
		this.country = country;
	}
	public void getInfo() {
		System.out.println("<PASSPORT INFO>");
		System.out.println("Name: " + super.getName());
		System.out.println("ID: " + super.getID());		
		System.out.println("Country: " + this.country);
		System.out.println();
	}
	

}
