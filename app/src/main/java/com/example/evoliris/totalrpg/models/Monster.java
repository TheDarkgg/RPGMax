package com.example.evoliris.totalrpg.models;

import java.util.concurrent.ThreadLocalRandom;

public class Monster extends Entity {
    public static final int min = 0;
    public static final int max = 2;

    public String urlImg;

    public Monster(int pv, int force, String nom) {
        super(pv, force, nom);
    }

    public void initializeNbPotion(){
        super.nbPotion = ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public boolean isDead(){
        if(this.pv == 0)
            return true;
        return false;
    }

    public int dropPotion(){
        this.nbPotion = 0;
        return this.nbPotion;
    }


}
