package com.spring;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //IOC
        Payment pay = (Payment)context.getBean("magicpay");
        

        
        System.out.println(pay.getMessage());
        System.out.println(pay.getPayStatus().getStatus());
        System.out.println(pay.getPayStatus().getNames());


        System.out.println( "===================Done" );


    }
}
