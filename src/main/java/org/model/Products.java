package org.model;

import java.util.Arrays;
import java.util.Objects;

public class Products {
    private String[] category;
    private String name;
    private String description;
    private int price;

    public Products(){
    }

    public Products(String[] category, String name, String description, int price){
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString(){
        return "Products { "+
                "category" +  Arrays.toString(category) +
                "name "+ name +
                "description " + description +
                "price "+ price +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return price == products.price &&
                Objects.equals(category, products.category) &&
                Objects.equals(name, products.name) &&
                Objects.equals(description, products.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, description, price);
    }
}
