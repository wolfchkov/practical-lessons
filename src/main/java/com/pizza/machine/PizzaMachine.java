package com.pizza.machine;

public class PizzaMachine {

    private final PizzaMakerFactory pizzaMakerFactory;

    public PizzaMachine(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public Pizza order (Button button){
        PizzaMaker pizzaMaker = pizzaMakerFactory.getPizzaMaker(button);
        return pizzaMaker.cook();
    }

    public static void main(String[] args) {

        Pizza pizza = new PizzaMachine(new UkrainianPizzaMakerFactory()).order(Button.ONE);
        pizza.eat();
    }

}
