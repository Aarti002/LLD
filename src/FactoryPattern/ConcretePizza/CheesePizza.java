package FactoryPattern.ConcretePizza;

import AbstractFactoryPattern.Interfaces.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing your Cheese Pizza....");
    }

    @Override
    public void cutPieces() {
        System.out.println("Cutting your Cheese Pizza in nice little pieces.");
    }

    @Override
    public void ready() {
        System.out.println("Enjoy your Cheese Pizza!");
    }
}
