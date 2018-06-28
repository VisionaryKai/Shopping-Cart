package homework7;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class _13211191_Ò¶¿­_7_BuyUI extends JFrame implements ActionListener{
private JLabel label1=new JLabel("");
private JLabel label2=new JLabel("");
private JLabel label3=new JLabel("");
private JLabel label4=new JLabel("");
private JLabel label5=new JLabel("");
private JLabel label6=new JLabel("");
private JLabel label7=new JLabel("");
private JLabel label8=new JLabel("");
private JLabel label9=new JLabel("");
private JLabel label10=new JLabel("");
private JLabel label11=new JLabel("");
private JLabel label12=new JLabel("");
private JLabel label13=new JLabel("");
private JLabel label14=new JLabel("");
private JLabel label15=new JLabel("");
private JPanel panel1=new JPanel();
private JPanel panel2=new JPanel();
private JPanel panel3=new JPanel();
private JPanel panel4=new JPanel(); 
private JPanel panel5=new JPanel();
private JLabel label16=new JLabel("isbnºÅ");
private JLabel label17=new JLabel("ÊýÁ¿");
private JTextField text1=new JTextField(10);
private JTextField text2=new JTextField(10);
private JButton button=new JButton("È·¶¨Âò");
private JButton button1=new JButton("·µ»Ø");
private JPanel panel6=new JPanel();
private JPanel panel7=new JPanel();
private JPanel panel8=new JPanel();
private _13211191_Ò¶¿­_7_controller bc;
private _13211191_Ò¶¿­_7_Sale sale;
_13211191_Ò¶¿­_7_ShoppingCarUI scui;
public _13211191_Ò¶¿­_7_BuyUI()
{
	
}
public _13211191_Ò¶¿­_7_BuyUI(_13211191_Ò¶¿­_7_controller c)
{
	bc=c;
	sale=new _13211191_Ò¶¿­_7_Sale();
	
	setTitle("BuyUI");
	panel1.setLayout(new FlowLayout());
	panel1.add(label1);
	panel1.add(label2);
	panel1.add(label3);
	panel2.setLayout(new FlowLayout());
	panel2.add(label4);
	panel2.add(label5);
	panel2.add(label6);
	panel3.setLayout(new FlowLayout());
	panel3.add(label7);
	panel3.add(label8);
	panel3.add(label9);
	panel4.setLayout(new FlowLayout());
	panel4.add(label10);
	panel4.add(label11);
	panel4.add(label12);
	panel5.setLayout(new FlowLayout());
	panel5.add(label13);
	panel5.add(label14);
	panel5.add(label15);
	panel6.setLayout(new FlowLayout());
	panel6.add(label16);
	panel6.add(text1);
	panel7.setLayout(new FlowLayout());
	panel7.add(label17);
	panel7.add(text2);
	panel8.setLayout(new FlowLayout());
	panel8.add(button);
	panel8.add(button1);
	button.addActionListener(this);
	button1.addActionListener(this);
	setLayout(new GridLayout(8,1));
	add(panel1);
	add(panel2);
	add(panel3);
	add(panel4);
	add(panel5);
	add(panel6);
	add(panel7);
	add(panel8);
	for(int i=0;i<bc.getbc().getbooks().size();i++)
	{
		if(i==0)
		{
			label1.setText(bc.getbc().getbooks().get(i).getisbn());
			label2.setText(bc.getbc().getbooks().get(i).gettitle());
			label3.setText(Double.toString(bc.getbc().getbooks().get(i).getPrice()));
		}
		else if(i==1)
		{
			label4.setText(bc.getbc().getbooks().get(i).getisbn());
			label5.setText(bc.getbc().getbooks().get(i).gettitle());
			label6.setText(Double.toString(bc.getbc().getbooks().get(i).getPrice()));
		}
		else if(i==2)
		{
			label7.setText(bc.getbc().getbooks().get(i).getisbn());
			label8.setText(bc.getbc().getbooks().get(i).gettitle());
			label9.setText(Double.toString(bc.getbc().getbooks().get(i).getPrice()));
		}
		else if(i==3)
		{
			label10.setText(bc.getbc().getbooks().get(i).getisbn());
			label11.setText(bc.getbc().getbooks().get(i).gettitle());
			label12.setText(Double.toString(bc.getbc().getbooks().get(i).getPrice()));
		}
		else if(i==4)
		{
			label13.setText(bc.getbc().getbooks().get(i).getisbn());
			label14.setText(bc.getbc().getbooks().get(i).gettitle());
			label15.setText(Double.toString(bc.getbc().getbooks().get(i).getPrice()));
		}
	}
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,400);
    setVisible(true);
    scui=new _13211191_Ò¶¿­_7_ShoppingCarUI(sale);
    scui.setVisible(false);

}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==button)
	{
		String s;
		int i;	
		s=text1.getText();
		i=Integer.parseInt(text2.getText());
		bc.buyBook(s,i);
		sale=bc.getSale();
		scui.setVisible(true);
	    scui.update(sale);
	}
	else
	{
		_13211191_Ò¶¿­_7_MainUI m=new _13211191_Ò¶¿­_7_MainUI();
		m.setcontroller(bc);
		this.setVisible(false);
	}
	
    
}
}



