package com.Tyrfing.models.characters;

import com.Tyrfing.models.utility.Inventory;

public class Player extends Character {

    private Inventory inventory;

    public Player(String name) {
        super(name);
        this.inventory = new Inventory();
    }

}