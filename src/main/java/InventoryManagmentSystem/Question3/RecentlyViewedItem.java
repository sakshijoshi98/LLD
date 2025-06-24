package InventoryManagmentSystem.Question3;

import InventoryManagmentSystem.Question1.Item;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItem {
    LinkedList<Item> items;
    private final int maxSize = 10;

    public RecentlyViewedItem() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {

        items.remove(item);

        items.addFirst(item);

        if(items.size() > maxSize) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}
