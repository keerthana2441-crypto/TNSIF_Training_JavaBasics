package org.tnif.acc.c2tc.manager;

	//parent class
	class Course
	{
		String courseName="Java Programmming"; //instance var
		
		void showCourse()
		{
			System.out.println("Course :"+courseName);
		}
	}
	//sub class
	class Student extends Course 
	{
		String name="Ali";
		
		void showStudent()
		{
			System.out.println("Student : "+name);
		}
	}
	public class SingleLevelInheritanceDemo {

		public static void main(String[] args) {
			Student student=new Student();
			student.showCourse();
			student.showStudent();
			

		}

	}
	