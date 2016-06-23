package com.Constructor;

public class Telphone {
	float screen;
	float cpu;
	float mem;
	public Telphone(){
		System.out.println("no parameter");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		if(newScreen < 3.5f){
			System.out.println("You have input the wrong parameter, set it to 3.5");
			screen = 3.5f;
		}
		else{
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;}
		System.out.println("has parameter");
	}
}
