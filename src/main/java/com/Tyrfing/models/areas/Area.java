package com.Tyrfing.models.areas;

import javax.persistence.*;

@Entity
public abstract class Area {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long prevId;

    @Column
    private long straightPathId;

    @Column
    private long sidePathId;

    @Column
    private long hiddenPathId;

    @Column
    private boolean isPathHidden;

    @Column
    private boolean healFlag;

    public Area(long pre, long str, long sid, long hid, boolean is, boolean hea){
        this.prevId = pre;
        this.straightPathId = str;
        this.sidePathId = sid;
        this.hiddenPathId = hid;
        this.isPathHidden = is;
        this.healFlag = hea;
    }

    public Area(){}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPrevId() {
        return this.prevId;
    }

    public void setPrevId(long prevId) {
        this.prevId = prevId;
    }

    public long getStraightPathId() {
        return this.straightPathId;
    }

    public void setStraightPathId(long straightPathId) {
        this.straightPathId = straightPathId;
    }

    public long getSidePathId() {
        return this.sidePathId;
    }

    public void setSidePathId(long sidePathId) {
        this.sidePathId = sidePathId;
    }

    public long getHiddenPathId() {
        return this.hiddenPathId;
    }

    public void setHiddenPathId(long hiddenPathId) {
        this.hiddenPathId = hiddenPathId;
    }

    public boolean isPathHidden() {
        return this.isPathHidden;
    }

    public void setPathHidden(boolean pathHidden) {
        this.isPathHidden = pathHidden;
    }
}
