package com.tunisianwatch.Entities;

public class Etablissement {

	private int id;
	private String nom;
	private String description;
	private String image;
	private Lieu lieu;

    public Etablissement(String nom, String description, String image, Lieu lieu) {
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.lieu = lieu;
    }

    public Etablissement(int id, String nom, String description, String image, Lieu lieu) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "Etablissement{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", image=" + image + ", Lieu=" + lieu + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Lieu getLieu() {
        return lieu;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }        

}