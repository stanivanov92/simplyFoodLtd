package main;

import java.util.Scanner;

public class CommunicationHandler {

    private Scanner scanner;
    public CommunicationHandler(){
        scanner = new Scanner(System.in);
    }
    public void printMainMenu(){
        System.out.println("Hello, welcome to SimplyFoodLimited!");
        System.out.printf("1. View main menu\n2. View your basket\n3. View your past orders\n4. Leave the shop");
        System.out.println("Please enter an option from the ones showed above\nOption: ");
    }

    public int getUserChoice(){
        String userChoice = scanner.nextLine();
        int choice = Integer.valueOf(userChoice);
        return choice;
    }

    public void printAskUserForQuantity(){
        System.out.println("How much would you like to order from this item?:\nQuantity: ");
    }

    public void printMenu(Menu menu){
        int index = 1;
        for(Product product : menu.getProducts()){
            System.out.printf("%d.  %s, price: %.2f, quantity: %d\n",index,product.getName(), product.getPrice(), product.getQuantity());
            index++;
        }
        System.out.printf("\n1. Purchase products from our menu\n2. Go back to main menu\nPlease select from the options above.\n\nOption: ");
    }

    public void printProductsMenu(Menu menu){
        int index = 1;
        for(Product product : menu.getProducts()){
            System.out.printf("%d.  %s, price: %.2f, quantity: %d\n",index,product.getName(), product.getPrice(), product.getQuantity());
            index++;
        }
        System.out.printf("\n1. Add product to basket\n2. Go back to main menu\n" +
                "Please select from the options above.\n\nOption: ");
    }

    public void askUserForProductName(){
        System.out.println("Which product would you like to add\n");
        System.out.println("\nIndex: ");
    }

}
