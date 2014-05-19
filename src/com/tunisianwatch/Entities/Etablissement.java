package com.tunisianwatch.Entities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Etablissement {

    private int id;
    private String nom;
    private String description;
    private File file;
    private String image;
    private Lieu lieu;
    private Utilisateur responsable;
    private List<Domaine> listDomaine = new ArrayList<Domaine>();

    public Etablissement() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void addDomaine(Domaine d) {
        listDomaine.add(d);
    }

    public void removeDomaine(Domaine d) {
        listDomaine.remove(d);
    }

    public void setListDomaine(List<Domaine> listDomaine) {
        this.listDomaine = listDomaine;
    }

    public List<Domaine> getListDomaine() {
        return listDomaine;
    }

    @Override
    public String toString() {
        return nom;
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

    public File getFile() {
        return file;
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

    public void setFile(File file) {
        this.file = file;
        this.image = file.getName();
    }

    public void moveFile() {
        File directory = new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\etablissement\\" + id);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        file.renameTo(new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\etablissement\\" + id + "\\" + file.getName()));
    }

    public String getPath() {
        return "C:\\wamp\\www\\TunisianWatch\\web\\uploads\\etablissement\\" + id + "\\" + image;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

}
