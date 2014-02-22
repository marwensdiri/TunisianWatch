/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Entities;

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
    private String photo;
    private String login;
    private String mdp;
    private String mail;
    private char type;
    private int idEtablissement;

    public Utilisateur() {
        
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", photo=" + photo + ", login=" + login + ", mdp=" + mdp + ", mail=" + mail + ", type=" + type + ", idEtablissement=" + idEtablissement + '}';
    }

    public Utilisateur(int idEtablissement, String nom, String prenom, String photo, char sexe, String adress, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.idEtablissement = idEtablissement;
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

    public Utilisateur(int id, int idEtablissement, String nom, String prenom, String photo, String login, String mdp, String mail, char type, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
        this.login = login;
        this.mdp = mdp;
        this.mail = mail;
        this.type = type;
        this.idEtablissement = idEtablissement;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
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

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
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

}
