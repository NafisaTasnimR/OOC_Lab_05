package test;

import org.junit.Test;
import task1.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProduct {

    @Test
    public void checkETotalPrice()
    {
        Double expectedValue = 11.5345;
        Product tv = new Electronics("Television",4,10.03);
        assertEquals(expectedValue,tv.totalPrice());
    }

    @Test
    public void checkCTotalPrice()
    {
        Double expectedValue = 11.033;
        Product sharee = new Clothing("Katan",4,10.03);
        assertEquals(expectedValue,sharee.totalPrice());
    }

    @Test
    public void checkFTotalPrice()
    {
        Double expectedValue = 10.8324;
        Product Chair = new Furniture("Rocking Chair",4,10.03);
        assertEquals(expectedValue,Chair.totalPrice());
    }

    @Test
    public void checkSortProduct1()
    {
        Double expectedValue = 108.0;
        List<Product> products = new ArrayList<>();
        Product Chair = new Furniture("Rocking Chair",4,100.0);
        Product tv = new Electronics("Television",4,200.0);
        Product sharee = new Clothing("Katan",4,300.0);
        products.add(Chair);
        products.add(tv);
        products.add(sharee);
        OrderManager orderManager = new OrderManager(products);
        orderManager.sortProducts();
        assertEquals(expectedValue,products.get(0).totalPrice());
    }

    @Test
    public void checkSortProduct2()
    {
        String expectedName = "Katan";
        List<Product> products = new ArrayList<>();
        Product Chair = new Furniture("Rocking Chair",4,0.0);
        Product tv = new Electronics("Television",4,0.0);
        Product sharee = new Clothing("Katan",4,0.0);
        products.add(Chair);
        products.add(tv);
        products.add(sharee);
        OrderManager orderManager = new OrderManager(products);
        orderManager.sortProducts();
        assertEquals(expectedName,products.get(0).getName());
    }

    @Test
    public void checkSortProduct3()
    {
        int expectedQuantity = 3;
        List<Product> products = new ArrayList<>();
        Product Chair = new Furniture("R",10,0.0);
        Product tv = new Electronics("R",6,0.0);
        Product sharee = new Clothing("R",3,0.0);
        products.add(Chair);
        products.add(tv);
        products.add(sharee);
        OrderManager orderManager = new OrderManager(products);
        orderManager.sortProducts();
        assertEquals(expectedQuantity,products.get(0).getStockQuantity());
    }
}
