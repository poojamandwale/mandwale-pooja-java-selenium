/*
 Method overriding
 If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 */
class college
{
	int subjects()
	{
		return 0;
	}
}

class mechanical extends college
{
	int subjects()
	{
		return 5;
	}
}

class electrical extends college
{
	int subjects()
	{
		return 7;
	}
}

class computer extends college
{
	int subjects()
	{
		return 6;
	}
}

public class ques3 
{

	public static void main(String[] args) 
	{
			mechanical m=new mechanical();
			electrical e=new electrical();
			computer c=new computer();
			System.out.println("no of sujects in each deparment");
			System.out.println("mechanical: "+m.subjects());
			System.out.println("electrical: "+e.subjects());
			System.out.println("computer: "+c.subjects());
	}

}
