
public class Tape extends Publication {
private int playing_length;
public static int count_tape;

public Tape() {
	super();
	this.playing_length=0;
	

}


Tape (String ptitle,int ppublication_date,double pprice, int pplay_length) {
	super(ptitle,ppublication_date,pprice);
	this.playing_length=pplay_length;
	count_tape++;
}


public void setplaying_length(int p) {
	this.playing_length=p;
}
public int getplaying_length() {
	return playing_length;
}
@Override
public void print() {
//	System.out.println("Title        "+"Publication Date        "+"Price        "+"Playing Length        ");

System.out.println(super.getTitle()+"         "+super.getpublication_date()+"                "+super.getprice()+"$"+
		"             "
		+ "   "+getplaying_length()+" hours");

}
}
