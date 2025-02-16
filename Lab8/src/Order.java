
public class Order {
	private Fruit fruit;
	private int number;

	public Order(Fruit fruit, int number) {
		this.fruit = fruit;
		this.number = number;
	}
	public int getOrderCost() {
		int cost = 0;
		cost = fruit.getCost()*this.number;
		return cost;
	}
	public int getOrderRevenue () {
		int cost = 0;
		cost = fruit.getPrice()*this.number;
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
