package com.haripadisetti.designpattens.factory;

public class FactoryTest {

	public static void main(String[] args) {

		PersonFactory personFactory =  new PersonFactory();
		Person person = personFactory.getPersonType("male");
		person.wish("Good Morning");
	}

}
