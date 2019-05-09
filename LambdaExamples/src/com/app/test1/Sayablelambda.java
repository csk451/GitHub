package com.app.test1;

public class Sayablelambda {
	
	public static void main(String[] args) {
		
		/*	
		Sayable s=new Sayable() {
			
			@Override
			public String say() {
				// TODO Auto-generated method stub
				return "Hello lambda experessions";
			}
		};
		System.out.println(s.say());
	*/
Sayable s=()->{
				// TODO Auto-generated method stub
				return "Hello lambda experessions";
		};
		System.out.println(s.say());	
		
		}

}
