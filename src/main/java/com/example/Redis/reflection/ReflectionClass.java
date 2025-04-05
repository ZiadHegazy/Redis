package com.example.Redis.reflection;

import org.springframework.stereotype.Component;

@Component
public class ReflectionClass {
    private String name;
    private int age;
    private String address;

    public ReflectionClass() {
    }
    

    public ReflectionClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
