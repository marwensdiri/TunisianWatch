package com.tunisianwatch.Entities;

public class Lieu {

    private int id;
    private String nom;

    public Lieu(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Lieu(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
    
    
}
