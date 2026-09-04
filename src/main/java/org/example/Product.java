package org.example;
import java.util.*;
public class Product implements Comparable<Product>{
    private final int id;
    private String name;
    private Double price;
    private String category;
    private int stocQuantity;

    public Product(int id, String name, double price, String category, int stocQuantity) {
        if(id<=0){
            throw new IllegalArgumentException("id must be greater than 0");
        }
        if(name==null){
            throw new IllegalArgumentException("name must not be null");
        }
        if(price<=0){
            throw new IllegalArgumentException("price must be greater than 0");
        }
        if(category==null){
            throw new IllegalArgumentException("category must not be null");
        }
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stocQuantity = stocQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return stocQuantity;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("name must not be null");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("price must be greater than 0");
        }
        this.price = price;
    }

    public void setCategory(String category) {
        if(category==null){
            throw new IllegalArgumentException("category must not be null");
        }
        this.category = category;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            throw new IllegalArgumentException("quantity must be greater than 0");
        }
        this.stocQuantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", category = '" + category + '\'' +
                ", quantity = " + stocQuantity +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
