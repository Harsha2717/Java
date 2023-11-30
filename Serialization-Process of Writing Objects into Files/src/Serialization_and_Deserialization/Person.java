package Serialization_and_Deserialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -2121054045542550516L;
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[ Name : " + name + " , Age : " + age + " ]";
	}
}
