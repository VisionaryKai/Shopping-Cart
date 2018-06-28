package homework7;

import java.util.Iterator;

public class _13211191_Ò¶¿­_7_CompositeBestForCustomer extends _13211191_Ò¶¿­_7_CompositeStrategy{
	public double getSubTotal(_13211191_Ò¶¿­_7_SaleLineItem s)
	{
		double lowestmoney;
		lowestmoney=0.0;
		for(Iterator<_13211191_Ò¶¿­_7_IPricingStrategy> i=strategies.iterator();i.hasNext();)
		{
			_13211191_Ò¶¿­_7_IPricingStrategy strategy;
			strategy=i.next();
			if(lowestmoney==0.0)
			lowestmoney=strategy.getSubTotal(s);
			else if(strategy.getSubTotal(s)<lowestmoney)
			lowestmoney=strategy.getSubTotal(s);	
		}
		return lowestmoney;
		
	}
	public double getdiscount()
	{
		String sss;
		sss=this.getcombinenum();
		return Double.parseDouble(sss);
	}
	public void setdiscount(double d)
	{
		
	}
	
}
