package com.tunisianwatch.Entities;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Etablissement {

	private int id;
	private String nom;
	private String description;
	private Image image;
	private Lieu lieu;
        private Utilisateur responsable;
        private List<Domaine> listDomaine= new ArrayList<Domaine>();

    public Etablissement() {
    }

        
        
    public Etablissement(String nom, String description, Image image, Lieu lieu,Utilisateur responsable) {
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.lieu = lieu;
        this.responsable=responsable;
    }

    public Etablissement(int id, String nom, String description, Image image, Lieu lieu,Utilisateur responsable) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.lieu = lieu;
        this.responsable=responsable;
    }
    
    public void addDomaine(Domaine d){
        listDomaine.add(d);
    }
    
    public void removeDomaine(Domaine d){
        listDomaine.remove(d);
    }
    
    public void setListDomaine(List<Domaine> listDomaine){
        this.listDomaine=listDomaine;
    }
    
    public List<Domaine> getListDomaine(){
        return listDomaine;
    }

    @Override
    public String toString() {
        return  nom ;
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

    public Image getImage() {
        return image;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }

    public void setResponsable(Utilisateur responsable) {
        this.responsable = responsable;
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

    public void setImage(Image image) {
        this.image = image;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }        

}