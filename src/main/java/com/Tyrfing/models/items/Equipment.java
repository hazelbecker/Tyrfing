package com.Tyrfing.models.items;

import com.Tyrfing.models.utility.ItemStats;

import javax.persistence.*;

@Entity
public class Equipment implements Item {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private ItemStats itemStats;

    @Column
    private EquipmentType equipmentType;

    public Equipment(ItemStats itemStats, EquipmentType equipmentType) {
        this.itemStats = itemStats;
        this.equipmentType = equipmentType;
    }

    public Equipment(){}

    public Integer getItemPower() {
        return itemStats.getPowerMod();
    }

    public Integer getItemEndurance() {
        return itemStats.getEnduranceMod();
    }

    public Integer getItemDanger() {
        return itemStats.getDangerMod();
    }

    public void setItemStats(ItemStats itemStats) {
        this.itemStats = itemStats;
    }

    public String getEquipmentType(){
        return equipmentType.toString();
    }

    public void setEquipmentType(EquipmentType equipmentType){
        this.equipmentType = equipmentType;
    }

}