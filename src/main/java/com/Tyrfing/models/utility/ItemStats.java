package com.Tyrfing.models.utility;

import javax.persistence.*;

@Entity
public class ItemStats {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private Integer powerMod;

    @Column
    private Integer enduranceMod;

    @Column
    private Integer dangerMod;

    public ItemStats(Integer powerMod, Integer enduranceMod, Integer dangerMod) {
        this.powerMod = powerMod;
        this.enduranceMod = enduranceMod;
        this.dangerMod = dangerMod;
    }

    public ItemStats() {
    }

    public Integer getPowerMod() {
        return powerMod;
    }

    public void setPowerMod(Integer powerMod) {
        this.powerMod = powerMod;
    }

    public Integer getEnduranceMod() {
        return enduranceMod;
    }

    public void setEnduranceMod(Integer enduranceMod) {
        this.enduranceMod = enduranceMod;
    }

    public Integer getDangerMod() {
        return dangerMod;
    }

    public void setDangerMod(Integer dangerMod) {
        this.dangerMod = dangerMod;
    }

}