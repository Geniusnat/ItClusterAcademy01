package org.view;

import org.model.Products;

public class ProductsView {

    public void listProducts(Products[] category) {
        for (Products products : category) {
            if (products == null) {
                continue;
            }
            System.out.println(products);
        }
    }
}