package com.haripadisetti.designpattens.factory;

public class PersonFactory {

	public static Person getPersonType(String type) {
		Person person = null;
		if (type.equals("male")) {

			person = new Male();
		} else if (type.equals("female")) {

			person = new Female();
		}

		return person;

	}

}
