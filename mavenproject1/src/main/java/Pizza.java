
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pizza extends javax.swing.JFrame
{
JPanel sizePanel = new JPanel();
ButtonGroup sizeButtonGroup = new ButtonGroup();
JRadioButton smallRadioButton = new JRadioButton(); 
JRadioButton mediumRadioButton = new JRadioButton(); 
JRadioButton largeRadioButton = new JRadioButton(); 
JPanel crustPanel = new JPanel();
ButtonGroup crustButtonGroup = new ButtonGroup();
JRadioButton thinRadioButton = new JRadioButton(); 
JRadioButton thickRadioButton = new JRadioButton();
JPanel toppingsPanel = new JPanel();
JCheckBox cheeseCheckBox = new JCheckBox();
JCheckBox mushroomsCheckBox = new JCheckBox();
JCheckBox olivesCheckBox = new JCheckBox();
JCheckBox onionsCheckBox = new JCheckBox();
JCheckBox peppersCheckBox = new JCheckBox();
JCheckBox tomatoesCheckBox = new JCheckBox();
ButtonGroup whereButtonGroup = new ButtonGroup();
JRadioButton eatInRadioButton = new JRadioButton();
JRadioButton takeOutRadioButton = new JRadioButton(); JButton buildButton = new JButton();
JButton exitButton = new JButton();
String pizzaSize;
String pizzaCrust;
String pizzaWhere;
JCheckBox[] topping = new JCheckBox[6];
public static void main(String args[]){
// construct frame
new Pizza().show();
}
public Pizza()
{
setTitle("Pizza Order");
setResizable(false);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
exitForm(e);
}
});
getContentPane().setLayout(new GridBagLayout());
// position controls
GridBagConstraints gridConstraints;
sizePanel.setLayout(new GridBagLayout());
sizePanel.setBorder(BorderFactory.createTitledBorder("Size")) ;
smallRadioButton.setText("Small");
smallRadioButton.setSelected(true);
sizeButtonGroup.add(smallRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 0;
gridConstraints.anchor = GridBagConstraints.WEST;
sizePanel.add(smallRadioButton, gridConstraints);
smallRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
sizeRadioButtonActionPerformed(e);
}
});
mediumRadioButton.setText("Medium");
sizeButtonGroup.add(mediumRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
sizePanel.add(mediumRadioButton, gridConstraints);
mediumRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
sizeRadioButtonActionPerformed(e);
}
});
largeRadioButton.setText("Large");
largeRadioButton.setSelected(true);
sizeButtonGroup.add(largeRadioButton);
gridConstraints = new GridBagConstraints();
//=====================
gridConstraints.gridx = 0;
gridConstraints.gridy = 2;
gridConstraints.anchor = GridBagConstraints.WEST;
sizePanel.add(largeRadioButton, gridConstraints);
largeRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
sizeRadioButtonActionPerformed(e);
}
});
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 0;
getContentPane().add(sizePanel, gridConstraints);
crustPanel.setLayout(new GridBagLayout());
crustPanel.setBorder(BorderFactory.createTitledBorder("Crust"));
thinRadioButton.setText("Thin Crust");
thinRadioButton.setSelected(true);
crustButtonGroup.add(thinRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 0;
gridConstraints.anchor = GridBagConstraints.WEST;
crustPanel.add(thinRadioButton, gridConstraints);
thinRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
//====================
crustRadioButtonActionPerformed(e);
}
});
thickRadioButton.setText("Thick Crust");
crustButtonGroup.add(thickRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
crustPanel.add(thickRadioButton, gridConstraints);
thickRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
crustRadioButtonActionPerformed(e);
}
});
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 1;
getContentPane().add(crustPanel, gridConstraints);
toppingsPanel.setLayout(new GridBagLayout());
toppingsPanel.setBorder(BorderFactory.createTitledBorder("Top pings"));
cheeseCheckBox.setText("Extra Cheese");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 0;
gridConstraints.anchor = GridBagConstraints.WEST;
//========================-
toppingsPanel.add(cheeseCheckBox, gridConstraints);
mushroomsCheckBox.setText("Mushrooms");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
toppingsPanel.add(mushroomsCheckBox, gridConstraints);
olivesCheckBox.setText("Olives");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 0;
gridConstraints.gridy = 2;
gridConstraints.anchor = GridBagConstraints.WEST;
toppingsPanel.add(olivesCheckBox, gridConstraints);
onionsCheckBox.setText("Onions");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
gridConstraints.gridy = 0;
gridConstraints.anchor = GridBagConstraints.WEST;
toppingsPanel.add(onionsCheckBox, gridConstraints);
peppersCheckBox.setText("Green Peppers");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
toppingsPanel.add(peppersCheckBox, gridConstraints);
tomatoesCheckBox.setText("Tomatoes");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
gridConstraints.gridy = 2;
gridConstraints.anchor = GridBagConstraints.WEST;
toppingsPanel.add(tomatoesCheckBox, gridConstraints);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
//====================
gridConstraints.gridy = 0;
gridConstraints.gridwidth = 2;
getContentPane().add(toppingsPanel, gridConstraints);
eatInRadioButton.setText("Eat In");
eatInRadioButton.setSelected(true);
whereButtonGroup.add(eatInRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
getContentPane().add(eatInRadioButton, gridConstraints);
eatInRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
whereRadioButtonActionPerformed(e);
}
});
takeOutRadioButton.setText("Take Out");
whereButtonGroup.add(takeOutRadioButton);
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 2;
gridConstraints.gridy = 1;
gridConstraints.anchor = GridBagConstraints.WEST;
getContentPane().add(takeOutRadioButton, gridConstraints);
takeOutRadioButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
whereRadioButtonActionPerformed(e);
}
//====================
});
buildButton.setText("Build Pizza");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 1;
gridConstraints.gridy = 2;
getContentPane().add(buildButton, gridConstraints);
buildButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e)
{
buildButtonActionPerformed(e);
}
});
exitButton.setText("Exit");
gridConstraints = new GridBagConstraints();
gridConstraints.gridx = 2;
gridConstraints.gridy = 2;
getContentPane().add(exitButton, gridConstraints);
exitButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
exitButtonActionPerformed(e);
}
});
//================
pack();
//Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize(); setBounds((int) (0.5(screenSize.width - getWidth())), (int) (0.5 (screenSize.height - getHeight())),getWidth(), getHeight());
pizzaSize = smallRadioButton.getText();
pizzaCrust = thinRadioButton.getText();
pizzaWhere = eatInRadioButton.getText();
// Define an array of topping check boxes
topping[0] = cheeseCheckBox;
topping[1] = mushroomsCheckBox;
topping[2] = olivesCheckBox;
topping[3] = onionsCheckBox;
topping[4] = peppersCheckBox;
topping[5] = tomatoesCheckBox;
}
private void sizeRadioButtonActionPerformed(ActionEvent e) {
pizzaSize = e.getActionCommand();
}
private void crustRadioButtonActionPerformed(ActionEvent e) {
pizzaCrust = e.getActionCommand();
}
private void whereRadioButtonActionPerformed(ActionEvent e) {
pizzaWhere = e.getActionCommand();
}
private void buildButtonActionPerformed(ActionEvent e) {
//========================-
// This procedure builds a confirm dialog box that displays your pizza
 String message;
message = pizzaWhere + "\n";
message += pizzaSize + " Pizza" + "\n";
message += pizzaCrust + "\n";
// Check each topping using the array we set up
for (int i = 0; i < 6; i++)
{
if (topping[i].isSelected())
{
message += topping[i].getText() + "\n";
}
}
JOptionPane.showConfirmDialog(null, message, "Your Pizza",
JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE); }
private void exitButtonActionPerformed(ActionEvent e) {
System.exit(0);
}
private void exitForm(WindowEvent e)
{
System.exit(0);
}
}
//========



