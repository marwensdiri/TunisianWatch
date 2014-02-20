package com.tunisianwatch.Entities;

public class Etablissement {

	private int id;
	private String nom;
	private String description;
	private String image;
	private int idLieu;

    public Etablissement(String nom, String description, String image, int idLieu) {
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.idLieu = idLieu;
    }

    public Etablissement(int id, String nom, String description, String image, int idLieu) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.idLieu = idLieu;
    }

    @Override
    public String toString() {
        return "Etablissement{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", image=" + image + ", idLieu=" + idLieu + '}';
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

    public int getIdLieu() {
        return idLieu;
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

    public void setIdLieu(int idLieu) {
        this.idLieu = idLieu;
    }        

}