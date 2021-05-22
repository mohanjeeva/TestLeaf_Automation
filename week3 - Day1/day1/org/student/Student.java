package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department
{
	
	public void studentName()
	{
		System.out.println("Jeeva");
	}
	public void studentDept()
	{
		System.out.println("IT");
	}
	public void studentId()
	{
		System.out.println("111111");
	}

	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
}
