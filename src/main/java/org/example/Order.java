package org.example;
import java.util.*;
public class Order {
    private final int orderId;
    private String customerName;
    List<CartItem> items;
    private double total;
    private OrderStatus orderStatus;
    public Order(int orderId,String customerName){
        if(orderId<=0){
            throw new IllegalArgumentException("Order ID must be greater than 0");
        }
        if(customerName==null){
            throw new IllegalArgumentException("Customer Name cannot be null");
        }
        this.orderId=orderId;
        this.customerName=customerName;
        this.orderStatus=OrderStatus.PENDING;
        this.items=new LinkedList<>();
        this.total=0.0;
    }
    public void addItem(CartItem item){
        if(item==null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
        total+=item.subTotal();
    }

    public void removeItem(CartItem item){
        if(item==null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.remove(item);
        total-=item.subTotal();
    }
    public double calculateTotal(){
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public double getTotal() {
        return total;
    }
    public void updateStatus(OrderStatus orderStatus){
        this.orderStatus=orderStatus;
    }
    public void displayOrder(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Order Status: "+orderStatus);
        System.out.println("Total Price: "+total);
    }
}
