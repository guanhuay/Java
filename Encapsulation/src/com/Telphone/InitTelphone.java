package com.Telphone;

import com.Telphone.Telphone;

public class InitTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if not specified Telphone class, by default system would make one.
		//creat object with no parameter
		Telphone phone = new Telphone();
		//create object with parameter
		Telphone phone2 = new Telphone(3.0f,1.2f,2.0f);
		phone2.setScreen(6.0f);
		System.out.printf("screen:"+phone2.getScreen());
	}

}
