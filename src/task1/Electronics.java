package task1;

public class Electronics extends Product{
    Electronics(String name,int quantity,Double price){
        super(name,quantity,price);
    }

    public Double totalPrice()
    {
        return (getUnitPrice()+(getUnitPrice()*0.15));
    }
}
