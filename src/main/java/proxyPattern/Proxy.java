package proxyPattern;
import java.util.*;

public class Proxy extends FoodDeliveryApp
{
	public static void main(String[] args)
	{
		FoodDeliveryApp orderObject = new FoodDeliveryApp();
		int k=1;
		Scanner sc=new Scanner(System.in);
		while(k==1)
		{
		System.out.println("Welcome to the Food Delivery App\n");
		System.out.print("1.Biryani\n2.Fried Rice\n3.Noodles\nSelect the food item : ");
		
		int choice;
		System.out.println();
		choice=sc.nextInt();
		try {
		switch(choice)
		{
		case 1:orderObject.OrderFood("Biryani");break;
		case 2:orderObject.OrderFood("Fried Rice");break;
		case 3:orderObject.OrderFood("Noodles");break;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.print("Do you want to Order again?(1/0): ");
		k=sc.nextInt();
		}
		sc.close();
	}
}
