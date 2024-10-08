package task1;

import java.util.Comparator;
import java.util.List;

public class OrderManager {
    List<Product> productList;

    public OrderManager(List<Product> products){
        this.productList = products;
    }

    public void sortProducts()
    {
        productList.sort(Comparator.comparing(Product::totalPrice).thenComparing(Product::getName).thenComparing(Product::getStockQuantity));

    }

    public void showProducts()
    {
        for(Product product:productList){
            System.out.println("Product Name:" + product.getName()
                    + "Product Price:" + product.totalPrice()
                    + "Product Quantity:" + product.getStockQuantity());
        }
    }

}
