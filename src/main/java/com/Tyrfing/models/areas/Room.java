package com.Tyrfing.models.areas;

import javax.persistence.Entity;

@Entity
public class Room extends Area {

    public Room(long pre, long str, long sid, long hid, boolean is) {
        super(pre, str, sid, hid, is, true);
    }

    public Room(){}

}
