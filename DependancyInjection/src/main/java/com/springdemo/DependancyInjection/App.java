package com.springdemo.DependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
        
        Performer p1 = (Performer) con.getBean("paint");
        
        p1.perform();
    }
}
