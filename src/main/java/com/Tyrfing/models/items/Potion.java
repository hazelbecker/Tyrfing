package com.Tyrfing.models.items;

public class Potion implements Item {

    private long id;
    private Integer currentHealthMod;
    private Integer dangerMod;

    public Potion(Integer currentHealthMod, Integer dangerMod){
        this.currentHealthMod = currentHealthMod;
        this.dangerMod = dangerMod;
    }

    public Integer getCurrentHealthMod() {
        return this.currentHealthMod;
    }

    public void setCurrentHealthMod(Integer currentHealthMod) {
        this.currentHealthMod = currentHealthMod;
    }

    public Integer getDangerMod() {
        return this.dangerMod;
    }

    public void setDangerMod(Integer dangerMod) {
        this.dangerMod = dangerMod;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

}