package homework7;

import java.util.ArrayList;

public class _13211191_Ò¶¿­_7_Sale implements _13211191_Ò¶¿­_7_Subject{
	private ArrayList <_13211191_Ò¶¿­_7_SaleLineItem> items=new ArrayList<_13211191_Ò¶¿­_7_SaleLineItem>();
	private ArrayList observers;
	//ArrayList items=new ArrayList();
	public _13211191_Ò¶¿­_7_Sale()
	{
		observers=new ArrayList();
		
	}
	public double getTotal()
	{
		int i;
		double total;
		total=0.0;
		for(i=0;i<items.size();i++)
		{
			total=total+items.get(i).getSubTotal();
		}
		return total;
	}
	
	public void addItem(_13211191_Ò¶¿­_7_SaleLineItem m){
		items.add(m);
	}
	
	public void removeObserver(_13211191_Ò¶¿­_7_Observer o)
	{
		int i=observers.indexOf(o);
		if(i>=0)
		{
			observers.remove(i);
		}
		
	}
	public void registerObserver(_13211191_Ò¶¿­_7_Observer o)
	{
		observers.add(o);	
	}
	public void notifyObservers()
	{
		for(int i=0;i<observers.size();i++)
		{
			_13211191_Ò¶¿­_7_Observer observer=(_13211191_Ò¶¿­_7_Observer)observers.get(i);
			observer.update(this);
		}
		
	}
	public  ArrayList <_13211191_Ò¶¿­_7_SaleLineItem> getitems()
	{
		return this.items;
	}

}
