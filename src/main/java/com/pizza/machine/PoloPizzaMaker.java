package com.pizza.machine;

public class PoloPizzaMaker extends PizzaMaker{


    @Override
    protected void addIngredients() {
        System.out.println("Added chicken, cheese, tomatos");
    }

    @Override
    protected void bake() {
        System.out.println("baking for 17 minutes..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza ("Polo");
    }
}
