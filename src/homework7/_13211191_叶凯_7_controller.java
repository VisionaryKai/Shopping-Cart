package homework7;

public class _13211191_Ò¶¿­_7_controller {
private _13211191_Ò¶¿­_7_BookCatalog bc;
private _13211191_Ò¶¿­_7_StrategyCatalog stc;
_13211191_Ò¶¿­_7_Sale sa;
public _13211191_Ò¶¿­_7_controller()
{
	bc=new _13211191_Ò¶¿­_7_BookCatalog();
	stc=new _13211191_Ò¶¿­_7_StrategyCatalog();
	sa=new _13211191_Ò¶¿­_7_Sale();
}
public _13211191_Ò¶¿­_7_BookSpecification createbook(String a,String b,double d,int t)
{
	_13211191_Ò¶¿­_7_BookSpecification book=new _13211191_Ò¶¿­_7_BookSpecification(d,t);
	book.setisbn(a);
	book.settitle(b);
	return book;
}

public void addBook(_13211191_Ò¶¿­_7_BookSpecification b)
{
	bc.addbook(b);
}
public void addCompositeStrategy(String s1,String s2,int i,int j,String ss)
{
	stc.addcompositestrategy(s1,s2,i,j,ss);
	_13211191_Ò¶¿­_7_PricingStrategyFactory.getinstance().setCatalog(stc);
}
public void addSimpleStrategy(String s1,String s2,int i,int j,double bbb)
{
	stc.addsimplestrategy(s1,s2,i,j,bbb);
	_13211191_Ò¶¿­_7_PricingStrategyFactory.getinstance().setCatalog(stc);
}
public void deleteStrategy(int t)
{
	stc.deletestrategy(Integer.toString(t));
	_13211191_Ò¶¿­_7_PricingStrategyFactory.getinstance().setCatalog(stc);
}
public void updateStrategy(int i,double d)
{
	stc.updatestrategy(i,d);
	_13211191_Ò¶¿­_7_PricingStrategyFactory.getinstance().setCatalog(stc);
}
public _13211191_Ò¶¿­_7_IPricingStrategy returntype(int i)
{
	_13211191_Ò¶¿­_7_IPricingStrategy t;
	t=stc.find(Integer.toString(i));
	return t;
}
public _13211191_Ò¶¿­_7_BookCatalog getbc()
{
	return bc;
}
public _13211191_Ò¶¿­_7_StrategyCatalog getstc()
{
	return stc;
}
public void buyBook(String s,int i)
{
	sa.addItem(new _13211191_Ò¶¿­_7_SaleLineItem(i,bc.getBookSpecification(s),_13211191_Ò¶¿­_7_PricingStrategyFactory.getinstance().getPricingStrategy(bc.getBookSpecification(s).gettype())));
}
public _13211191_Ò¶¿­_7_Sale getSale()
{
	return sa;
}

}
