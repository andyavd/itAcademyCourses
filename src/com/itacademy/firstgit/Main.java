package com.itacademy.firstgit;

import com.itacademy.firstgit.animals.Cat;
import com.itacademy.firstgit.animals.Dog;
import com.itacademy.firstgit.animals.Pig;

public class Main {

	public static void main(String[] args) {
		Cat vaska = new Cat();
		vaska.setAge(5);
		vaska.setName("Vaska");
		
		Dog sharik = new Dog();
		sharik.setAge(4);
		sharik.setName("Sharik");
		
		Pig borka = new Pig();
		borka.setAge(4);
		borka.setName("Borka");
		
		System.out.println("Cat's name is " + vaska.getName());
		System.out.println("Dog's name is " + sharik.getName());
		System.out.println("Pig's name is " + borka.getName());
	}
}
