package com.Tyrfing.models.characters;

import javax.persistence.*;

@Entity
public class Enemy extends Character {

    public Enemy(String name) {
        super(name);
    }

}
