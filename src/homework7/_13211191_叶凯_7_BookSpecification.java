package homework7;

public class _13211191_Ò¶¿­_7_BookSpecification {
	private String isbn;
	private double price;
	private String title;
	private int type;
	public _13211191_Ò¶¿­_7_BookSpecification(double p,int t)
	{
		price=p;
		type=t;
	}
	public _13211191_Ò¶¿­_7_BookSpecification()
	{
		
	}
	public String getisbn()
	{
		return isbn;
	}
	public void setisbn(String s)
	{
		isbn=s;
	}
	public String gettitle()
	{
		return title;
	}
	public void settitle(String s)
	{
		title=s;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double d)
	{
		price=d;
	}
	public int gettype()
	{
		return type;
	}
	public void settype(int t)
	{
		type=t;
	}
}
