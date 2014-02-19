package com.tunisianwatch.Entities;

import java.util.*;

public class Reclamation {

	private int id;
        private int idLeu;
        private Date date;
        private Date heure;
        private String description;
	private String titre;
	private int idCitoyen;
        private int idDomaine;
	private boolean etat;

    public Reclamation(int id, int idLeu, Date date, Date heure, String description, String titre, int idCitoyen, int idDomaine, boolean etat) {
        this.id = id;
        this.idLeu = idLeu;
        this.date = date;
        this.heure = heure;
        this.description = description;
        this.titre = titre;
        this.idCitoyen = idCitoyen;
        this.idDomaine = idDomaine;
        this.etat = etat;
    }

    public Reclamation(int idLeu, Date date, Date heure, String description, String titre, int idCitoyen, int idDomaine, boolean etat) {
        this.idLeu = idLeu;
        this.date = date;
        this.heure = heure;
        this.description = description;
        this.titre = titre;
        this.idCitoyen = idCitoyen;
        this.idDomaine = idDomaine;
        this.etat = etat;
    }
    

    public int getId() {
        return id;
    }

    public int getIdLeu() {
        return idLeu;
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

    public int getIdCitoyen() {
        return idCitoyen;
    }

    public int getIdDomaine() {
        return idDomaine;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdLeu(int idLeu) {
        this.idLeu = idLeu;
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

    public void setIdCitoyen(int idCitoyen) {
        this.idCitoyen = idCitoyen;
    }

    public void setIdDomaine(int idDomaine) {
        this.idDomaine = idDomaine;
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