package com.Tyrfing.models.characters;

import com.Tyrfing.models.utility.Stats;

import javax.persistence.*;

@Entity
public abstract class Character {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToOne
    private Stats stats;

    @Column
    private Integer exp;

    public Character(String name) {
        this.name = name;
        this.stats = new Stats();
        this.exp = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return this.stats.getHealth();
    }

    public Integer getCurrentHealth() {
        return this.stats.getCurrentHealth();
    }

    public Integer getPower() {
        return this.stats.getPower();
    }

    public Integer getEndurance() {
        return this.stats.getEndurance();
    }

    public Integer getDanger() {
        return this.stats.getDanger();
    }

    public void setHealth(Integer health){
        this.stats.setHealth(health);
    }

    public void setCurrentHealth(Integer currentHealth){
        this.stats.setHealth(currentHealth);
    }

    public void setPower(Integer power){
        this.stats.setHealth(power);
    }

    public void setEndurance(Integer endurance){
        this.stats.setHealth(endurance);
    }

    public void setDanger(Integer danger){
        this.stats.setHealth(danger);
    }

    public void addExp(Integer mod){
        this.exp += mod;
    }

}
