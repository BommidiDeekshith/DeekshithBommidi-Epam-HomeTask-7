package chainOfResponsibilityPattern;
import java.util.*;
public class ChainOfResponsibility extends HotelsList
{
	public static void main(String[] args)
	{
	int k=1;
	Scanner sc=new Scanner(System.in);
	HotelsList hotelsListObject = new HotelsList();
	while(k==1)
	{
		hotelsListObject.ShowHotels();
		System.out.print("Do you want to Order Again?(1/0): ");
		k=sc.nextInt();
		System.out.println();
	}
	sc.close();
	}
}
