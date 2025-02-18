import java.util.ArrayList;

public class Order {
	int totalAmount;
	ArrayList<Item> items;
	ArrayList<Integer> quantities;

	public Order() {
		items = new ArrayList<Item>();
		quantities = new ArrayList<Integer>();
	}
	public void addToCart(Item itm, Integer q) {
		items.add(itm);
		quantities.add(q);
	}
	public int getQ(String itemName) {
		int n = 0;
		for(int i = 0 ; i < items.size() ; i++) {
			if (itemName.equals(items.get(i).getName())) {
				n = quantities.get(i);
			}
		}
		return n;
		}
		
	public String printOrder() {
		String s = "";
		s += String.format("%-10s%-10s%-10s%n", "Item", "Price", "Quantity");
		for(Item item: items ) {
			s += String.format("%-10s%-10d%-10d%n", item.getName(), item.getPrice(), getQ(item.getName()));
		}
		s += String.format("-------------------------------------------------------------------------------%n");
		int amount = 0;
		for(Item item: items ) {
			amount += item.getPrice()*getQ(item.getName());
		}
		s += String.format("The total amount:" + amount);
		return s;
	}
}