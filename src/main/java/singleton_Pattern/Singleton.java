package singleton_Pattern;


import singleton_Pattern.LimitClass;

class LimitClass 
{
private static LimitClass limitClassInstanse;
public static int objectCount=0;

private LimitClass()
{
	objectCount++;
}

public static synchronized LimitClass CreateInstance()
{
	if(objectCount<1)
	{
		System.out.println("New Object created Successfully");
		limitClassInstanse=new LimitClass();
	}
	else
		System.out.println("It seems like You have already created an Object, You cannot Create More than One Object");
	return limitClassInstanse;
}
	
	
}

public class Singleton  {
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		LimitClass object = LimitClass.CreateInstance();
		LimitClass object1 = LimitClass.CreateInstance();
		LimitClass object2 = LimitClass.CreateInstance();
		
		
	}
	

}
