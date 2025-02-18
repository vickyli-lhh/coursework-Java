import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartFrame extends JFrame{
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	private static final int FIELD_WIDTH = 10;
	
	private ItemManager itemManager = new ItemManager();
	private Order order = new Order();
	
	private JPanel itemPanel, quantityPanel, operatePanel, overallPanel;
	private JLabel itemLabel, quantityLabel;
	private JComboBox itemCombo ;
	private JTextField quantityField;
	private JButton addButton, buyButton;
	private JTextArea infoArea;
	
	public CartFrame() {
		this.setTitle("Shopping cart");
		this.setSize(this.FRAME_WIDTH, this.FRAME_HEIGHT);
		
		createItemComp();
		createButton();
		createInfoArea();
		createPanel();
	}
	
	public void createItemComp() {
		
		itemLabel = new JLabel("Item");
		quantityLabel = new JLabel("Quantity");
		itemCombo = new JComboBox();
		quantityField = new JTextField("0", FIELD_WIDTH);
		for (Item item : itemManager.getItems()) {
		itemCombo.addItem(item.getName());
		}
	}
	
	public void createButton() {
		addButton = new JButton("Add to cart");
		addButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			String si = (String) itemCombo.getSelectedItem();
			int sq =Integer.parseInt(quantityField.getText());
			if (sq == 0) {
				JOptionPane.showMessageDialog(null, "The number must above than 0", "Error",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				for (Item item : itemManager.getItems()) {
					if (si.equals(item.getName())) {
						order.addToCart(item, sq);
						infoArea.setText("Action completed!");
					}
				}
				
			}
		}
		});

	buyButton=new JButton("Check out");
	
	buyButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			String si = (String) itemCombo.getSelectedItem();
			int sq =Integer.parseInt(quantityField.getText());
			if (sq == 0) {
				JOptionPane.showMessageDialog(null, "The number must above than 0", "Error",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				for (Item item : itemManager.getItems()) {
					if (si.equals(item.getName())) {
						order.addToCart(item, sq);
						infoArea.setText(order.printOrder());
					}
				}
				
			}
	
		}
	});

	}
	
	public void createInfoArea(){
		
		infoArea = new JTextArea(20,30);
	}

	public void createPanel() {
		
		itemPanel = new JPanel();
		itemPanel.add(itemLabel);
		itemPanel.add(itemCombo);
		
		quantityPanel = new JPanel();
		quantityPanel.add(quantityLabel);
		quantityPanel.add(quantityField);
		
		operatePanel = new JPanel(new GridLayout(2, 2));
		
		operatePanel.add(itemPanel);
		operatePanel.add(quantityPanel);

		operatePanel.add(addButton);
		operatePanel.add(buyButton);
		
		overallPanel = new JPanel(new BorderLayout());
		overallPanel.add(operatePanel, BorderLayout.NORTH);
		overallPanel.add(infoArea, BorderLayout.CENTER);
		
		this.add(overallPanel);
	}
}
