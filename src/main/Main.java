package main;

public class Main {

    public static void main(String[] args) {
        BusinessLogicUnit businessLogicUnit = new BusinessLogicUnit();

        while(true){
           businessLogicUnit.handleCommunication();
        }
    }


}
