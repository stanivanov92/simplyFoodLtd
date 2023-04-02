package main;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        verifyQuantity(quantity);
        verifyPrice(price);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price){
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

    public void verifyBuyQuantity(int quantity){
        if(this.quantity - quantity < 0 ){
            throw new RuntimeException("The quantity will become under: " + String.valueOf(this.quantity - quantity));
        }
    }
}
