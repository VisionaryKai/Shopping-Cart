package homework7;
import java.util.ArrayList;
public class _13211191_Ò¶¿­_7_BookCatalog {
private ArrayList <_13211191_Ò¶¿­_7_BookSpecification>books=new ArrayList();
public void addbook(_13211191_Ò¶¿­_7_BookSpecification b)
{
	books.add(b);
}
public ArrayList <_13211191_Ò¶¿­_7_BookSpecification> getbooks()
{
	return books;
}
public _13211191_Ò¶¿­_7_BookSpecification getBookSpecification(String s)
{
	_13211191_Ò¶¿­_7_BookSpecification b=new _13211191_Ò¶¿­_7_BookSpecification();
	for(int i=0;i<books.size();i++)
	{
		if(books.get(i).getisbn().equals(s))
		{
			b=books.get(i);
			return b;
		}	
	}
	return null;
}
}
