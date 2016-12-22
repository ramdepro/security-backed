package com.niit.security_backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.securitybackend.config.AppContextConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
        
    }
}
