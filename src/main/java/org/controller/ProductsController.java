package org.controller;

import org.model.Products;
import org.utils.Utils;
import org.view.ProductsView;

public class ProductsController implements ICommands {
    /**
     * list oll products
    */
    public void listProducts() {
        Products[] goods = Utils.getProducts();
        ProductsView productsView = new ProductsView();
        productsView.listProducts(goods);
    }

    public String[] getCommands() {
        String[] commands = {"listProducts"};
        return commands;
    }

}

