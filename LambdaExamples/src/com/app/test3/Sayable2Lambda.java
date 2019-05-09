package com.app.test3;

public class Sayable2Lambda {

	public static void main(String[] args) {
		/*Sayable2 s2=new Sayable2() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return (a+b);
			}
		};
		System.out.println(s2.add(5, 7));*/
		
		//WithOut Return Key Word
		Sayable2 s2=(a,b)->(a+b);
		System.out.println(s2.add(40,50));
		
		//With return key Word
		
		Sayable2 s3=(a,b)->{
			return a+b;
		};
		System.out.println("With retrn ::"+s2.add(10,50));
	}
	
}
