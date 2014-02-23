package com.tunisianwatch.Entities;

public class Evaluation {

	private int idCitoyen;
	private boolean note;
	private int idReclamation;

    public Evaluation(int idCitoyen, int idReclamation,boolean note) {
        this.idCitoyen = idCitoyen;
        this.note = note;
        this.idReclamation = idReclamation;
    }

    public int getIdCitoyen() {
        return idCitoyen;
    }

    public boolean getNote() {
        return note;
    }

    public int getIdReclamation() {
        return idReclamation;
    }

    public void setIdCitoyen(int idCitoyen) {
        this.idCitoyen = idCitoyen;
    }

    public void setNote(boolean note) {
        this.note = note;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }
        
        

}