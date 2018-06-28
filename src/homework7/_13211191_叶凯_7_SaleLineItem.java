package homework7;


public class _13211191_Ò¶¿­_7_SaleLineItem {
private int copies;
private _13211191_Ò¶¿­_7_BookSpecification prodSpec;
private _13211191_Ò¶¿­_7_IPricingStrategy strategy;
public _13211191_Ò¶¿­_7_SaleLineItem()
{
	
}
public _13211191_Ò¶¿­_7_SaleLineItem(int c,_13211191_Ò¶¿­_7_BookSpecification p,_13211191_Ò¶¿­_7_IPricingStrategy s)
{
	copies=c;
	prodSpec=p;
	strategy=s;
}
public double getSubTotal()
{
	return strategy.getSubTotal(this)*copies;
}
public _13211191_Ò¶¿­_7_BookSpecification getprodSpec()
{
	return this.prodSpec;
}
public int getcopies()
{
	return copies;
}
public _13211191_Ò¶¿­_7_IPricingStrategy getstrategy()
{
	return strategy;
}
}

