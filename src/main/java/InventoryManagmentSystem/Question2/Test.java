package InventoryManagmentSystem.Question2;

import InventoryManagmentSystem.Question1.Clothing;
import InventoryManagmentSystem.Question1.Electronics;

public class Test {
    public static void main(String[] args) {
        Inventory<Clothing> inventory = new Inventory();
        // Adding items to the inventory
        inventory.addItem(new Clothing("C001", "T-Shirt", 19.99, 100, "M"));
        inventory.addItem(new Clothing("C002", "Jeans", 39.99, 50, "L"));
        inventory.addItem(new Clothing("C003", "Jacket", 59.99, 30, "XL"));

        inventory.removeItem(inventory.getItem("C001"));
//       inventory.addItem(new Electronics("E001", "Smartphone", 299.99, 20, 24));

        inventory.getAllItem().forEach(item -> System.out.println(item.getName()));
    }
}
