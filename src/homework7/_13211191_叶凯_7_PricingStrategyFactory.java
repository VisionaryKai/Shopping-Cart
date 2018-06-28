package homework7;

public class _13211191_Ò¶¿­_7_PricingStrategyFactory 
{
	static _13211191_Ò¶¿­_7_PricingStrategyFactory instance;
	 _13211191_Ò¶¿­_7_StrategyCatalog catalog;
	public static synchronized _13211191_Ò¶¿­_7_PricingStrategyFactory getinstance()
	{
		 if ( instance == null )
	     instance = new _13211191_Ò¶¿­_7_PricingStrategyFactory(); 
		 return instance; 
	}
	public _13211191_Ò¶¿­_7_IPricingStrategy getPricingStrategy(int type)
	{
		if(type==1||type==3)
		{
			return (_13211191_Ò¶¿­_7_PercentageStrategy)catalog.strategies.get(Integer.toString(type));
		}
		else if(type==2)
		{
			return (_13211191_Ò¶¿­_7_FlatRateStrategy)catalog.strategies.get(Integer.toString(type));
		}
		else if(type==4)
		return (_13211191_Ò¶¿­_7_CompositeStrategy)catalog.strategies.get(Integer.toString(type));
		else return null;
	}
	public void setCatalog(_13211191_Ò¶¿­_7_StrategyCatalog sc)
	{
		catalog=sc;
	}	
}
