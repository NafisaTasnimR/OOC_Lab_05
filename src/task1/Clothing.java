package task1;

public class Clothing extends Product{
    Clothing(String name,int quantity,Double price)
    {
        super(name,quantity,price);
    }

    public Double totalPrice()
    {
        return (getUnitPrice()+(getUnitPrice()*0.10));
    }

}
