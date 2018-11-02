/*
 Objects in an entity which has state and behavior, basically it is an instance of a class.
 The keyword new is used to allocate memory to the instance of the class. 
 */
//example of object and keyword new

class car
{
	String  car_name;
}

public class ques1 {

	public static void main(String[] args)
	{
		car renault=new car();
		renault.car_name="Duster";
		System.out.println("car: "+renault.car_name);
	}

}
