package com.diablo.asssgn113;

import com.diablo.asssgn113.Legs;

public class Dog implements Animal{
	
	int age;
	String sound;
	Legs leg;
	public Legs getLeg() {
		return leg;
	}
	public void setLeg(Legs leg) {
		this.leg = leg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void makeSound(){
		System.out.println("The Dog of age "+age+" does "+sound+" and "+leg);
	}
	

}
