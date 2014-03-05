package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Commentaire;
import com.tunisianwatch.Entities.Commentaire;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommentaireDao {

    /**
     *
     * @param C
     */
    public int insertCommentaire(Commentaire c) {
        String requete = "insert into commentaire (idreclamation,texte,idutilisateur,date) value(?,?,?,?)";
        int id = 0;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getIdReclamation());
            ps.setString(2, c.getTexte());
            ps.setInt(3, c.getUser().getId());
            ps.setDate(4, new java.sql.Date(c.getDate().getTime()));
            ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close(); 
            System.out.println("Ajout effectuée avec succès");
            return id;
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return id;
    }

    /**
     *
     * @param id
     * @param C
     */
    public void updateCommentaire(int id, Commentaire c) {
        String requete = "update commentaire set texte=?,date=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, c.getTexte());
            ps.setDate(2, new java.sql.Date(c.getDate().getTime()));
            ps.setInt(3, c.getId());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public List<Commentaire> selectCommentairesByIdReclamation(int idreclamation) {
        String requete = "select * from commentaire where idreclamation=?";
        PreparedStatement ps;
        List<Commentaire> listCommentaire = new ArrayList<Commentaire>();
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idreclamation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Commentaire commentaire = new Commentaire();
                commentaire.setId(resultat.getInt("id"));
                commentaire.setIdReclamation(resultat.getInt("idreclamation"));
                commentaire.setTexte(resultat.getString("texte"));
                commentaire.setUser(new UtilisateurDao().selectUserById(resultat.getInt("idutilisateur")));
                commentaire.setDate(resultat.getDate("date"));
                listCommentaire.add(commentaire);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listCommentaire;
    }

    /**
     *
     * @param id
     */
    /**
     *
     * @param id
     */
    public boolean deleteCommentaire(int id) {
        String requete = "delete from reclamation where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }
}
