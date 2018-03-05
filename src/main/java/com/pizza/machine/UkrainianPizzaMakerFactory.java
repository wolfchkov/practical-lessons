package com.pizza.machine;

public class UkrainianPizzaMakerFactory implements PizzaMakerFactory{

    @Override
    public PizzaMaker getPizzaMaker(Button button) {
        PizzaMaker pizzaMaker = null;
        switch (button){
            case ONE:
                pizzaMaker = new PoloPizzaMaker();
                break;
            case TWO:
                pizzaMaker = new FourCheesesPizzaMaker();
                break;
            case THREE:
                pizzaMaker = new CarbonaraPizzaMaker();
                break;
            case FOUR:
                pizzaMaker = new PepperonyPizzaMaker();
                break;
        }
        return pizzaMaker;
    }
}
