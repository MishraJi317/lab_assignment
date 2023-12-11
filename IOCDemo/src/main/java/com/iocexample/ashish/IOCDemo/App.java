package com.iocexample.ashish.IOCDemo;

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
    	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
    	
    	sim sim1 = (sim) con.getBean("airtel");
    	sim1.calling();
    	sim1.data();
        
    }
}
