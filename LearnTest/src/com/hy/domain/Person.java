package com.hy.domain;

public class Person implements Cloneable{
	private String name ;
	
	private int age ;
	
	private String address ;

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		else if(! (obj instanceof Person)){
			return false;
		}
		else{
			Person person = (Person)obj;
			return this.name.equals(person.getName()) && this.age == person.getAge() && this.address.equals(person.getAddress());
		}
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode()*31+this.age*31+this.address.hashCode()*31;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	@Override
	public Object clone() {
		Person person = null;
		try{
			person = (Person) super.clone();
		}catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return person;
	}
	
}
