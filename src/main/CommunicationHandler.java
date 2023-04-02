package main;

import java.util.Scanner;
public class CommunicationHandler {
    private final Scanner scanner;

    public CommunicationHandler(){
        scanner = new Scanner(System.in);
    }

    public void printMainMenuOptions(){
        System.out.printf("Welcome to the SimplyFoodLimited online store\n" +
                "1. View Menu\n2. View your basket\n3. View your current orders\n4. Leave shop\n" +
                "\nPlease select an option from the ones above\nOption: ");
    }

    public void printMenuOptions(Menu menu){
        int index = 1;
        for(Product product : menu.getProducts()){
            if(product.getQuantity() > 0){
                System.out.printf("%d. %s, price: %.2f,  quantity: %d\n",
                        index,product.getName(),product.getPrice(),product.getQuantity());
               index++;
            }
        }
        System.out.println("\nPlease select one of the following options\n");
        System.out.println("1. Add items to your basket\n2. Go back to main menu\n3. View your basket");
    }

    public void printMenuForOrder(Menu menu){
        int index = 1;
        for(Product product : menu.getProducts()){
            if(product.getQuantity() > 0){
                System.out.printf("%d. %s, price: %.2f,  quantity: %d\n",
                        index,product.getName(),product.getPrice(),product.getQuantity());
                index++;
            }
        }
        System.out.println("Please enter the product number that you want to add your basket\nProduct number: ");
    }

    public void printBasket(Basket basket){
        //TODO: To implement
    }

    public void printOrder(Order[] orders){
        //TODO: To implement
    }

    public int getUserChoice(){
        String clientChoice = scanner.nextLine();
        return Integer.valueOf(clientChoice);
    }

    public void printQuitMessage(){
        System.out.println("Thank you for visiting SimplyFoodLimited");
    }

    public void printInvalidChoice(){
        System.out.println("Your choice was invalid");
    }
}
