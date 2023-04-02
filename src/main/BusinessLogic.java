package main;

public class BusinessLogic {
    private Menu menu;

    private Basket basket;
    private Order[] orders;
    private CommunicationHandler communicationHandler;

    private ClientState clientState;

    public BusinessLogic(){
        menu = new Menu();
        communicationHandler = new CommunicationHandler();
        clientState = ClientState.MAIN_MENU;
    }

    public void start(Basket basket, Order[] orders){
        communicationHandler.printMainMenuOptions();
        this.basket = basket;
        this.orders = orders;
    }

    public int makeChoice(){
        int choice = communicationHandler.getUserChoice();
        return handleUserChoice(choice);
    }

    public int handleUserChoice(int choice){
        switch (clientState){
            case MAIN_MENU:
                return handleMainMenuChoice(choice);
            case PRODUCT_MENU:
                return handleMenuOptionsChoice(choice);
            case ADD_PRODUCT:
                handleProductMenuChoice(choice);
            case BASKET:
                handleBasketChoice(choice);
            case ORDER:
                handleOrderChoice(choice);
            default:
                communicationHandler.printInvalidChoice();
                makeChoice();
                break;
        }
        return 0;
    }

    private int handleMainMenuChoice(int choice){
        switch (choice){
            case 1:
                communicationHandler.printMenuOptions(menu);
                clientState = ClientState.PRODUCT_MENU;
                return 0;
            case 2:
                communicationHandler.printBasket(basket);
                clientState = ClientState.BASKET;
                return 0;
            case 3:
                communicationHandler.printOrder(orders);
                clientState = ClientState.ORDER;
                return 0;
            case 4:
                communicationHandler.printQuitMessage();
                return 1;
            default:
                communicationHandler.printInvalidChoice();
                communicationHandler.printMainMenuOptions();
                return 0;
        }
    }

    private int handleMenuOptionsChoice(int choice){
        switch (choice){
            case 1:
                communicationHandler.printMenuForOrder(menu);
                clientState = ClientState.PRODUCT_MENU;
                return 0;
            case 2:
                communicationHandler.printMainMenuOptions();
                clientState = ClientState.MAIN_MENU;
                return 0;
            case 3:
                communicationHandler.printBasket(basket);
                return 0;
            default:
                communicationHandler.printInvalidChoice();
                communicationHandler.printMenuOptions(menu);
                return 0;
        }
    }

    private int handleProductMenuChoice(int choice){

        return 0;
    }

    private int handleBasketChoice(int choice){

        return 0;
    }

    private int handleOrderChoice(int choice){
        return 0;
    }
}
