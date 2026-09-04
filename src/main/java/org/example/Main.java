package org.example;

import java.util.Scanner;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner in=new Scanner(System.in);
    static void main() {
        Locale.setDefault(Locale.US);
Store store=new Store();
int choice;
do{
    System.out.println("1: Add product");
    System.out.println("2: Remove product");
    System.out.println("3: Display all products");
    System.out.println("4: Search product By id");
    System.out.println("5: Show All Categories of product");
    System.out.println("6: Display products  Ordered by price");
    System.out.println("7: creat order");
    System.out.println("8: add item to order");
    System.out.println("9: remove item from order");
    System.out.println("10: display orders");
    System.out.println("11: Add order to shipping list");
    System.out.println("12: Shippint next order");
    System.out.println("13: cancel order");
    System.out.println("14: Search order by id");
    System.out.println("15: add review to product");
    System.out.println("16: Show all reviews to all products");
    System.out.println("17: Remove Out-of-Stock Products");
    System.out.println("18: Display Orders Ordered by Total");
    System.out.println("19: Exit");
    System.out.println("enter choice");
    choice=in.nextInt();
    in.nextLine();
    switch(choice){
        case 1:
            store.addProduct();
            break;
        case 2:
            store.removeProduct();
            break;
        case 3:
            store.displayProducts();
            break;
        case 4:
            store.searchProductById();
            break;
        case 5:
            store.showAllCategories();
            break;
        case 6:
            store.displayProductsByPrice();
            break;
        case 7:
            store.createOrder();
            break;
        case 8:
            store.addItemToOrder();
            break;
        case 9:
            store.removeItemFromOrder();
            break;
        case 10:
            store.displayOrders();
            break;
        case 11:
            store.addOrderToShipping();
            break;
        case 12:
            store.ShipNextOrder();
            break;
        case 13:
            store.canselOrders();
            break;
        case 14:
            store.searchOrders();
            break;
        case 15:
            store.addReviewToProduct();
            break;
        case 16:
            store.showReviews();
            break;
        case 17:
            store.removeOfStock();
            break;
        case 18:
            store.displayOrderByOrderd();
            break;
        case 19:
            System.out.println("exit");
            break;
        default:
            System.out.println("Invalid choice");
            break;

    }
}while(choice!=19);
    }
}
