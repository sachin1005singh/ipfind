
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LabelExample extends Frame implements ActionListener {
JTextField tf; 
JLabel l;
JButton b;
LabelExample(){
	tf = new JTextField();
	tf.setBounds(50,50,150,20);
	l = new JLabel();
	l.setBounds(50,100,250,20);
	b = new JButton("find ip");
	b.setBounds(50,150,90,30);
	b.addActionListener(this);
	add(b);
	add(l);
	add(tf);
	setSize(600,700);
	setLayout(null);
	setVisible(true);
	}
   public void actionPerformed(ActionEvent e) {
	   try {
		   String host  = tf.getText();
		   String ip = java.net.InetAddress.getByName(host).getHostAddress();
		   l.setText("ip of " +host +"is ." +ip);
	   }catch(Exception ex) {
		   System.out.println(ex);}
	   }
	   public static void main(String ss[]) {
new LabelExample();		   
	   }
   }


