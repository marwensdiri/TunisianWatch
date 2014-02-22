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
import java.sql.Statement;
import java.util.ArrayList;
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

        String requete = "insert into utilisateur (idetablissement,nom,prenom,photo,login,mdp,mail,type,datenaissance) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, u.getIdEtablissement());
            ps.setString(2, u.getNom());
            ps.setString(3, u.getPrenom());
            ps.setString(4, u.getPhoto());
            ps.setString(5, u.getLogin());
            ps.setString(6, u.getMdp());
            ps.setString(7, u.getMail());
            ps.setString(8, u.getType() + "");
            ps.setDate(9, new java.sql.Date(u.getDateNaissance().getTime()));
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public void updateUser(int id, Utilisateur u) {
        String requete = "UPDATE utilisateur set  idetablissement=? ,nom=? ,prenom=? ,photo=?,sexe=?,adress=? ,login=? ,mdp=? ,mail=? ,type=? ,datenaissance=? WHERE id=? ";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, u.getIdEtablissement());
            ps.setString(2, u.getNom());
            ps.setString(3, u.getPrenom());
            ps.setString(4, u.getPhoto());
            ps.setString(5, u.getSexe() + "");
            ps.setString(6, u.getAdress() + "");
            ps.setString(7, u.getLogin());
            ps.setString(8, u.getMdp());
            ps.setString(9, u.getMail());
            ps.setString(10, u.getType() + "");
            ps.setDate(11, new java.sql.Date(u.getDateNaissance().getTime()));
            ps.setInt(12, id);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {

            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deleteUser(int id) {

        String requete = "delete from utilisateur where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Utilisateur supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public List<Utilisateur> selectUsers() {
        List<Utilisateur> listeUsers = new ArrayList<Utilisateur>();

        String requete = "select * from Utilisateur";
        try {
            Statement statement = ResourceManager.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Utilisateur user = new Utilisateur();
                user.setId(resultat.getInt(1));
                user.setIdEtablissement(resultat.getInt(2));
                user.setNom(resultat.getString(3));
                user.setPrenom(resultat.getString(4));
                user.setPhoto(resultat.getString(5));
                user.setSexe(resultat.getString(6).charAt(0));
                user.setAdress(resultat.getString(7));
                user.setLogin(resultat.getString(8));
                user.setMdp(resultat.getString(9));
                user.setMail(resultat.getString(10));
                user.setType(resultat.getString(11).charAt(0));
                user.setDateNaissance(resultat.getDate(12));

                listeUsers.add(user);
            }
            return listeUsers;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des utilisateurs " + ex.getMessage());
            return null;
        }

    }

    public Utilisateur selectUserById(int id) {
        Utilisateur user = new Utilisateur();

        String requete = "select * from Utilisateur where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {

                user.setId(resultat.getInt(1));
                user.setIdEtablissement(resultat.getInt(2));
                user.setNom(resultat.getString(3));
                user.setPrenom(resultat.getString(4));
                user.setPhoto(resultat.getString(5));
                user.setSexe(resultat.getString(6).charAt(0));
                user.setAdress(resultat.getString(7));
                user.setLogin(resultat.getString(8));
                user.setMdp(resultat.getString(9));
                user.setMail(resultat.getString(10));
                user.setType(resultat.getString(11).charAt(0));
                user.setDateNaissance(resultat.getDate(12));

            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'utilisateurs " + ex.getMessage());
            return null;
        }

    }

    public Utilisateur selectUserByLogin(String login) {
        Utilisateur user = new Utilisateur();

        String requete = "select * from Utilisateur where login=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {

                user.setId(resultat.getInt(1));
                user.setIdEtablissement(resultat.getInt(2));
                user.setNom(resultat.getString(3));
                user.setPrenom(resultat.getString(4));
                user.setPhoto(resultat.getString(5));
                user.setSexe(resultat.getString(6).charAt(0));
                user.setAdress(resultat.getString(7));
                user.setLogin(resultat.getString(8));
                user.setMdp(resultat.getString(9));
                user.setMail(resultat.getString(10));
                user.setType(resultat.getString(11).charAt(0));
                user.setDateNaissance(resultat.getDate(12));
            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'utilisateurs " + ex.getMessage());
            return null;
        }

    }

    public Utilisateur selectUserByMail(String mail) {
        Utilisateur user = new Utilisateur();

        String requete = "select * from Utilisateur where mail=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {

                user.setId(resultat.getInt(1));
                user.setIdEtablissement(resultat.getInt(2));
                user.setNom(resultat.getString(3));
                user.setPrenom(resultat.getString(4));
                user.setPhoto(resultat.getString(5));
                user.setSexe(resultat.getString(6).charAt(0));
                user.setAdress(resultat.getString(7));
                user.setLogin(resultat.getString(8));
                user.setMdp(resultat.getString(9));
                user.setMail(resultat.getString(10));
                user.setType(resultat.getString(11).charAt(0));
                user.setDateNaissance(resultat.getDate(12));

            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'utilisateurs " + ex.getMessage());
            return null;
        }

    }

    public Utilisateur selectUserByType(char type) {
        Utilisateur user = new Utilisateur();

        String requete = "select * from Utilisateur where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, type + "");
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {

                user.setId(resultat.getInt(1));
                user.setIdEtablissement(resultat.getInt(2));
                user.setNom(resultat.getString(3));
                user.setPrenom(resultat.getString(4));
                user.setPhoto(resultat.getString(5));
                user.setSexe(resultat.getString(6).charAt(0));
                user.setAdress(resultat.getString(7));
                user.setLogin(resultat.getString(8));
                user.setMdp(resultat.getString(9));
                user.setMail(resultat.getString(10));
                user.setType(resultat.getString(11).charAt(0));
                user.setDateNaissance(resultat.getDate(12));

            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche d'utilisateurs " + ex.getMessage());
            return null;
        }

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
                user = new Utilisateur(resultat.getInt("id"), resultat.getInt("idetablissement"), resultat.getString("nom"), resultat.getString("prenom"), resultat.getString("photo"), resultat.getString("login"), resultat.getString("mdp"), resultat.getString("mail"), resultat.getString("type").charAt(0), resultat.getDate("datenaissance"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return user;
        }
    }

}
