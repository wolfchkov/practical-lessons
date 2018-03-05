package com.pizza.machine;

public class CarbonaraPizzaMaker extends PizzaMaker {
    @Override
    protected void addIngredients() {
        System.out.println("Added eggs, cheese");
    }

    @Override
    protected void bake() {
        System.out.println("baking for 18 minutes..");
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza ("Carbonara");
    }
}
