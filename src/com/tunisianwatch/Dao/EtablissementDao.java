package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Etablissement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EtablissementDao {

    /**
     *
     * @param E
     */
    public void insertEtablissement(Etablissement E) {
        String requete = "insert into etablissement (nom , description,image,idlieux) values (?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, E.getNom());
            ps.setString(2, E.getDescription());
            ps.setString(3, E.getImage());
            ps.setInt(4, E.getIdLieu());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    /**
     *
     * @param id
     * @param E
     */
    public void updateEtablissement(int id, Etablissement E) {
        String requete = "update etablissement set nom=?, description=?, image=?,idlieux=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, E.getNom());
            ps.setString(2, E.getDescription());
            ps.setString(3, E.getImage());
            ps.setInt(4, E.getIdLieu());
            ps.setInt(5, E.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Etablissement> selectEtablissements() {
        List<Etablissement> etablissements = new ArrayList<Etablissement>();
        String requete = "select * from etablissement";
        Statement statement;
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Etablissement E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), resultat.getInt("idlieux"));
                etablissements.add(E);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement"+ex.getMessage());
        }
        return etablissements;
    }

    /**
     *
     * @param id
     */
    public Etablissement selectEtablissementById(int id) {
        String requete = "select * from etablissement where id=?";
        Etablissement E = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), resultat.getInt("idlieux"));
            }
        } catch (SQLException ex) {

        }
        return E;

    }

    /**
     *
     * @param id
     */
    public void deleteEtablissement(int id) {
        String requete = "delete from etablissement where id=?";
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
