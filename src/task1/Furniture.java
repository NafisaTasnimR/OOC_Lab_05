package task1;

public class Furniture extends Product{
    public Furniture(String name, int quantity, Double price)
    {
        super(name,quantity,price);
    }

    public Double totalPrice()
    {
        return (getUnitPrice()+(getUnitPrice()*0.08));
    }
}
