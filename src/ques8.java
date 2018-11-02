import java.util.*;

public class ques8 {

	public static void main(String[] args) 
	{
		HashMap <String, String> h=new HashMap<String, String>();
		h.put("empId1", "empObject1");
		h.put("empId2", "empObject2");
		
		System.out.println(h);
		
		Set <String> i = h.keySet();
		
		Iterator <String> itr=i.iterator();
		{
			while(itr.hasNext())
			{
				String id=itr.next();
				String obj=h.get(id);
				
				System.out.println("\n");
				
				System.out.println("Employee ID="+id);
				System.out.println("Employee Object="+obj);
	
			}
		}
		
		
		

	}

}
