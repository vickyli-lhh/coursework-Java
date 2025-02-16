import javax.swing.JFrame;
import javax.swing.JLabel;
public class HomeFrame extends JFrame{
	private JFrame frame; 
	private JLabel userNameLabel;
	public HomeFrame() {
		frame = new JFrame("Home");
		frame.setSize(400, 300);
		userNameLabel = new JLabel("Hello" + getName());
		frame.add(userNameLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
