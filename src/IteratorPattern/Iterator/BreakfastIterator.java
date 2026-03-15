package IteratorPattern.Iterator;

import IteratorPattern.Aggregate.BreakfastMenu;
import IteratorPattern.Aggregate.Menu;

import java.util.Arrays;
import java.util.Iterator;

public class BreakfastIterator implements Iterator {

    public BreakfastIterator(Menu[] menu) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
