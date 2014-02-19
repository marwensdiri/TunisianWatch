package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Reclamation;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReclamationDao {

	/**
	 * 
	 * @param R
	 */
	public void insertReclamation(Reclamation r) {
		String requete = "insert into reclamation (idlieu,date,heure,description,titre,idcitoyen,iddomaine,etat) values (?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
                
                ps.setInt(1, r.getIdLieu());
                ps.setDate(2, new java.sql.Date(r.getDate().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Date afin de l'inserer dans la base de donnée
                ps.setTime(3, new java.sql.Time(r.getHeure().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Time afin de l'inserer dans la base de donnée
                ps.setString(4, r.getDescription());
                ps.setString(5, r.getTitre());
                ps.setInt(6, r.getIdCitoyen());
                ps.setInt(7, r.getIdDomaine());
                ps.setBoolean(8, r.getEtat());
                
                
                ps.executeUpdate();
                
                //<tmp>
                System.out.println("Ajout effectuée avec succès");
                //</tmp>        
            } catch (SQLException ex) {
                //<tmp>
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
                //</tmp>
            }
	}

	/**
	 * 
	 * @param id
	 * @param R
	 */
	public void updateReclamation(int id, Reclamation r) {
		String requete = "update reclamation set idlieu=?, date=?, heure=?,";
                       requete+="description=?, titre=?, idcitoyen=?, iddomaine=?, etat=? where id=?";
            try {
                PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
                ps.setInt(1, r.getIdLieu());
                ps.setDate(2, new java.sql.Date(r.getDate().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Date afin de l'inserer dans la base de donnée
                ps.setTime(3, new java.sql.Time(r.getHeure().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Time afin de l'inserer dans la base de donnée
                ps.setString(4, r.getDescription());
                ps.setString(5, r.getTitre());
                ps.setInt(6, r.getIdCitoyen());
                ps.setInt(7, r.getIdDomaine());
                ps.setBoolean(8, r.getEtat());
                ps.setInt(9, id);
                
                ps.executeUpdate();
                
                //<tmp>
                System.out.println("update effectuée avec succès");
                //</tmp>        
            } catch (SQLException ex) {
                //<tmp>
                System.out.println("erreur lors de l'update "+ex.getMessage());
                //</tmp>
            }
                
                
	}

	public List<Reclamation> selectReclamations() {
		// TODO - implement ReclamationDao.selectReclamations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Reclamation selectReclamationById(int id) {
		// TODO - implement ReclamationDao.selectReclamationById
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteReclamation(int id) {
		// TODO - implement ReclamationDao.deleteReclamation
		throw new UnsupportedOperationException();
	}

}