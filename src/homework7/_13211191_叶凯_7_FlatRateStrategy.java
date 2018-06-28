package homework7;

public class _13211191_Ò¶¿­_7_FlatRateStrategy implements _13211191_Ò¶¿­_7_IPricingStrategy
{
	private double discountPerBook;
	private String strategynum;
	private String strategyname;
	private int strategytype;
	private int booktype;
	public _13211191_Ò¶¿­_7_FlatRateStrategy()
	{
		
	}
	public double getSubTotal(_13211191_Ò¶¿­_7_SaleLineItem s)
	{
		return s.getprodSpec().getPrice()-discountPerBook;
	}
	public void setdiscount(double d)
	{
		discountPerBook=d;
	}
	public double getdiscount()
	{
		return discountPerBook;
	}
	public void setstrategynum(String s)
	{
		strategynum=s;
	}
	public String getstrategynum()
	{
		return strategynum;
	}
	public void setstrategyname(String s)
	{
		strategyname=s;
	}
	public String getstrategyname()
	{
		return strategyname;
	}
	public void setstrategytype(int s)
	{
		strategytype=s;
	}
	public int getstrategytype()
	{
		return strategytype;
	}
	public void setbooktype(int s)
	{
		booktype=s;
	}
	public int getbooktype()
	{
		return booktype;
	}
}