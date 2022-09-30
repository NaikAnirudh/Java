package com.training.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Using Main class to call the methods present in the Login class.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Login login = context.getBean(Login.class);
        System.out.println("Process Started!!!! ");
        login.user1();
        System.out.println("Process Started!!!! ");
        login.user2();
        System.out.println("Process Started!!!! ");
        login.user3();
    }
}


/*
Output:
Process Started!!!!
Validating User!!!
User 1 Successfully logged in!!!
Processing Further Transaction!!!!!
Process Started!!!!
Validating User!!!
User 2 Successfully logged in!!!
Processing Further Transaction!!!!!
Process Started!!!!
Validating User!!!
User 3 Successfully logged in!!!
Processing Further Transaction!!!!!
 */