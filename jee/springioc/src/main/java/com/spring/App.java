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

        Payment pay = (Payment)context.getBean("magicpay");
        
        System.out.println(pay);
        
        Payment pay2 = (Payment)context.getBean("magicpay");
        
        System.out.println(pay2);

        System.out.println( "===================Done" );


    }
}
