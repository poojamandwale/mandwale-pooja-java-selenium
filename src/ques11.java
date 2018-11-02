/*
 * this is a reference variable that refers to the current object
 */

class Student
{  
	int rollno;  
	String name;  
  
	Student(int rollno, String name)
	{  
		rollno=this.rollno;  
		name=this.name;  
	}  

	void display()
	{
		System.out.println(rollno+" "+name);
	}  
}  

class ques11
{  
	public static void main(String args[])
	{  
		Student s1=new Student(01,"abc");   
		s1.display();   
	}
}  