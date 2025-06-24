package InventoryManagmentSystem.Question2;

import InventoryManagmentSystem.Question1.Item;

import java.util.Collection;
import java.util.HashMap;

public class Inventory<T extends Item>{

    HashMap<String,T> inventory ;

    public Inventory(){
        inventory = new HashMap<>();
    }

    public void addItem(T item){
        inventory.put(item.getId(), item);
    }

    public void removeItem(T item){
        inventory.remove(item.getId());
    }

    public T getItem(String id){
        return inventory.get(id);
    }

    public Collection<T> getAllItem(){
        return inventory.values();
    }
}
