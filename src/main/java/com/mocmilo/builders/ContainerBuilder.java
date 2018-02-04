package com.mocmilo.builders;

import com.mocmilo.model.Container;
import com.mocmilo.model.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.mocmilo.model.Person.Gender.M;
import static com.mocmilo.model.Person.Gender.W;

public class ContainerBuilder {

    public Container build() {
        Person person1 = new Person("Tom", 27, M);
        Person person2 = new Person("Alice", 24, W);
        Person person3 = new Person("Dominica", 28, W);

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        return new Container("just example string",
                Arrays.asList(person1, person2, person3),
                personSet);
    }
}