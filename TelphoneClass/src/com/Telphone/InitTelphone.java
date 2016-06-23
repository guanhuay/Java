package com.Telphone;

public class InitTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone = new Telphone();
		phone.sendMessage();
		phone.screen = 5.0f;
		phone.cpu = 1.4f;
		phone.mem = 2.0f;
		//call method
		phone.sendMessage();
	}

}
