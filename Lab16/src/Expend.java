import java.util.ArrayList;
import java.util.Collections;
public class Expend {
	private int expenditure;
	private Analyzer a;
	private ArrayList<String> nameList = new ArrayList<String>();
	private ArrayList<Integer> expendList = new  ArrayList<Integer>();
	public Expend(Analyzer analyzer) {
		this.a = analyzer;
		this.expenditure = 0;
	}

	public void add(Object object) {
		int expend = this.a.measureExpand(object);
		int idx;
		for (idx = 0; idx < nameList.size(); idx++) {
			if (this.expendList.get(idx) < expend) {
				break;
			}
		}
		nameList.add(idx, this.a.getName(object));
		expendList.add(idx, expend);
		this.expenditure += expend;
	}
	public void getInfo() {
		if (a instanceof WageAnalyzer) {
			System.out.println("<Wage expenditure>");
		} else {
			System.out.println("<Stock expenditure>");
		}
		System.out.printf("Total = %d\n", this.expenditure);
		for (int i = 0 ; i < expendList.size() ; i++ ) {
			System.out.printf("%-10s... %d\n", this.nameList.get(i), this.expendList.get(i));
		}
	}
}

