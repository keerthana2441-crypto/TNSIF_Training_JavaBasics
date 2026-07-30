package org.tnsif.acc.c2tc.methodverriding_super_this;


class Person
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("keerthana");
		person.setAge(20);
		person.getName();
		person.getAge();
		person.displayDetails();
		person.setName("kuvik");
		person.setAge(1);
		person.getName();
		person.getAge();
		person.displayDetails();
		
		

	}

}


