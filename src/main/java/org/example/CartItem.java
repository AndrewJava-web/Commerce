package org.example;

public class CartItem {
    private Product product;
    private int quantity;
    public CartItem(Product product, int quantity) {
        if(quantity<=0){
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public double subTotal() {
        return product.getPrice()*quantity;
    }
}
