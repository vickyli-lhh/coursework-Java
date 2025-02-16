import java.util.ArrayList;
public class OrderList {	
	private ArrayList<Order> orders = new ArrayList(); 
	public void addOrder(Order order) {
		orders.add(order);
	}
	public int getTotalCost() {
		int sum = 0;
		for (Order order: orders) { 
			sum += order.getOrderCost(); 
			}
		return sum;	
	}
	public int getTotalRevenue() {
		int sum = 0;
		for (Order order: orders) { 
			sum += order.getOrderRevenue(); 
			}	
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
