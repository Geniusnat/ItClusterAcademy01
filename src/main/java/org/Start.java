package org;

import org.controller.GroupController;
import org.controller.PersonController;
import org.controller.ProductsController;
import org.view.GeneralView;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        new Start();
    }

    public Start() {

        String cmd;
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = true;

        PersonController personController = new PersonController();
        String[] personsCommands = personController.getCommands();

        ProductsController productsController = new ProductsController();
        String[] productsCommands = productsController.getCommands();

        GroupController groupController = new GroupController();
        String[] groupCommands = groupController.getCommands();

        GeneralView generalView = new GeneralView();

        String allCommands[] = {"exit", "?"};

        while(isEnd) {
            System.out.println("Enter a command:");
            cmd = scanner.nextLine();
            switch (cmd) {
                case "exit":
                    generalView.bye();
                    isEnd = false;
                    break;
                case "?":
                    generalView.allCommands(allCommands);
                    generalView.allCommands(personsCommands);
                    generalView.allCommands(groupCommands);
                    generalView.allCommands(productsCommands);
                    break;
                    // persons
                case "list":
                    personController.list();
                    break;
                case "listFemale":
                    personController.listByGender(false);
                    break;
                case "listMale":
                    personController.listByGender(true);
                    break;
                    // group
                case "listGroup":
                    groupController.list();
                    break;
                    //mygroup
                case "listProducts":
                    productsController.listProducts();
                    break;


            }
        }

    }

}
