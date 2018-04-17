import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.net.*;

public class ipfind extends JFrame implements ActionListener{
JLabel label;
JTextField tf;
JButton b;
ipfind(){
super("ip finder tool...............");
label = new JLabel("ENTER URL");
tf=new JTextField();
b= new JButton("Find IP");
b.setBounds(50,150,80,30);
b.addActionListener(this);
label.setBounds(50,70,150,20);
tf.setBounds(50,100,200,20); 
add(label);
add(tf);
add(b);
setSize(500,500);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
String url = tf.getText();
try{
InetAddress ia= InetAddress.getByName(url);
String ip = ia.getHostAddress();
JOptionPane.showMessageDialog(this, ip);
}catch(Exception e1){
JOptionPane.showMessageDialog(this,e1.toString());}
   }
public static void main(String[] arg){
new ipfind();}

}