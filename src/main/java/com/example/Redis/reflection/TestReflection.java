package com.example.Redis.reflection;


import java.lang.reflect.Method;

import org.springframework.stereotype.Component;

@Component
public class TestReflection {

    public TestReflection() {
        
    }
    public void testReflection() throws Exception {
        Class<?> clazz = Class.forName("com.example.Redis.reflection.ReflectionClass");
        ReflectionClass reflectionClass=(ReflectionClass) clazz.getDeclaredConstructor(String.class, int.class, String.class).newInstance("John", 30, "123 Main St");
        reflectionClass.printDetails();
        Method[] method=clazz.getDeclaredMethods();
        for (Method m : method) {
            System.out.println("Method Name: " + m.getName());
            System.out.println("Return Type: " + m.getReturnType().getName());
            System.out.println("Parameter Types: ");
            Class<?>[] parameterTypes = m.getParameterTypes();
            for (Class<?> paramType : parameterTypes) {
                System.out.println(paramType.getName());
            }
        }
        



    }

}
