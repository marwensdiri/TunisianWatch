package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Reclamation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
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
        requete += "description=?, titre=?, idcitoyen=?, iddomaine=?, etat=? where id=?";
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
            System.out.println("erreur lors de l'update " + ex.getMessage());
            //</tmp>
        }


    }

    public List<Reclamation> selectReclamations() {
        List<Reclamation> listeReclamations = new ArrayList<Reclamation>();

        String requete = "select * from reclamation";
        try {
            Statement statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setIdLieu(resultat.getInt("idlieu"));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setIdCitoyen(resultat.getInt("idcitoyen"));
                r.setIdDomaine(resultat.getInt("iddomaine"));
                r.setEtat(resultat.getBoolean("etat"));

                listeReclamations.add(r);
            }
            return listeReclamations;
        } catch (SQLException ex) {

            return null;
        }
    }

    /**
     *
     * @param id
     */
    public Reclamation selectReclamationById(int id) {
        Reclamation rec = new Reclamation();
        String requete = "select * from reclamation where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                rec.setId(resultat.getInt("id"));
                rec.setIdLieu(resultat.getInt("idlieu"));
                rec.setDate(resultat.getDate("date"));
                rec.setHeure(resultat.getTime("heure"));
                rec.setDescription(resultat.getString("description"));
                rec.setTitre(resultat.getString("titre"));
                rec.setIdCitoyen(resultat.getInt("idcitoyen"));
                rec.setIdDomaine(resultat.getInt("iddomaine"));
                rec.setEtat(resultat.getBoolean("etat"));
            }
            return rec;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public void deleteReclamation(int id) {
        String requete = "delete from reclamation where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
}