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
    private boolean etat;

    public Reclamation(int id, Lieu lieu, Date date, Date heure, String description, String titre, Utilisateur citoyen, Domaine domaine, boolean etat) {
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

    public Reclamation(Lieu lieu, Date date, Date heure, String description, String titre, Utilisateur citoyen, Domaine domaine, boolean etat) {
        this.lieu = lieu;
        this.date = date;
        this.heure = heure;
        this.description = description;
        this.titre = titre;
        this.citoyen = citoyen;
        this.etat = etat;
        this.domaine = domaine;
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

    public boolean getEtat() {
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

    public void setEtat(boolean etat) {
        this.etat = etat;
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
