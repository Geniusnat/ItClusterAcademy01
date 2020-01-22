package org.utils;

import org.model.Group;
import org.model.Person;
import org.model.Products;

public class Utils {
    public static Person[] getPersons() {

        String h1[] = {"IT", "TV"};
        String h2[] = {"IT", "Games"};
        String h3[] = {"Fashion", "Kitchen"};
        String h4[] = {"Guns", "Cars"};

        Person[] people = {
                new Person("Igor", true, 41, h1),
                new Person("Andriy", true, 22, h2),
                new Person("Oksana", false, 18, h3),
                new Person("Mykola", true, 28, h4)
        };

        return people;
    }

    public static Group[] getGroups() {
        Person[] people1 = getPersons();
        Person[] people2 = getPersons();

        people1[0].setName("Ivan");
        people1[1].setName("Ivan1");
        people1[2].setName("Ivanna");
        people1[3].setName("Ivan3");

        people2[0].setName("Oleg1");
        people2[1].setName("Oleg2");
        people2[2].setName("Olga");
        people2[3].setName("Oleg3");


        String h1[] = {"IT", "TV"};
        String h2[] = {"IT2", "TV2"};

        Group[] groups = {
                new Group(people1, "Java1", new Person("Igor", true, 41, h1)),
                new Group(people2, "Java2", new Person("Anna", false, 32, h2))
        };

        return groups;
    }


    public static Products[] getProducts() {

        String[] gm1 = {"SSD"};
        String[] gm2 = {"HDD"};


        Products[] productsA = {
                new Products(gm1, "Trancend ", "SSD що має хорошу швидкість та помірну ціну ", 450),
                new Products(gm1,"Sony ","SSD  бренду SONY ",650),

                new Products(gm2, "Samsung ", "Повільний HDD За не погану вартість ", 370),
                new Products(gm2, "Siemens ", "description... ", 320),
                new Products(gm2, "Canon ", "Шоть там пишим щоб заповнити поле ", 200)
        };
        return productsA;
    }




}







