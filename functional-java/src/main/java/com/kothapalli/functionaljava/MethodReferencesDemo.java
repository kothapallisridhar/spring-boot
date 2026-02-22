package com.kothapalli.functionaljava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesDemo {

    public static void main(String[] args) {

        Supplier<Double> random = Math::random;
        System.out.println(random.get());

        Function<Person, String> getName = Person::getName;
        System.out.println(getName.apply(new Person("Kothapalli", 45)));

        Person p1 = new Person("Foo", 15);
        Person p2 = new Person("Bar", 20);
        BiPredicate<Person, Person> equals = Person::equals;
        System.out.println(equals.test(p1, p2));

        Function<ArrayList<String>, Integer> getCount = List::size;

        Function<List<String>, Collection<String>> dedupe = HashSet::new;


    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
