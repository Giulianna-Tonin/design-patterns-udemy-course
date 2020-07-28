package com.udemy.singleton;

import java.util.function.Supplier;

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func) {
        Object object = func.get();
        Object object2 = func.get();

        return object.equals(object2);

    }
}

class SingletonObject {

    private static final SingletonObject instance = new SingletonObject();

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        return instance;
    }
}

class NormalObject {
}

class Demo {

    public static void main(String[] args) {

        System.out.println(SingletonTester.isSingleton(NormalObject::new));
        System.out.println(SingletonTester.isSingleton(SingletonObject::getInstance));

    }
}