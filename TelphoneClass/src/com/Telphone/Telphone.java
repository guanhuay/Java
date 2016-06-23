package com.Telphone;

//define a class
public class Telphone {
	//define the attribute of a class
	float screen;
	float cpu;
	float mem;
	//define method of the class
	void call(){
		System.out.println("Telphone could make phone call");
	}
	void sendMessage(){
		System.out.println("screen: "+screen+"cpu: "+cpu+"mem: "+mem+" Telphone could send text message!");
	}
}