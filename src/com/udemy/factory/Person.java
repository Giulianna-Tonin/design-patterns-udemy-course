package com.udemy.factory;

public class Person {

    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory {

    static int personId;

    public Person createPerson(String name) {
        return new Person(personId++, name);

    }
}

class Demo {

    public static void main(String[] args) {

        PersonFactory pf = new PersonFactory();
        Person name = pf.createPerson("name");
        Person name1 = pf.createPerson("name1");
        Person name2 = pf.createPerson("name2");
        Person name3 = pf.createPerson("name3");



    }
}
