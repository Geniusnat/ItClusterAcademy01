package org.view;

import org.model.Person;

public class PersonView {

    public void listAll(Person[] people) {
        for(Person person: people) {
            if (person == null) {
                continue;
            }
            System.out.println(person);
        }
    }
}
