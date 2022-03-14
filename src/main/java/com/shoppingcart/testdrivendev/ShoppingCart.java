package com.shoppingcart.testdrivendev;

import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
    }

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotalCount() {
        if (this.items == null)
            return 0;
        return this.items.stream().mapToInt(item -> {
            if(item != null){
                return item.getQuantity();
            }
            return 0;
        }).sum();
    }

    public double getTotalAmount() {
//        double totalAmount = 0.0;
//        for(Item item: items){
//            if(item != null)
//                totalAmount += item.getUnitPrice() * item.getQuantity();
//        }
        return this.items.stream().mapToDouble(item -> {
            if(item != null){
                return item.getQuantity() * item.getUnitPrice();
            }else{
                return 0.0;
            }
        }).sum();
    }
}
