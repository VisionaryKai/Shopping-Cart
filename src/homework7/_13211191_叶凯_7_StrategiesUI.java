package homework7;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class _13211191_叶凯_7_StrategiesUI extends JFrame implements ActionListener{
private JLabel label1=new JLabel("策略编号");
private JLabel label2=new JLabel("策略名称");
private JLabel label3=new JLabel("策略类型");
private JLabel label4=new JLabel("适用类型");
private JLabel label5=new JLabel("折扣");
private JTextField text1=new JTextField(10);
private JTextField text2=new JTextField(10);
private JTextField text3=new JTextField(10);
private JTextField text4=new JTextField(10);
private JTextField text5=new JTextField(10);
private JButton button=new JButton("确定增加");
private	JPanel p1=new JPanel();
private JPanel p2=new JPanel();
private JLabel label6=new JLabel("书类型");
private JTextField text6=new JTextField(10);
private JButton button1=new JButton("确定删除");
private JPanel p3=new JPanel();
private JLabel label7=new JLabel("书类型");
private JTextField text7=new JTextField(10);
private JLabel label8=new JLabel("优惠额度");
private JTextField text8=new JTextField(10);
private JButton button2=new JButton("确定修改");
private JPanel p4=new JPanel();
private JLabel label9=new JLabel("书类型");
private JTextField text9=new JTextField(10);
private JButton button3=new JButton("确定查询");
private JButton button4=new JButton("返回");
private JLabel label10=new JLabel("策略类型");
private JLabel label11=new JLabel("策略编号");
private JLabel label12=new JLabel("策略名");
private JLabel label13=new JLabel("折扣");
private JPanel p5=new JPanel();
private _13211191_叶凯_7_controller sc;
public _13211191_叶凯_7_StrategiesUI()
{
	
}
public _13211191_叶凯_7_StrategiesUI(_13211191_叶凯_7_controller c)
{
	sc=c;
	setTitle("StrategiesUI");
	setLayout(new GridLayout(5,1));
	p1.setLayout(new FlowLayout());
	p1.add(label1);
	p1.add(text1);
	p1.add(label2);
	p1.add(text2);
	p1.add(label3);
	p1.add(text3);
	p2.setLayout(new FlowLayout());
	p2.add(label4);
	p2.add(text4);
	p2.add(label5);
	p2.add(text5);
	p2.add(button);
	p3.setLayout(new FlowLayout());
	p3.add(label6);
	p3.add(text6);
	p3.add(button1);
	p4.setLayout(new FlowLayout());
	p4.add(label7);
	p4.add(text7);
	p4.add(label8);
	p4.add(text8);
	p4.add(button2);
	p5.setLayout(new FlowLayout());
	p5.add(label9);
	p5.add(text9);
	p5.add(button3);
	p5.add(label10);
	p5.add(label11);
	p5.add(label12);
	p5.add(label13);
	p5.add(button4);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	add(p1);
	add(p2);
	add(p3);
	add(p4);
	add(p5);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,400);
    setVisible(true);
}


public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==button)
	{
		String s1,s2,s3,s4,s5;
		int stype,btype;
		double bdiscount;
		s1=text1.getText();
		s2=text2.getText();
		s3=text3.getText();
		s4=text4.getText();
		s5=text5.getText();
		stype=Integer.parseInt(s3);
		btype=Integer.parseInt(s4);
		if(stype==3)
		{
			sc.addCompositeStrategy(s1,s2,stype,btype,s5);
			_13211191_叶凯_7_MainUI m=new _13211191_叶凯_7_MainUI();
			m.setcontroller(sc);
			this.setVisible(false);
		}
		else 
		{
			bdiscount=Double.parseDouble(s5);
			sc.addSimpleStrategy(s1,s2,stype,btype,bdiscount);
			_13211191_叶凯_7_MainUI m=new _13211191_叶凯_7_MainUI();
			m.setcontroller(sc);
			this.setVisible(false);
		}
		
	}
	else if(e.getSource()==button1)
	{
		String s;
		s=text6.getText();
		sc.deleteStrategy(Integer.parseInt(s));
		_13211191_叶凯_7_MainUI m=new _13211191_叶凯_7_MainUI();
		m.setcontroller(sc);
		this.setVisible(false);
	}
	else if(e.getSource()==button2)
	{
		String s1,s2;
		int integer;
		double dd;
		s1=text7.getText();
		s2=text8.getText();
		integer=Integer.parseInt(s1);
		dd=Double.parseDouble(s2);
		sc.updateStrategy(integer,dd);
		_13211191_叶凯_7_MainUI m=new _13211191_叶凯_7_MainUI();
		m.setcontroller(sc);
		this.setVisible(false);
	}
	else if(e.getSource()==button3)
	{
		String s,s1,s2;
		int aa,bb;
		double bbb;
		s=text9.getText();
		aa=Integer.parseInt(s);
		if(sc.returntype(aa)!=null)
		{
			bb=sc.returntype(aa).getstrategytype();
			s1=sc.returntype(aa).getstrategyname();
			s2=sc.returntype(aa).getstrategynum();
			bbb=sc.returntype(aa).getdiscount();
			s=Integer.toString(bb);
			label10.setText(s);
			label11.setText(s2);
			label12.setText(s1);
			s=Double.toString(bbb);
			label13.setText(s);
		}
		else
		{
			label10.setText("无");
			label11.setText("无");
			label12.setText("无");
			label13.setText("无");
		}
		
	}	
	else 
	{
		_13211191_叶凯_7_MainUI m=new _13211191_叶凯_7_MainUI();
		m.setcontroller(sc);
		this.setVisible(false);
	}
}

}
