package org.example;

public class Review {
    private final int  productId;
    private String customerName;
    private String comment;
    public  Review(int productId, String customerName, String comment) {
        if(productId <= 0){
            throw new IllegalArgumentException("Order ID must be greater than zero");
        }
        if(customerName == null){
            throw new IllegalArgumentException("Customer Name cannot be null");
        }
        if(comment == null){
            throw new IllegalArgumentException("Comment cannot be null");
        }
        this.productId = productId;
        this.customerName = customerName;
        this.comment = comment;
    }

    public int getOrderId() {
        return productId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "orderId = " + productId +
                ", customerName = ' " + customerName + '\'' +
                ", comment = '" + comment + '\'' +
                '}';
    }
}
