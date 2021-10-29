package com.aris.SpringcoreAssign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class Gooddaygreeting implements Greeting
{
String greeting = "Have a Good Day";

public String getGreeting()
{
return greeting;
}

public void setGreeting(String greeting)
{
this.greeting = greeting;
}

public String greet()
{



return greeting;
}



public Gooddaygreeting()
{
super();
System.out.println(greeting);
}

}
