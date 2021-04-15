package com.chinaliyq.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinaliyq.spring.beans.Person;

/**
 * @Author: liyq
 * @Description: spring-framework
 * @Date: 2021/4/15 - 20:45
 * @Version: 1.0
 **/
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpxac =
                new ClassPathXmlApplicationContext("/resources/springframework.xml");
        Person bean = cpxac.getBean(Person.class);
        System.out.println(bean);
    }
}
