package com.pizza.machine;

public abstract class PizzaMaker {
    public Pizza cook() {
        takeBase();
        addIngredients();
        bake();
        cut();
        pack();

        return createPizza();

    }

    protected void takeBase() {
        System.out.println("Base is taken");
    }

    protected abstract void addIngredients();

    protected abstract void bake();

    protected void cut() {
        System.out.println("Pizza is cut");
    }

    protected void pack() {
        System.out.println("Pizza is packed");

    }

    protected abstract Pizza createPizza();

}
