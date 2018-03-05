package com.pizza.machine;

public class Pizza {
    private final String name;
    private boolean eaten = false;

    public Pizza (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void eat() {
        if (eaten){
            return;
        }
        eaten = true;
        System.out.printf("pizzza %s is oomm", name );
    }

}
