package org.model;

import java.util.Arrays;
import java.util.Objects;

public class Group {
    private Person[] people;
    private String name;
    private Person head;

    public Group() {
    }

    public Group(Person[] people, String name, Person head) {
        this.people = people;
        this.name = name;
        this.head = head;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getHead() {
        return head;
    }

    public void setHead(Person head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Group{" +
                "people=" + Arrays.toString(people) +
                ", name='" + name + '\'' +
                ", head=" + head +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Arrays.equals(people, group.people) &&
                Objects.equals(name, group.name) &&
                Objects.equals(head, group.head);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, head);
        result = 31 * result + Arrays.hashCode(people);
        return result;
    }
}
