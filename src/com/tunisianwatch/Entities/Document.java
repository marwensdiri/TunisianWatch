package com.tunisianwatch.Entities;

import java.io.File;

public class Document {

    private int id;
    private String nom;
    private int type;
    private String url;
    private File image;
    private int idReclamation;

    public Document() {

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

    public File getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(File image) {
        this.image = image;
        this.url = image.getName();
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
    
    
     public void moveFile() {
        File directory = new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\reclamations\\" + idReclamation);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        image.renameTo(new File("C:\\wamp\\www\\TunisianWatch\\web\\uploads\\reclamations\\" + idReclamation + "\\" + image.getName()));
    }

    public String getPath() {
        return "C:\\wamp\\www\\TunisianWatch\\web\\uploads\\reclamations\\" + idReclamation + "\\" + url;
    }

}
