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
import javax.swing.JOptionPane;

/**
 *
 * @author Marwen
 */
public class UtilisateurDao {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void insertUser(Utilisateur u) {

        String requete = "insert into utilisateur (nom,prenom,photo,sexe,adress,login,mdp,mail,type,datenaissance) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, u.getNom());
            ps.setString(2, u.getPrenom());
            ps.setString(3, u.getPhoto());
            ps.setString(4, u.getSexe() + "");
            ps.setString(5, u.getAdress() + "");
            ps.setString(6, u.getLogin());
            ps.setString(7, u.getMdp());
            ps.setString(8, u.getMail());
            ps.setString(9, u.getType() + "");
            ps.setDate(10, new java.sql.Date(u.getDateNaissance().getTime()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'insertion");
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }
    
    public void insertResponsable(Utilisateur u) {

        String requete = "insert into utilisateur (idetablissement,nom,prenom,photo,sexe,adress,login,mdp,mail,type,datenaissance) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, u.getEtablissement().getId());
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
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'insertion");
            System.out.println("erreur lors de l'insertion : " + ex.getMessage());
        }

    }

    public void updateUser(int id, Utilisateur u) {
        String requete = "UPDATE utilisateur set  nom=? ,prenom=? ,photo=?,sexe=?,adress=? ,login=? ,mdp=? ,mail=? ,type=? ,datenaissance=? WHERE id=? ";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, u.getNom());
            ps.setString(2, u.getPrenom());
            ps.setString(3, u.getPhoto());
            ps.setString(4, u.getSexe() + "");
            ps.setString(5, u.getAdress() + "");
            ps.setString(6, u.getLogin());
            ps.setString(7, u.getMdp());
            ps.setString(8, u.getMail());
            ps.setString(9, u.getType() + "");
            ps.setDate(10, new java.sql.Date(u.getDateNaissance().getTime()));
            ps.setInt(11, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ");
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
    
    public void updateResponsable(int id, Utilisateur u) {
        String requete = "UPDATE utilisateur set  idetablissement=? ,nom=? ,prenom=? ,photo=?,sexe=?,adress=? ,login=? ,mdp=? ,mail=? ,type=? ,datenaissance=? WHERE id=? ";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, u.getEtablissement().getId());
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
            JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ");
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deleteUser(int id) {

        String requete = "delete from utilisateur where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Utilisateur supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression");
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
                user.setId(resultat.getInt("id"));
                if(resultat.getString("type").charAt(0)=='R'){
                   Etablissement etablissement= new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                   user.setEtablissement(etablissement);
                }
                user.setNom(resultat.getString("nom"));
                user.setPrenom(resultat.getString("prenom"));
                user.setPhoto(resultat.getString("photo"));
                user.setSexe(resultat.getString("sexe").charAt(0));
                user.setAdress(resultat.getString("adress"));
                user.setLogin(resultat.getString("login"));
                user.setMdp(resultat.getString("mdp"));
                user.setMail(resultat.getString("mail"));
                user.setType(resultat.getString("type").charAt(0));
                user.setDateNaissance(resultat.getDate("datenaissance"));

                listeUsers.add(user);
            }
            return listeUsers;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors du chargement ");
            System.out.println("erreur lors du chargement : " + ex.getMessage());
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

            if (resultat.next()) {

                user.setId(resultat.getInt("id"));
                if(resultat.getString("type").charAt(0)=='R'){
                   Etablissement etablissement= new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                   user.setEtablissement(etablissement);
                }
                user.setNom(resultat.getString("nom"));
                user.setPrenom(resultat.getString("prenom"));
                user.setPhoto(resultat.getString("photo"));
                user.setSexe(resultat.getString("sexe").charAt(0));
                user.setAdress(resultat.getString("adress"));
                user.setLogin(resultat.getString("login"));
                user.setMdp(resultat.getString("mdp"));
                user.setMail(resultat.getString("mail"));
                user.setType(resultat.getString("type").charAt(0));
                user.setDateNaissance(resultat.getDate("datenaissance"));

            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche  ");
            System.out.println("erreur lors de la recherche : " + ex.getMessage());
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

                user.setId(resultat.getInt("id"));
                if(resultat.getString("type").charAt(0)=='R'){
                   Etablissement etablissement= new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                   user.setEtablissement(etablissement);
                }
                user.setNom(resultat.getString("nom"));
                user.setPrenom(resultat.getString("prenom"));
                user.setPhoto(resultat.getString("photo"));
                user.setSexe(resultat.getString("sexe").charAt(0));
                user.setAdress(resultat.getString("adress"));
                user.setLogin(resultat.getString("login"));
                user.setMdp(resultat.getString("mdp"));
                user.setMail(resultat.getString("mail"));
                user.setType(resultat.getString("type").charAt(0));
                user.setDateNaissance(resultat.getDate("datenaissance"));
            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche ");
            System.out.println("erreur lors de la recherche  " + ex.getMessage());
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

            if (resultat.next()) {

               
                user.setId(resultat.getInt("id"));
                if(resultat.getString("type").charAt(0)=='R'){
                   Etablissement etablissement= new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                   user.setEtablissement(etablissement);
                }
                user.setNom(resultat.getString("nom"));
                user.setPrenom(resultat.getString("prenom"));
                user.setPhoto(resultat.getString("photo"));
                user.setSexe(resultat.getString("sexe").charAt(0));
                user.setAdress(resultat.getString("adress"));
                user.setLogin(resultat.getString("login"));
                user.setMdp(resultat.getString("mdp"));
                user.setMail(resultat.getString("mail"));
                user.setType(resultat.getString("type").charAt(0));
                user.setDateNaissance(resultat.getDate("datenaissance"));
            }
            return user;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche ");
            System.out.println("erreur lors de la recherche " + ex.getMessage());
            return null;
        }
    }

    public List<Utilisateur> selectUserByType(char type) {

        List<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>() ;
        String requete = "select * from Utilisateur where type=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, type + "");
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {
                Utilisateur user = new Utilisateur();
                user.setId(resultat.getInt("id"));
                if(resultat.getString("type").charAt(0)=='R'){
                   Etablissement etablissement= new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                   user.setEtablissement(etablissement);
                }
                user.setNom(resultat.getString("nom"));
                user.setPrenom(resultat.getString("prenom"));
                user.setPhoto(resultat.getString("photo"));
                user.setSexe(resultat.getString("sexe").charAt(0));
                user.setAdress(resultat.getString("adress"));
                user.setLogin(resultat.getString("login"));
                user.setMdp(resultat.getString("mdp"));
                user.setMail(resultat.getString("mail"));
                user.setType(resultat.getString("type").charAt(0));
                user.setDateNaissance(resultat.getDate("datenaissance"));
                listUtilisateur.add(user);

            }
            return listUtilisateur;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche ");
            System.out.println("erreur lors de la recherche " + ex.getMessage());
            return null;
        }

    }

    public Utilisateur Authentification(String login, String password) {
        Utilisateur user = null;
        try {
            String requete = "select * from utilisateur where login=? and mdp=?";
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2, password);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                user = new Utilisateur(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("prenom"), resultat.getString("photo"), resultat.getString("login"), resultat.getString("mdp"), resultat.getString("mail"), resultat.getString("type").charAt(0), resultat.getDate("datenaissance"));
                if(resultat.getString("type").charAt(0)=='R'){
                    Etablissement etablissement = new EtablissementDao().selectEtablissementById(resultat.getInt("idetablissement"));
                    user.setEtablissement(etablissement);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return user;
        }
    }

    public void deleteUserByEtablissement(int idetablissement) {
        String requete = "delete from utilisateur where idetablissement=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idetablissement);
            ps.executeUpdate();
            System.out.println("Utilisateur supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression ");
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

}
