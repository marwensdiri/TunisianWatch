/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Entities;

import java.io.File;
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
    private File file;
    private String login;
    private String mdp;
    private String mail;
    private char type;
    private Etablissement etablissement;
    private String roles;

    public Utilisateur() {
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
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

    public String getPhoto() {
        return photo;
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

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setFile(File file) {
        this.file = file;
        this.photo = file.getName();
    }

    public File getFile() {
        return file;
    }

    public void moveFile() {
        File directory = new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\utilisateur\\" + login);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        file.renameTo(new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\utilisateur\\" + login + "\\" + file.getName()));
    }

    public String getPath() {
        return "C:\\wamp\\www\\TunisianWatch\\web\\uploads\\utilisateur\\" + login + "\\" + photo;
    }
}
