package com.app.test2;

public class Syable1Lambda {

public static void main(String[] args) {
/*	Sayable1 s1=new Sayable1() {
		
		@Override
		public String say(String name) {
			// TODO Auto-generated method stub
			return "Hiii Parameter String::"+name;
		}
	};
	System.out.println(s1.say("jai"));
	*/
	
	
	Sayable1 s1=(name)->{return "Hello::"+name;};
	System.out.println(s1.say("baja"));
}
}
