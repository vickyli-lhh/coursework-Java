import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.lang.NullPointerException;
import javax.swing.JOptionPane;

public class LoginFrame extends JFrame {
	private User user = new User();
	private HomeFrame frame = new HomeFrame();
	private JLabel userNameLabel, PassWordLabel;
	private JTextField userNameField, PassWordField;
	private JButton enrollButton, loginButton;
	private JOptionPane error;

	public LoginFrame() {
		setName("Login");
		createpwfield();
		createunfield();
		createenrollbutton();
		createloginbutton();
		//error = new JOptionPane("error");
		
		add(userNameLabel);
		add(PassWordLabel);
		
		add(userNameField);
		add(PassWordField);
		
		add(enrollButton);
		add(loginButton);

	}

	private void createunfield() {
		userNameLabel = new JLabel("Username:");
		userNameLabel.setBounds(50, 10, 100, 20);
		final int FIELD_WIDTH = 8;
		userNameField = new JTextField(FIELD_WIDTH);
		userNameField.setText("");
		userNameField.setBounds(150, 10, 150, 20);
	}

	private void createpwfield() {
		PassWordLabel = new JLabel("Password:");
		PassWordLabel.setBounds(50, 50, 100, 20);
		final int FIELD_WIDTH = 8;
		PassWordField = new JTextField(FIELD_WIDTH);
		PassWordField.setText("");
		PassWordField.setBounds(150, 50, 150, 20);
	}

	private void createenrollbutton() {
		enrollButton = new JButton("Enroll");
		enrollButton.setBounds(75, 100, 100, 40);
		enrollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					userNameField.getText();
					user.add(userNameField.getText(), PassWordField.getText());
				} catch (UserError e) {
					JOptionPane.showMessageDialog(null, "User name can’t be empty.", "Info",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (PasswordError e1) {

					JOptionPane.showMessageDialog(null, "The length of the password should be 8", "Info",
							JOptionPane.INFORMATION_MESSAGE);

				}

			}
		});
	}

	private void createloginbutton() {
		loginButton = new JButton("Login");
		loginButton.setBounds(200, 100, 100, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					String name = userNameField.getText();
					user.checkUserExist(userNameField.getText());
					user.add(userNameField.getText(), PassWordField.getText());
				} catch (UserError e) {
					System.out.println("User name can’t be empty.");
				} catch (PasswordError e) {
					System.out.println("The length of the password should be 8");
				}

			}
		});
	}
}
