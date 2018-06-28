package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _13211191_Ò¶¿­_7_MainUI extends JFrame implements ActionListener{
	private JButton button1=new JButton("Buy UI");
	private JButton button2=new JButton("AddBook UI");
	private JButton button3=new JButton("Strategies UI");
	private JPanel toppanel=new JPanel();
	private JPanel middlepanel=new JPanel();
	private JPanel bottompanel=new JPanel();
	_13211191_Ò¶¿­_7_controller c;
	public _13211191_Ò¶¿­_7_MainUI(){
	setTitle("Main UI");
	toppanel.add(button1);
	middlepanel.add(button2);
	bottompanel.add(button3);
	setLayout(new GridLayout(3,1));
	add(toppanel);
    add(middlepanel);
    add(bottompanel);  
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
    setVisible(true);	
    c=new _13211191_Ò¶¿­_7_controller();
	}
	public void actionPerformed(ActionEvent e)
	{
		 if (e.getSource()==button1)
		 {
			 _13211191_Ò¶¿­_7_BuyUI b=new _13211191_Ò¶¿­_7_BuyUI(c);
			 this.setVisible(false);
		 }
		 else if(e.getSource()==button2)
		 {
			 _13211191_Ò¶¿­_7_AddBookUI a=new _13211191_Ò¶¿­_7_AddBookUI(c);
			 this.setVisible(false);
		 }
		 else 
		 {
			 _13211191_Ò¶¿­_7_StrategiesUI s=new _13211191_Ò¶¿­_7_StrategiesUI(c);
			 this.setVisible(false);
		 }
	}
	public void setcontroller(_13211191_Ò¶¿­_7_controller con)
	{
		c=con;
	}
}
