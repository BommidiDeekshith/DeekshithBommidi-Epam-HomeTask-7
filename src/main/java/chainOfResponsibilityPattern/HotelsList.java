package chainOfResponsibilityPattern;
import java.util.*;
public class HotelsList extends BookHotel
{
	Scanner sc=new Scanner(System.in);
	BookHotel bookRoomObject= new BookHotel();
	public void ShowHotels()
	{	
		int d;
		System.out.println("Welcome to the Hotel Booking Portal\n\nThe List Of Premium Hotels are:\n");
		System.out.print("1.Royal Paradise - 5 Star\n2.Hotel Orchade - 4 Star\n3.Red Ginger restaurent - 5Star\n\nEnter Your Choice :");
		d=sc.nextInt();
		System.out.println("\nHang on a second, We are confirming with our Hotel Partner...\n");
		try {
			switch(d)
			{
			case 1:bookRoomObject.BookRoom("Royal Paradise");break;
			case 2:bookRoomObject.BookRoom("Hotel Orchade");break;
			case 3:bookRoomObject.BookRoom("Red Ginger restaurent");break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
