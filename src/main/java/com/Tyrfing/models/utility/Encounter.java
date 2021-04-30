package com.Tyrfing.models.utility;

import com.Tyrfing.models.characters.Enemy;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Encounter {

    @Id
    @GeneratedValue
    private long id;

    @OneToMany
    private ArrayList<Enemy> enemies;

    public Encounter(ArrayList<Enemy> ens){
        this.enemies = ens;
    }

    public Encounter(){}

    public ArrayList<Enemy> getEnemies() {
        return this.enemies;
    }

    public Enemy getEnemy(Integer index) {
        return this.enemies.get(index);
    }

    public void setEnemies(ArrayList<Enemy> e) {
        this.enemies = e;
    }

}
