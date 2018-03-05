package com.pizza.machine;

public class FourCheesesPizzaMaker extends PizzaMaker {
    @Override
    protected void addIngredients() {
        System.out.println("Added cheese1, cheese2, cheese2, cheese4");
    }

    @Override
    protected void bake() {
        System.out.println("baking for 15 minutes..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza ("FourCheeses");
    }
}
