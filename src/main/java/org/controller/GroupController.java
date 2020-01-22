package org.controller;

import org.model.Group;
import org.utils.Utils;
import org.view.GroupView;

public class GroupController implements ICommands {

    public void list() {
        Group[] groups = Utils.getGroups();
        GroupView groupView = new GroupView();
        groupView.listAllNames(groups);
    }

    public String[] getCommands() {
        String[] commands = {"listGroup"};
        return commands;
    }//TODO dorobit
    /*public void listProducts(){
        Products[] products = Utils.getProducts();
        ProductsView productsView = new ProductsView();
        productsView.listAllNames(products);
    }*/
}
