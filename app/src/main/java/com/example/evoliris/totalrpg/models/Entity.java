package com.example.evoliris.totalrpg.models;

public class Entity {
    protected String nom;
    protected int pv;
    protected int force;
    protected int nbPotion;

    public Entity(int pv, int force, String nom) {
        this.pv = pv;
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getNom() {
        return force;
    }

    public void setNom(int force) {
        this.force = force;
    }
}
