import java.util.ArrayList;
public class Shop {
	private OrderList orderList = new OrderList();
	
	public void addOrder(Fruit fruit, int number) {
		Order order = new Order(fruit, number);
		orderList.addOrder(order);
		return;
	}
	public String getReport () {
		String report = "";
		report = ("Total Revevue: ") + String.valueOf(orderList.getTotalRevenue()) + 
		("\nTotal Cost: ") + String.valueOf(orderList.getTotalCost()) + 
		("\nTotal Profit: ")+ String.valueOf(orderList.getTotalRevenue() - orderList.getTotalCost());
		return report; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
