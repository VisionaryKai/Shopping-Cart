package homework7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _13211191_Ò¶¿­_7_AddBookUI extends JFrame implements ActionListener{
	private JTextField text1=new JTextField(10);
	private JTextField text2=new JTextField(10);
	private JTextField text3=new JTextField(10);
	private JTextField text4=new JTextField(10);
	private JLabel label1=new JLabel("isbn");
	private JLabel label2=new JLabel("title");
	private JLabel label3=new JLabel("price");
	private JLabel label4=new JLabel("type");
	private JPanel panel1=new JPanel();
	private JPanel panel2=new JPanel();
	private JPanel panel3=new JPanel();
	private JPanel panel4=new JPanel(); 
	private JPanel panel5=new JPanel();
	private JButton button1=new JButton("È·¶¨");
	private _13211191_Ò¶¿­_7_controller abc;
public	_13211191_Ò¶¿­_7_AddBookUI(_13211191_Ò¶¿­_7_controller c) 
{
	abc=c;
	setTitle("AddBook UI");
	panel1.setLayout(new FlowLayout());
	panel1.add(label1);
	panel1.add(text1);
	panel2.setLayout(new FlowLayout());
	panel2.add(label2);
	panel2.add(text2);
	panel3.setLayout(new FlowLayout());
	panel3.add(label3);
	panel3.add(text3);
	panel4.setLayout(new FlowLayout());
	panel4.add(label4);
	panel4.add(text4);
	panel5.add(button1);
	button1.addActionListener(this);
	setLayout(new GridLayout(5,1));
	add(panel1);
	add(panel2);
	add(panel3);
	add(panel4);
	add(panel5);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
    setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==button1)
	{
		String s1,s2,s3,s4;
		double d;
		int i;
		s3=text3.getText();
		d=Double.parseDouble(s3);
		s4=text4.getText();
		i=Integer.parseInt(s4);
		s1=text1.getText();
		s2=text2.getText();
		abc.addBook(abc.createbook(s1, s2, d, i));	
		_13211191_Ò¶¿­_7_MainUI m=new _13211191_Ò¶¿­_7_MainUI();
		m.setcontroller(abc);
		this.setVisible(false);
	}
}
}
