import java.util.ArrayList;

public class ItemManager {
	private ArrayList<Item> items;

	public ItemManager() {
		items = new ArrayList<Item>();
		this.addItem(new Item(1, "Shirt", 499));
		this.addItem(new Item(2, "Coat", 1320));
		this.addItem(new Item(3, "Pants", 799));
		this.addItem(new Item(4, "Shoes", 2180));
	}

	public ArrayList<Item> getItems() {
		return this.items;
	}
	public void addItem(Item item) {
		items.add(item);
	}
	
}