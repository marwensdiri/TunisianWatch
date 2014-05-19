package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocumentDao {

    /**
     *
     * @param d
     */
   

    public int insertDocument(Document d){
        int id = 0;
        String requete = "insert into document (type,nom,idreclamation,url) values (?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getType());
            ps.setString(2, d.getNom());
            ps.setInt(3, d.getIdReclamation());
            ps.setString(4, d.getUrl());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            return id;
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return id;
        }
    }

    /**
     *
     * @param id
     * @param d
     */
    public List<Document> selectDocuments() throws IOException {
        List<Document> listeDocuments = new ArrayList<Document>();
        String requete = "select * from document";
        try {
            Statement statement = ResourceManager.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Document doc = new Document();
                doc.setId(resultat.getInt("id"));
                doc.setIdReclamation(resultat.getInt("idreclamation"));
                doc.setNom(resultat.getString("nom"));
                doc.setType(resultat.getInt("type"));
                doc.setUrl(resultat.getString("url"));
                listeDocuments.add(doc);
            }
            return listeDocuments;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement : " + ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public Document selectDocumentById(int id) {
        Document doc = null;
        String requete = "select * from document where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                doc = new Document();
                doc.setId(resultat.getInt("id"));
                doc.setIdReclamation(resultat.getInt("idreclamation"));
                doc.setNom(resultat.getString("nom"));
                doc.setType(resultat.getInt("type"));
                doc.setIdReclamation(resultat.getInt("idreclamation"));
                doc.setUrl(resultat.getString("url"));
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche " + ex.getMessage());
        } finally {
            return doc;
        }
    }

    public List<Document> selectDocumentByIdReclamation(int idreclamation) {
        List<Document> listeDocuments = new ArrayList<Document>();
        String requete = "select * from document where idreclamation=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idreclamation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Document doc = new Document();
                doc = new Document();
                doc.setIdReclamation(idreclamation);
                doc.setId(resultat.getInt("id"));
                doc.setNom(resultat.getString("nom"));
                doc.setType(resultat.getInt("type"));
                doc.setUrl(resultat.getString("url"));
                listeDocuments.add(doc);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors de la recherche " + ex.getMessage());
        } finally {
            return listeDocuments;
        }
    }

    /**
     *
     * @param id
     */
    public boolean deleteDocument(int id) {
        String requete = "delete from document where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Utilisateur supprimée");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }

    public boolean deleteDocumentByReclamation(int idreclamation) {
        String requete = "delete from document where idreclamation=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idreclamation);
            ps.executeUpdate();
            System.out.println("document supprimée");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }
}
