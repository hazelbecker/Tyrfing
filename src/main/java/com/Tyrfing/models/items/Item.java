package com.Tyrfing.models.items;

import javax.persistence.*;

@Entity
public interface Item {

    @Id
    @GeneratedValue
    long id = 0;

}