package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DocumentDao {

    /**
     *
     * @param d
     */
    public int insertDocument(Document d) {
        int id = 0;
        String requete = "insert into document (type,urlvideo,content,nom) values (?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, d.getType());
            ps.setString(2, d.getUrl());
            ps.setBlob(3, d.getContent());
            ps.setString(4, d.getNom());
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
    public List<Document> selectDocuments() {
        List<Document> listeDocuments = new ArrayList<Document>();
        
        String requete = "select * from document";
        try {
            Statement statement = ResourceManager.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while (resultat.next()) {
                Document doc = new Document();
                doc.setId(resultat.getInt("id"));
                doc.setNom(resultat.getString("nom"));
                doc.setType(resultat.getInt("type"));
                if (doc.getType() == 1) { //si le document est une photo
                    doc.setContent(resultat.getBlob("content"));
                } else { //sinon
                    doc.setUrl(resultat.getString("url"));
                }
                listeDocuments.add(doc);
            }
            return listeDocuments;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erreur lors du chargement ", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.out.println("erreur lors du chargement : " + ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public Document selectDocumentById(int id) {
        // TODO - implement DocumentDao.selectDocumentById
        throw new UnsupportedOperationException();
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
    
}
