package com.app.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample11 {

	public static void main(String[] args) {

        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
        //Stream apply aTo Filter
        Stream<Product> stream=list.stream().filter(p->p.price>20000);
	
        stream.forEach(

        		prod->System.out.println(prod.name+" ......"+prod.price)
        		);
        System.out.println("==================================================");
        //thred with out lambda
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("I am runnable thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("==================================================");
        //thred with  lambda
        Runnable r1=()->System.out.println("i am Lambda Runnable");
        Thread t1=new Thread(r1);
        t1.start();
        System.out.println("==================================================");
	}
	
}
