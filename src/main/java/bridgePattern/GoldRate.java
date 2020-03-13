package bridgePattern;

public class GoldRate 
{
	static int gold=30000;
	public void SellGold(int n)
	{
		gold-=n*200;
		System.out.println("Gold rate has been decreased due to more number of returns");
	}
	public void BuyGold(int n)
	{
		gold+=n*200;
		System.out.println("Gold rate has been increased due to more number of purchases");
	}
	
}
