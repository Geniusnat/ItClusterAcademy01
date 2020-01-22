package org.controller;

import org.model.Person;
import org.utils.Utils;
import org.view.PersonView;

public class PersonController implements ICommands {

    /**
     * List all persons
     */
    public void list() {
        Person[] people = Utils.getPersons();
        PersonView personView = new PersonView();
        personView.listAll(people);
    }

    public String[] getCommands() {
        String[] commands = {"list", "listFemale", "listMale"};
        return commands;
    }

    public void listByGender(boolean isMale) {
        Person[] people = Utils.getPersons();
        Person[] people1ByGender = new Person[people.length];
        int i = 0;
        for (Person person: people) {
            if (isMale && person.isGender()) {
                people1ByGender[i++] = person;
            }
            if (!isMale && !person.isGender()) {
                people1ByGender[i++] = person;
            }
        }

        PersonView personView = new PersonView();
        personView.listAll(people1ByGender);
    }
}
