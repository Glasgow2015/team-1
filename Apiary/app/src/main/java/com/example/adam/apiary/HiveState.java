package com.example.adam.apiary;

import java.io.Serializable;

/**
 * Created by Adam on 07/11/2015.
 */
public enum HiveState implements Serializable {
    NOT_IN_USE, NOT_YET_OCCUPIED,OCCUPIED, ABANDONED, DEAD_ROBBING, DEAD_HONEY_BADGER, DEAD_MITES,
    DEAD_BEETLE, DEAD_OTHER_INSECT, DEAD_FIRE, DEAD_FLOOD, DEAD_UNKNOWN
}
