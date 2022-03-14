package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShoppingCartTest {

    @Test
    public void testEmptyCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Assertions.assertEquals(0, shoppingCart.getTotalCount(), "Shopping cart should be empty");
    }

    @Test
    public void testOneItem(){
        Item[] itemArray = new Item[100];
        itemArray[0] = new Item(10, 133.02);
        ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(itemArray));
        Assertions.assertEquals(10, shoppingCart.getTotalCount(), "Shopping cart should have 1 item, of quantity 10");
        Assertions.assertEquals(1330.2, shoppingCart.getTotalAmount(), "shopping cart should have total amount as 1330.2");
    }

    @Test
    public void testTwoItems(){
        Item[] itemArray = new Item[100];
        itemArray[0] = new Item(10, 133.02);
        itemArray[1] = new Item(20, 174);
        ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(itemArray));
        Assertions.assertEquals(30, shoppingCart.getTotalCount(), "shopping cart should have 2 items of quantity 30");
        Assertions.assertEquals(4810.2, shoppingCart.getTotalAmount(), "shopping cart should have total amount as 4810.2");
    }

}
