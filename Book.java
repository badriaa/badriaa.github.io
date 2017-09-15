
public class Book extends Publication {
private int page_count;
public static int count_book;

public Book() {
	super();
	this.page_count=0;
    
}
 
Book(String ptitle,int ppublication_date,double pprice, int ppage_count) {
	super(ptitle,ppublication_date,pprice);
	this.page_count=ppage_count;
	count_book++;

}


public void setpage_count(int p) {
	page_count=p;
}
public int getpage_count() {
	return page_count;
}



@Override
public void print() {

System.out.println(super.getTitle()+"               "+super.getpublication_date()+
		"                "+super.getprice()+"$                "+getpage_count()+" page");
}


}
