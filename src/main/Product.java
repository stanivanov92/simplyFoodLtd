package main;

public class Product {
    private String name;
    private float price;
    private int quantity;

    public Product(String name, float price, int quantity){
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(float price){
        verifyPrice(price);
        this.price = price;
    }

    public void setQuantity(int quantity){
        verifyQuantity(quantity);
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void buy(int quantity){
        verifyBuyQuantity(quantity);
        this.quantity -= quantity;
    }

    private void verifyPrice(double price){
        if(price < 0){
            throw new IllegalArgumentException("Price can not be a negative number");
        }
    }

    private void verifyQuantity(int quantity){
        if(quantity < 0){
           throw new IllegalArgumentException("Quantity can't be a negative number");
        }
    }

    private void verifyBuyQuantity(int quantity){
        if(this.quantity < quantity ){
            throw new IllegalArgumentException("The quantity will become under: " + String.valueOf(this.quantity - quantity));
        }
    }
}
