package com.tunisianwatch.Entities;

import java.awt.Image;
import java.io.FileInputStream;

public class Document {

    private int id;
    private String nom;
    private int type;
    private String url;
    private Image image;
    private int idReclamation;

    public Document() {

    }

    public Document(String nom, int type, String url, Image image,int idReclamation) {
        this.type = type;
        this.url = url;
        this.image = image;
        this.nom = nom;
        this.idReclamation=idReclamation;
    }

    public Document(int id, int type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.image = image;
        this.nom = nom;
        this.idReclamation=idReclamation;
    }
    

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    
    
    public String getUrl() {
        return url;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Image getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
