package com.tunisianwatch.Entities;

import java.util.*;

public class Reclamation {

    private int id;
    private Lieu lieu;
    private Date date;
    private Date heure;
    private String description;
    private String titre;
    private Utilisateur citoyen;
    private Domaine domaine;
    private int etat;
    private List<Evaluation> listEvaluation = new ArrayList<Evaluation>();

    public Reclamation(int id, Lieu lieu, Date date, Date heure, String description, String titre, Utilisateur citoyen, Domaine domaine, int etat) {
        this.id = id;
        this.lieu = lieu;
        this.date = date;
        this.heure = heure;
        this.description = description;
        this.titre = titre;
        this.citoyen = citoyen;
        this.etat = etat;
        this.domaine = domaine;
    }

    public Reclamation(Lieu lieu, Date date, Date heure, String description, String titre, Utilisateur citoyen, Domaine domaine, int etat) {
        this.lieu = lieu;
        this.date = date;
        this.heure = heure;
        this.description = description;
        this.titre = titre;
        this.citoyen = citoyen;
        this.etat = etat;
        this.domaine = domaine;
    }

    public void addEvaluation(Evaluation ev){
        listEvaluation.add(ev);
    }
    
    public void removeEvaluation(Evaluation ev){
        listEvaluation.remove(ev);
    }
    
    public Reclamation() {
    }

    public int getId() {
        return id;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public Date getDate() {
        return date;
    }

    public Date getHeure() {
        return heure;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre() {
        return titre;
    }

    public Utilisateur getCitoyen() {
        return citoyen;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public int getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCitoyen(Utilisateur citoyen) {
        this.citoyen = citoyen;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }


    public List<Evaluation> getListEvaluation() {
        return listEvaluation;
    }

    public void setListEvaluation(List<Evaluation> listEvaluation) {
        this.listEvaluation = listEvaluation;
    }
    
    
    @Override
    public String toString(){
        return titre;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reclamation other = (Reclamation) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
