package IteratorPattern.Aggregate;

import IteratorPattern.Iterator.BreakfastIterator;

import java.util.Iterator;

public class BreakfastMenu {
    int pos;
    Menu[] menuItems;

    public BreakfastMenu(int size) {
        menuItems=new Menu[size];
        this.pos = 0;
    }

    void addItem(Menu item) {
        if(pos==menuItems.length) {
            return;
        }
        menuItems[pos] = item;
        pos++;
    }

    public Iterator createIterator() {
        return new BreakfastIterator(menuItems);
    }
}
