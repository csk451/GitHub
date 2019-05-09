package com.app.test;

public class DrawableLambdaExp {
	
	public static void main(String[] args) {
		
		int width=10;
		//With Out  Lambda Experession
/*		Drawable d1=new   Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("The Width:"+width);
			}
		};	
		d1.draw();
*/
		
		//With lamdas
Drawable d1=()-> {
				// TODO Auto-generated method stub
				System.out.println("The Width:"+width);
			};
		d1.draw();
		
	}
}
