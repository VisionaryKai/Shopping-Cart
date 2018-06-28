package homework7;
import java.util.ArrayList;
public abstract class _13211191_Ò¶¿­_7_CompositeStrategy implements _13211191_Ò¶¿­_7_IPricingStrategy{
	ArrayList <_13211191_Ò¶¿­_7_IPricingStrategy>strategies=new ArrayList<_13211191_Ò¶¿­_7_IPricingStrategy>();
	private String strategynum;
	private String strategyname;
	private int strategytype;
	private int booktype;
	private String combinenum;
	public void add(_13211191_Ò¶¿­_7_IPricingStrategy s)
	{
		strategies.add(s);
	}
	public abstract double getSubTotal(_13211191_Ò¶¿­_7_SaleLineItem s);
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
	public void setstrategytype(int  s)
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
	public void setcombinenum(String s)
	{
		combinenum=s;
	}
	public String getcombinenum()
	{
		return combinenum;
	}
}
