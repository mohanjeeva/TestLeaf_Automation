package week3.day1;

public class Student {
	
	public void getStudentInfo(int id) 
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) 
	{
		System.out.println(id+" "+name);
	}
	public void getStudentInfo(String Email, long phoneNumber) 
	{
		System.out.println(Email+" "+phoneNumber);
	}
	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.getStudentInfo(12345);
		stu.getStudentInfo(12345, "Jeeva");
		stu.getStudentInfo("jeevainkpm@gmail.com", 9043796536L);
	}
}
