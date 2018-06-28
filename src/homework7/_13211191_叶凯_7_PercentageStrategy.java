package homework7;

public class _13211191_Ò¶¿­_7_PercentageStrategy implements _13211191_Ò¶¿­_7_IPricingStrategy{
	private int discountPercentage;
	private String strategynum;
	private String strategyname;
	private int strategytype;
	private int booktype;
	public double getSubTotal(_13211191_Ò¶¿­_7_SaleLineItem s)
	{
		return s.getprodSpec().getPrice()*(1-discountPercentage/100.0);
	}
	public void setdiscount(double d)
	{
		discountPercentage=(int)d;
	}
	public double getdiscount()
	{
		return (double)discountPercentage;
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