package homework7;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class _13211191_叶凯_7_ShoppingCarUI extends JFrame implements _13211191_叶凯_7_Observer {
private _13211191_叶凯_7_Sale asale;
private JLabel label1=new JLabel("书名                 ");
private JLabel label2=new JLabel("      数量");
private JLabel label3=new JLabel("价格");
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
private JLabel label14=new JLabel("总价 :  ");
private JLabel label15=new JLabel("");
private JPanel p1=new JPanel();
private JPanel p2=new JPanel();
private JPanel p3=new JPanel();
private JPanel p4=new JPanel();
private JPanel p5=new JPanel();
private JPanel p6=new JPanel();
private JPanel p7=new JPanel();
public _13211191_叶凯_7_ShoppingCarUI(_13211191_叶凯_7_Sale s)
{
	asale=s;
	s.registerObserver(this);
	setTitle("ShoppingCarUI");
	p1.setLayout(new FlowLayout());
	p2.setLayout(new FlowLayout());
	p3.setLayout(new FlowLayout());
	p4.setLayout(new FlowLayout());
	p5.setLayout(new FlowLayout());
	p6.setLayout(new FlowLayout());
	p7.setLayout(new FlowLayout());
	p1.add(label1);
	p1.add(label2);
	p2.add(label4);
	p2.add(label5);
	p3.add(label6);
	p3.add(label7);
	p4.add(label8);
	p4.add(label9);
	p5.add(label10);
	p5.add(label11);
	p6.add(label12);
	p6.add(label13);
	p7.add(label14);
	p7.add(label15);
	setLayout(new GridLayout(7,1));
	add(p1);
	add(p2);
	add(p3);
	add(p4);
	add(p5);
	add(p6);
	add(p7);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,400);
    setVisible(true);

}
public void update(_13211191_叶凯_7_Sale s)
{
	this.asale=s;
	for(int i=0;i<asale.getitems().size();i++)
	{
		if(i==0)
		{
			label4.setText(asale.getitems().get(0).getprodSpec().gettitle());
			label5.setText(Integer.toString(asale.getitems().get(0).getcopies()));
		}
		else if(i==1)
		{
			label6.setText(asale.getitems().get(1).getprodSpec().gettitle());
			label7.setText(Integer.toString(asale.getitems().get(1).getcopies()));
		}
		else if(i==2)
		{
			label8.setText(asale.getitems().get(2).getprodSpec().gettitle());
			label9.setText(Integer.toString(asale.getitems().get(2).getcopies()));
		}
		else if(i==3)
		{
			label10.setText(asale.getitems().get(3).getprodSpec().gettitle());
			label11.setText(Integer.toString(asale.getitems().get(3).getcopies()));
		}
		else if(i==4)
		{
			label12.setText(asale.getitems().get(4).getprodSpec().gettitle());
			label13.setText(Integer.toString(asale.getitems().get(4).getcopies()));
		}
	}
	label15.setText(Double.toString(asale.getTotal()));
}
	
}
