package com.tunisianwatch.Entities;

public class Domaine {

	private int id;
	private String nom;

    public Domaine() {
    }

    public Domaine(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Domaine(String nom) {
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

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Domaine other = (Domaine) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

        
        
}