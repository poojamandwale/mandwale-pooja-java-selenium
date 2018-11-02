/*
 Overloading:
 If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. 
 */

class addition
{
	void add(int a, int b)
	{
		System.out.println("Addition is: "+a+b);
	}
	void add(String a, String b)
	{
		System.out.println("Addition is: "+a+b);
	}
}

public class ques2 {

	public static void main(String[] args) 
	{
		addition addition=new addition();
		addition.add(2, 5);
		addition.add("Hellow", " world");

	}

}
