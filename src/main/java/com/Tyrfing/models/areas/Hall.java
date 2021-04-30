package com.Tyrfing.models.areas;

import com.Tyrfing.models.utility.Encounter;

import javax.persistence.Entity;

@Entity
public class Hall extends Area {

    private Encounter encounter;

    public Hall(long pre, long str, long sid, long hid, boolean is, boolean hea, Encounter enc) {
        super(pre, str, sid, hid, is, hea);
        this.encounter = enc;
    }

    public Hall(){}

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Encounter getEncounter() {
        return this.encounter;
    }

}
