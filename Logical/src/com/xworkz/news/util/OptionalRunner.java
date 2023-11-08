package com.xworkz.news.util;

import java.util.Optional;

public class OptionalRunner {
	public static void main(String[] args) {

		
		Optional<Integer> opt= getAgeByName("Yash");
		if(opt.isPresent())
		{
			int age=opt.get();
		}
	}

	public String convertToUpperCase(String name) {
		return name.toUpperCase();
	}

	public static Optional<Integer> getAgeByName(String name) {
		if (name.equals("Yash")) {

			return Optional.of(23);
		}
		if (name.equals("Shivu")) {
			return Optional.of(21);
		}

		return Optional.empty();
	}
}
