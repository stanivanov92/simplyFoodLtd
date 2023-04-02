package main;

public class BusinessLogicUnit {

    private SystemState systemState;
    private Menu menu;
    private CommunicationHandler communicationHandler;
    public BusinessLogicUnit(){
        menu = new Menu();
        communicationHandler = new CommunicationHandler();
        systemState = SystemState.MAIN_MENU;
    }

    public void handleCommunication() {
        if(systemState == SystemState.MAIN_MENU){
            communicationHandler.printMainMenu();
            int choice = communicationHandler.getUserChoice();
            switch (choice){
                case 1:
                    systemState = SystemState.PRODUCT_MENU;
                    break;
                case 2:
                    systemState = SystemState.BASKET;
                    break;
                case 3:
                    systemState = SystemState.ORDERS;
                case 4:
                    System.exit(1);
            }
        }
        else if (systemState == SystemState.PRODUCT_MENU){
            communicationHandler.printMenu(menu);
            int choice = communicationHandler.getUserChoice();
            if(choice == 1){
                communicationHandler.askUserForProductName();
                int index = communicationHandler.getUserChoice();
                communicationHandler.printAskUserForQuantity();
                int quantity = communicationHandler.getUserChoice();
                menu.getProductByIndex(index - 1).buy(quantity);
            }
            else if(choice == 2){
                systemState = SystemState.MAIN_MENU;
            }
        }
        else if (systemState == SystemState.BASKET){
            //Print the basket
            int choice = communicationHandler.getUserChoice();
        }
        else if (systemState == SystemState.ORDERS){
            //Print the user orders
            int choice = communicationHandler.getUserChoice();
        }
    }

}
