/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mekni Aymen
 */
package com.tunisianwatch.Entities;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Marwen
 */
public class Utilisateur {

    private int id;
    private String nom;
    private String prenom;
    private char sexe;
    private String adress;
    private Date dateNaissance;
    /**
     *
     * @author MekniAymen
     */
//////////////////////////////////////////
    private Image photo;
//////////////////////////////////////////
    private String login;
    private String mdp;
    private String mail;
    private char type;
    private Etablissement etablissement;

    public Utilisateur() {
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    public Utilisateur(Etablissement etablissement, String nom, String prenom, Image photo, char sexe, String adress, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.etablissement = etablissement;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.type = type;
        this.adress = adress;
        this.sexe = sexe;
    }

    public Utilisateur(int id, Etablissement etablissement, String nom, String prenom, Image photo, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.type = type;
        this.etablissement = etablissement;
    }

    public Utilisateur(int id, String nom, String prenom, Image photo, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.type = type;
    }

    public Utilisateur(String nom, String prenom, Image photo, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.type = type;
    }

    public Utilisateur(Date d) {

        this.dateNaissance = d;

        //System.out.println("nnnjhjgghghjghjgjghjgjhgh"+d);
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public char getSexe() {
        return sexe;
    }

    public String getAdress() {
        return adress;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        Date dateCourante = new Date();
        int age;
        age = dateCourante.getYear() - this.getDateNaissance().getYear();
        if (getDateNaissance().after(dateCourante)) {
            age = age - 1;
        }
        return age;
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
        final Utilisateur other = (Utilisateur) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
