package com.Tyrfing.models.utility;

import javax.persistence.*;

@Entity
public class Stats {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private Integer health;

    @Column
    private Integer currentHealth;

    @Column
    private Integer power;

    @Column
    private Integer endurance;

    @Column
    private Integer danger;

    public Stats(Integer health, Integer currentHealth, Integer power, Integer endurance, Integer danger) {
        this.health = health;
        this.currentHealth = currentHealth;
        this.power = power;
        this.endurance = endurance;
        this.danger = danger;
    }

    public Stats(){
        this.health = 500;
        this.currentHealth = 500;
        this.power = 50;
        this.endurance = 50;
        this.danger = 5;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(Integer currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getEndurance() {
        return this.endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public Integer getDanger() {
        return this.danger;
    }

    public void setDanger(Integer danger) {
        this.danger = danger;
    }

    public void changeHealth(Integer mod) {
        this.health += mod;
    }

    public void changeCurrentHealth(Integer mod) {
        this.currentHealth += mod;
    }

    public void changePower(Integer mod) {
        this.power += mod;
    }

    public void changeEndurance(Integer mod) {
        this.endurance += mod;
    }

    public void changeDanger(Integer mod) {
        this.danger += mod;
    }

}
