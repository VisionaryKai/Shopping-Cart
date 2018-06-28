package homework7;
import java.util.*;
public class _13211191_Ò¶¿­_7_StrategyCatalog {
public HashMap<String,_13211191_Ò¶¿­_7_IPricingStrategy> strategies=new HashMap<String,_13211191_Ò¶¿­_7_IPricingStrategy>();
public _13211191_Ò¶¿­_7_IPricingStrategy find(String i)
{
	if(strategies.get(i)!=null)
	return strategies.get(i);
	else return null;
}
public void addsimplestrategy(String s1,String s2,int i,int j,double dd)
{
	if(i==1)
	{
		_13211191_Ò¶¿­_7_PercentageStrategy p=new _13211191_Ò¶¿­_7_PercentageStrategy();
		p.setstrategynum(s1);
		p.setstrategyname(s2);
		p.setstrategytype(i);
		p.setbooktype(j);
		p.setdiscount((int)dd);
		strategies.put(Integer.toString(j), p);
	}
	else if(i==2)
	{
		_13211191_Ò¶¿­_7_FlatRateStrategy f=new _13211191_Ò¶¿­_7_FlatRateStrategy();
		f.setstrategynum(s1);
		f.setstrategyname(s2);
		f.setstrategytype(i);
		f.setbooktype(j);
		f.setdiscount(dd);
		strategies.put(Integer.toString(j), f);
	}
	
}
public void addcompositestrategy(String s1,String s2,int i,int j,String ss)
{
	String s,l1,l2;
	_13211191_Ò¶¿­_7_CompositeBestForCustomer c=new _13211191_Ò¶¿­_7_CompositeBestForCustomer ();
	c.setstrategynum(s1);
	c.setstrategyname(s2);
	c.setstrategytype(i);
	c.setbooktype(j);
	c.setcombinenum(ss);	
	l1=ss.substring(0, 11);
	l2=ss.substring(12, 23);
	Iterator<String> iter = strategies.keySet().iterator();
	while (iter.hasNext()) 
	{
		s = iter.next();
		if(strategies.get(s).getstrategynum().equals(l1)||strategies.get(s).getstrategynum().equals(l2))
		c.add(strategies.get(s));		
	}
	strategies.put(Integer.toString(j), c);
}
public void deletestrategy(String t)
{
	strategies.remove(t);
}
public void updatestrategy(int i,double d)
{
	String a1,a2;
	int k1,k2;
	double dd=d;
	a1=strategies.get(Integer.toString(i)).getstrategynum();
	a2=strategies.get(Integer.toString(i)).getstrategyname();
	k1=strategies.get(Integer.toString(i)).getstrategytype();
	k2=i;
	addsimplestrategy(a1,a2,k1,k2,dd);
}

}
