package com.itacademy.firstgit;

import com.itacademy.firstgit.animals.Cat;
import com.itacademy.firstgit.animals.Dog;

public class Main {

	public static void main(String[] args) {
		Cat vaska = new Cat();
		vaska.setAge(5);
		vaska.setName("Vaska");
		
		Dog sharik = new Dog();
		sharik.setAge(4);
		sharik.setName("Sharik");
		
		System.out.println("Cats name is " + vaska.getName());
		System.out.println("Dogs name is " + sharik.getName());
	}
}
