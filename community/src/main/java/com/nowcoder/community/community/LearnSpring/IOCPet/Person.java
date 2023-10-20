package com.nowcoder.community.community.LearnSpring.IOCPet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Pet {
    public void say();
}

@Component
@Primary
class Dog implements Pet{
    @Override
    public void say() { System.out.println("Dog"); }
}

@Component
class Cat implements Pet{
    @Override
    public void say() { System.out.println("Cat"); }
}
@Component
public class Person {
    @Autowired
    Pet pet;
}
