/*
 	
 	Person class & ENUM with sex with handling encapsulation
 	
 */

package com.demo2.person;

public class Person {
	
	// Creating fields with PRIVATE access modifier to maintain Encapsulation
	private String name;
	private int age;
	private float height;
	private float weight;
	private Sex sex;
	
	
	// Generating getter and setter methods for enhancing encapsulation
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
	public float getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}	
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex s) {
		this.sex = s;
	}
	
	//Overriding From Object class
	@Override
	public String toString() {
		
		System.out.println("Person [name=" + name + ", weight=" + weight + "]");
		return "Person [name=" + name + ", weight=" + weight + "]";
	}
	
}

enum Sex{
	MALE, FEMALE;
}


