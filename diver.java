import java.util.Scanner;

public class diver {
	
	
public static void main (String[] args) {
	
Book b=new Book("Math   ",2000,50.00,200);
Book b1=new Book("cs     ",2010,90.00,250);
Book b2=new Book("is     ",2004,40.00,100);
Book b3=new Book("islamic",1999,78.00,730); 
Book b4=new Book();  

System.out.println("Title         "+"Publication Date            "+"Price               "+"Page Count     ");

   
	Tape t=new Tape("movie action ",2017,100.00,2);
	Tape t1=new Tape("movie comedy ",2009,500.00,2);
	Tape t2=new Tape("movie drama  ",2014,330.00,3);
	Tape t3=new Tape("movie islamic",1998,718.00,4);
	Tape t4=new Tape();  

	 b.print();
		b1.print();
		b2.print();
		b3.print();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Title         "+"Publication Date            "+"Price               "+"Playing Length     ");

	t.print();
		t1.print();
		t2.print();
		t3.print();
    Book infobook[];
    
//Show The Longest Book 

	if(b.getpage_count()>b1.getpage_count() ) 
	{
	
		if(b.getpage_count()>b2.getpage_count())
			
			if(b.getpage_count()>b3.getpage_count())
	
			System.out.println("The Book is longer book  :"+ b.getTitle()+" ");
	}
		else 
		
			if(b1.getpage_count()>b2.getpage_count()) 
			{
				if(b1.getpage_count()>b3.getpage_count())
				System.out.println("The Book is longer book  :"+ b1.getTitle()+" ");
		}
			else
				if(b2.getpage_count()>b3.getpage_count()) 
					System.out.println("The Book is longer book  :"+ b2.getTitle()+" ");
				
					System.out.println("The Book is longer book  :"+ b3.getTitle()+" ");
				
					
					
					//Show The 
					
					if(t.getplaying_length()>t1.getplaying_length())
						
					{
					
						if(t.getplaying_length()>t2.getplaying_length())
							
							if(t.getplaying_length()>t3.getplaying_length())
					
							System.out.println("The Tape is Most Expensive  :"+ t.getTitle()+" ");
					}
						else 
						
							if(t1.getplaying_length()>t2.getplaying_length()) 
							{
								if(t1.getplaying_length()>t3.getplaying_length())
								System.out.println("The Tape is Most Expensive  :"+ t1.getTitle()+" ");
						}
							else
								if(t2.getplaying_length()>t3.getplaying_length()) 
									System.out.println("The Tape is Most Expensive  :"+ t2.getTitle()+" ");
								
									System.out.println("The Tape is Most Expensive  :"+ t3.getTitle()+" ");
									
									
									System.out.println("The precentage of books : "+(b4.count_book*100)/100+"%");
									System.out.println("The precentage of Tapes : "+(t4.count_tape*100)/100+"%");

	
}
	



	

}
