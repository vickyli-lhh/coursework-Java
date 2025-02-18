
public class IMStudent extends MISStudent{
	private int accounting;
	private int economics;
	public IMStudent(String name, int mis, int oop, int accounting, int economics) {
		super(name, mis,oop);
		this.accounting = accounting;
		this.economics = economics;
	}
	public double getGrade(){
		return super.getGrade() + accounting*0.35 + economics*0.35;
	}
}
