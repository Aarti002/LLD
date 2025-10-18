package FactoryPattern.ConcretePizza;

import AbstractFactoryPattern.Interfaces.Pizza;

public class MacNCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing your Mac and Cheese Pizza....");
    }

    @Override
    public void cutPieces() {
        System.out.println("Cutting your Mac and Cheese Pizza in nice little pieces.");
    }

    @Override
    public void ready() {
        System.out.println("Enjoy your Mac and Cheese Pizza!");
    }
}
