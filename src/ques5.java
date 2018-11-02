class FIGmd 
{
    String emp_name;
	static int emp_id;
	
	static void assignId()
	{
		emp_id=1102;
	}
	
	void assignName()
	{
		emp_name="Pooja";
	}
}


public class ques5 {

	public static void main(String[] args) 
	{
		FIGmd f = new FIGmd();
		
		System.out.println("Id: "+f.emp_id);
		System.out.println("Name: "+f.emp_name);
		f.emp_id=2342;
		f.emp_name="New emp";
		System.out.println("--------------");
		System.out.println("Id: "+f.emp_id);
		System.out.println("Name: "+f.emp_name);

	}

}
