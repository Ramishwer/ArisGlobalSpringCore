package com.aris.SpringcoreAssign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
GreeterService gr = context.getBean(GreeterService.class);
gr.printGreeting();
}
}
