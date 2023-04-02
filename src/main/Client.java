package main;

public class Client {
    private Basket basket;
    private Order[] orders;

    private boolean sessionEnd = false;

    private final BusinessLogic businessLogic;

    public Client(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
        basket = new Basket();
        orders = new Order[10];
        businessLogic.start(this.basket, this.orders);
        while (!sessionEnd){
            sessionEnd = businessLogic.makeChoice() == 1 ? true : false;
        }
    }
}
