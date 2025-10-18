package FactoryPattern.ConcretePizza;

import AbstractFactoryPattern.Interfaces.Pizza;

public class JalapenoPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing your Jalapeno Pizza....");
    }

    @Override
    public void cutPieces() {
        System.out.println("Cutting your Jalapeno Pizza in nice little pieces.");
    }

    @Override
    public void ready() {
        System.out.println("Enjoy your Jalapeno Pizza!");
    }
}
