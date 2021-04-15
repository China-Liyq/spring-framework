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
        //放入配置路径
        ClassPathXmlApplicationContext cpxac =
                new ClassPathXmlApplicationContext("/resources/springframework.xml");
        Person person1 = cpxac.getBean("1",Person.class);
        final Person person2 = cpxac.getBean("2", Person.class);
        System.out.println(person1);
        System.out.println(person2);
    }
}
