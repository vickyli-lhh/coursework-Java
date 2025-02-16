import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalcFrame extends JFrame{
	private JTextField textFieldA, textFieldB;
	private JRadioButton rbtnAdd, rbtnSub, rbtnMul, rbtnDiv; 
	private JButton btnEqual;
	private JTextArea outputArea;

	//constructor
	public CalcFrame(JTextField textFieldA, JTextField textFieldB, JRadioButton rbtnAdd, JRadioButton rbtnSub, JRadioButton rbtnMul, JRadioButton rbtnDiv, JButton btnEqual, JTextArea outputArea) {
		this.textFieldA = textFieldA;
		this.textFieldB = textFieldB;
		this.rbtnAdd = rbtnAdd;
		this.rbtnSub = rbtnSub;
		this.rbtnMul = rbtnMul;
		this.rbtnDiv = rbtnDiv;
		this.btnEqual = btnEqual;
		this.outputArea = outputArea;
	}
	
	public CalcFrame() {		
		outputArea = new JTextArea(8, 12);
		outputArea.setEditable(false);
		
		createTextField();
		createButton();
		createRbtn();
		createLayout();
		setSize(600, 200);
	}
	
	private void createTextField() {
		// Here is your code //
		textFieldA = new JTextField(10);
		textFieldB = new JTextField(10);
	}
	
	private void createRbtn() {
		// Here is your code //
		rbtnAdd = new JRadioButton("+");
		rbtnSub = new JRadioButton("-");
		rbtnMul = new JRadioButton("*");
		rbtnDiv = new JRadioButton("/");
		ButtonGroup group = new ButtonGroup(); 
		group.add(rbtnAdd);
		group.add(rbtnSub);
		group.add(rbtnMul);
		group.add(rbtnDiv);
		
	}

	private void createButton(){
		// Here is your code //
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				// use parseInt to change String to Int, so that we can use deposit()
				double a = Double.parseDouble(textFieldA.getText());
				double b = Double.parseDouble(textFieldB.getText());
				String op = "+";
				if(rbtnAdd.isSelected()) {
					op = "+";
				}else if(rbtnSub.isSelected()) {
					op = "-";
				}else if(rbtnMul.isSelected()) {
					op = "*";
				}else if(rbtnDiv.isSelected()) {
					op = "/";
				}
				String outstr = getResult(a,op,b);
				outputArea.append(outstr);
			}
		});
	}
	
	private String getResult(double a, String op, double b) {
		// Here is your code //
		String result = "";
		if(op.equals("+")) {
			result = String.format("%.2f%s%.2f%s%.2f\n",a,op,b,"=",a + b);
		}else if(op.equals("-")) {
			result = String.format("%.2f%s%.2f%s%.2f\n",a,op,b,"=",a - b);
		}else if(op.equals("*")) {
			result = String.format("%.2f%s%.2f%s%.2f\n",a,op,b,"=",a * b);
		}else if(op.equals("/")) {
			result = String.format("%.2f%s%.2f%s%.2f\n",a,op,b,"=",a / b);
		}
		return result;
	}
	
	private void createLayout(){
		JPanel flow_panel = new JPanel();
		JPanel rbtn_panel = new JPanel(new GridLayout(4,1));
		
		rbtn_panel.add(this.rbtnAdd);
		rbtn_panel.add(this.rbtnSub);
		rbtn_panel.add(this.rbtnMul);
		rbtn_panel.add(this.rbtnDiv);
		
		flow_panel.add(this.textFieldA);
		flow_panel.add(rbtn_panel);
		flow_panel.add(this.textFieldB);
		flow_panel.add(this.btnEqual);
		
		flow_panel.add(new JScrollPane(outputArea));
		
		add(flow_panel);
	}

}
