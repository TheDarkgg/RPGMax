package com.example.evoliris.totalrpg.models;

public class Heroes extends Entity {

    private final int maxPotion = 10;


    public Heroes(int pv, int force, String nom) {
        super(pv, force, nom);
    }

    public void findPotion(int nbPotion){
        super.nbPotion += nbPotion;
    }

    public boolean usePotion(){
        if(this.nbPotion == 0)
            return false;
        super.nbPotion++;
        return true;
    }


}
