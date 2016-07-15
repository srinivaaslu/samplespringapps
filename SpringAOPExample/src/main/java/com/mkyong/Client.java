package com.mkyong;

import com.mkyong.customer.bo.CustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 205025 on 7/7/2016.
 */
public class Client {
    public static void main(String []args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
        CustomerBo customerBo = (CustomerBo)applicationContext.getBean("customerBo");
        customerBo.addCustomer();
    }
}
