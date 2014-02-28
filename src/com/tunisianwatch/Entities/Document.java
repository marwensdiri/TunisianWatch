package com.tunisianwatch.Entities;

import java.sql.Blob;

public class Document {

    private int id;
    private String nom;
    private int type;
    private String url;
    private Blob content;

    public Document() {

    }

    public Document(String nom, int type, String url, Blob content) {
        this.type = type;
        this.url = url;
        this.content = content;
        this.nom = nom;
    }

    public Document(int id, int type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.content = content;
        this.nom = nom;
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

    public Blob getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(Blob content) {
        this.content = content;
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
