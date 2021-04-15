package com.chinaliyq.spring.beans;

/**
 * @Author: liyq
 * @Description: spring-framework
 * @Date: 2021/4/15 - 20:47
 * @Version: 1.0
 **/
public class Person {
    private String name;
    private Character sex;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", setx=" + sex +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, Character setx, Integer age) {
        this.name = name;
        this.sex = setx;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
