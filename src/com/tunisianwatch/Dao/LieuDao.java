package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Lieu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LieuDao {

    /**
     *
     * @param L
     */
    public void insertLieu(Lieu L) {
        String requete = "insert into lieu (gouvernorat,lat,lon) values (?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, L.getNom());
            ps.setDouble(2, L.getLat());
            ps.setDouble(3, L.getLon());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public boolean isExite(Lieu L) throws SQLException {
        String requete = "select * from lieu where gouvernorat=?";
        PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
        ps.setString(1, L.getNom());
        ResultSet resultat = ps.executeQuery();
        if (resultat.next()) {
            return true;
        }

        return false;
    }

    /**
     *
     * @param id
     * @param L
     */
    public void updateLieu(int id, Lieu L) {
        String requete = "update lieu set gouvernorat=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, L.getNom());
            ps.setInt(2, L.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void updateGeo(int id, Lieu L) {
        String requete = "update lieu set lat=?,lon=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setDouble(1, L.getLat());
            ps.setDouble(2, L.getLon());
            ps.setInt(3, L.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Lieu> selectLieux() {
        List<Lieu> lieux = new ArrayList<Lieu>();
        String requete = "select * from lieu";
        Statement statement;
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Lieu lieu = new Lieu();
                lieu.setId(resultat.getInt("id"));
                lieu.setNom(resultat.getString("gouvernorat"));
                lieu.setLat(resultat.getDouble("lat"));
                lieu.setLon(resultat.getDouble("lon"));
                lieux.add(lieu);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return lieux;
    }

    /**
     *
     * @param id
     */
    public Lieu selectLieuById(int id) {
        String requete = "select * from lieu where id=?";
        Lieu lieu = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                lieu = new Lieu();
                lieu.setId(resultat.getInt("id"));
                lieu.setNom(resultat.getString("gouvernorat"));
                lieu.setLat(resultat.getDouble("lat"));
                lieu.setLon(resultat.getDouble("lon"));
            }
        } catch (SQLException ex) {
        }
        return lieu;

    }

    public Lieu selectLieuByNom(String nom) {
        String requete = "select * from lieu where id=?";
        Lieu lieu = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                lieu = new Lieu();
                lieu.setId(resultat.getInt("id"));
                lieu.setNom(resultat.getString("gouvernorat"));
                lieu.setLat(resultat.getDouble("lat"));
                lieu.setLon(resultat.getDouble("lon"));

            }
        } catch (SQLException ex) {
        }
        return lieu;

    }

    /**
     *
     * @param id
     */
    public void deleteLieu(int id) {
        String requete = "delete from lieu where id=?";
        PreparedStatement ps;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }

    }
}
