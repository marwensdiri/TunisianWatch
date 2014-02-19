/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marwen
 */
public class UtilisateurDao {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void insertUser(Utilisateur u) {
        String requete = "insert into utilisateur (idetablissement,nom , prenom,photo,login) values (?,?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(3, u.getNom());
            ps.setString(4, u.getPrenom());
            ps.setString(5, u.getPhoto());
            ps.setString(6, u.getLogin());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public void updateUser(int id, Utilisateur u) {
        String requete = "";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
         //   ps.setString(1, u.setIdEtablissement(1));
            //  ps.setInt(2, u.setNom("nom"));
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deleteUser(int id) {

    }

    public List<Utilisateur> selectUsers() {
        return null;

    }

    public Utilisateur selectUserById(int id) {
        return null;

    }

    public Utilisateur Connect(String login, String password) {
        Utilisateur user = null;
        try {
            String requete = "select * from utilisateur where login=? and mdp=?";
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                user = new Utilisateur(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("prenom"), resultat.getDate("datenaissance"), resultat.getString("photo"), resultat.getString("login"), resultat.getString("mdp"), resultat.getString("mail"),resultat.getString("type").charAt(0), resultat.getInt("idetablissement"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return user;
        }
    }

}
