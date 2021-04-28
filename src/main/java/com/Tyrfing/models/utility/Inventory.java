package com.Tyrfing.models.utility;

import com.Tyrfing.models.items.Item;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public Item getItem(Integer index) {
        return this.items.get(index);
    }

    public void removeItem(Integer index) {
        this.items.remove(index);
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

}