package InventoryManagmentSystem.Question1;

public class Item implements Comparable<Item>{
    String id;
    String name;
    double price;
    int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item other){
        if(this.price < other.price) return -1;
        else if(this.price > other.price) return 1;
        else return 0;
    }
}
