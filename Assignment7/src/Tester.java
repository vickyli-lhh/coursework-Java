import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Tester {
static OXGameManager manager = new OXGameManager();
static JButton[] btns = new JButton[9];
static JLabel score = new JLabel(String.format("O: %d ; X: %d", 0, 0));
static JButton reStart = new JButton("ReStart");
static JButton finish = new JButton("Finish");
public static void main(String[] args) {
// Implement GUI
JFrame f = new JFrame("Frame");
f.setLayout(new GridLayout(4,3));
f.setSize(600, 600);
score.setFont(new Font("Arial", Font.PLAIN, 40));
reStart.setFont(new Font("Arial", Font.PLAIN, 40));
finish.setFont(new Font("Arial", Font.PLAIN, 40));
// Implement reStart button
reStart.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
manager.initialize();
for (int i=0; i<9; i++) {
btns[i].setText(Integer.toString(i));
btns[i].setEnabled(true);
}
}
});
// Implement finish button
finish.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
f.dispose();
// or use System.exit(0);
}
});
for (int i=0; i<9; i++) {
JButton btn = new JButton();
int index = i;


btn.setText(Integer.toString(i));
btn.setFont(new Font("Arial", Font.PLAIN, 50));
// Implement the checkerboard button
btn.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
btn.setText(manager.play(index));
btn.setEnabled(false);
String result = manager.checkWin();
if(manager.finish()) {
for (JButton btn:btns) {
btn.setEnabled(false);
}
score.setText(String.format("O: %d ; X: %d",

manager.getScoreO(), manager.getScoreX()));

}
}
});
btns[i] = btn;
}
f.add(score);
f.add(reStart);
f.add(finish);
for (int i=0; i<9; i++) {
f.add(btns[i]);
}
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}