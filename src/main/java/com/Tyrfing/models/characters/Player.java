package com.Tyrfing.models.characters;

import com.Tyrfing.models.utility.Inventory;
import javax.persistence.*;

@Entity
public class Player extends Character {

    @OneToOne
    private Inventory inventory;

    public Player(String name) {
        super(name);
        this.inventory = new Inventory();
    }

}