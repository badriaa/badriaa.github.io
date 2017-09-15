import java.util.Date;

public class Publication {
private String title;
private int publication_date;
private double price;

public Publication() {
	this.title="non";
	this.price=0;
	this.publication_date=0;
}
public Publication(String ptitle,int ppublication_date,double pprice) {
	this.title=ptitle;
	this.publication_date=ppublication_date;
	this.price=pprice;
}
public void setTitle(String t) {
	this.title=t;
}
public String getTitle() {
	return title;
}


public void setpublication_date(int d) {
	this.publication_date=d;
}
public int getpublication_date() {
	return publication_date;
}

public void setPrice(double p) {
	this.price=p;
}
public double getprice() {
	return price;
}

public void print() {
}


}
