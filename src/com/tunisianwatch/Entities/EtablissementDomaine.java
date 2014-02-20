package com.tunisianwatch.Entities;

public class EtablissementDomaine {

    private int idEtablissement;
    private int idDomaine;
    private int id;

    public EtablissementDomaine(int idEtablissement, int idDomaine, int id) {
        this.idEtablissement = idEtablissement;
        this.idDomaine = idDomaine;
        this.id = id;
    }

    public EtablissementDomaine(int idEtablissement, int idDomaine) {
        this.idEtablissement = idEtablissement;
        this.idDomaine = idDomaine;
    }

    @Override
    public String toString() {
        return "EtablissementDomaine{" + "idEtablissement=" + idEtablissement + ", idDomaine=" + idDomaine + ", id=" + id + '}';
    }
    
    

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public void setIdDomaine(int idDomaine) {
        this.idDomaine = idDomaine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public int getIdDomaine() {
        return idDomaine;
    }

    public int getId() {
        return id;
    }
    
    
    
}
