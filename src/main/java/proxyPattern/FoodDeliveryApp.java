package proxyPattern;

public class FoodDeliveryApp extends Restaurent
{
	Restaurent restaurentObject = new Restaurent();
	public void OrderFood(String foodItem)
	{
		System.out.println(foodItem+" Order Passed to the Restaurent, Waiting for the Confirmation");
		restaurentObject.TakeOrder(foodItem);
	}
	
	
}
