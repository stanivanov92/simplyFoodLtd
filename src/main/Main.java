package main;

public class Main {

    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogic();
        Client client = new Client(businessLogic);
    }
}
