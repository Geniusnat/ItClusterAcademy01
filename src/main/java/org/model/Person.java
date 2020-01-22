package org.model;

import java.util.Arrays;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private boolean gender;
    private int age;
    private String[] hobby;

    public Person() {
    }

    public Person(String name, boolean gender, int age,
                  String[] hobby) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender &&
                age == person.age &&
                Objects.equals(name, person.name) &&
                Arrays.equals(hobby, person.hobby);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, gender, age);
        result = 31 * result + Arrays.hashCode(hobby);
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(getAge(), o.getAge());
    }
}
