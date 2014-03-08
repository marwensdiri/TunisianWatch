package com.tunisianwatch.Entities;

public class Lieu {

    private int id;
    private String nom;

    public Lieu(String nom) {
        this.nom = nom;
    }

    public Lieu() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Override
    public String toString() {
        return nom;
    }
    

    
    
    
}
