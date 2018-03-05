package com.pizza.machine;

public  class PepperonyPizzaMaker extends PizzaMaker {
    @Override
    protected void addIngredients() {
        System.out.println("Added peperony, cheese, tomatos");
    }

    @Override
    protected void bake() {
        System.out.println("baking for 10 minutes..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Pizza createPizza() {
        return new Pizza ("Pepperony");
    }
}
