package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EtablissementDomaineDao {

    /**
     *
     * @param ED
     */
    public void insertEtablissementDomaine(EtablissementDomaine ED) {
        String requete = "insert into etablissement_domaine (idetablissement,iddomaine) value(?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, ED.getIdEtablissement());
            ps.setInt(2, ED.getIdDomaine());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    /**
     *
     * @param id
     * @param ED
     */
    /**
     *
     * @param id
     */
    public void deleteEtablissementDomaine(int idetablissement, int iddomaine) {
        String requete = "delete from etablissement_domaine where iddomaine=? and idetablissement=?";
        PreparedStatement ps;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, iddomaine);
            ps.setInt(2, idetablissement);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public void deleteEtablissementDomaineByEtablissement(int idetablissement) {
        String requete = "delete from etablissement_domaine where idetablissement=?";
        PreparedStatement ps;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idetablissement);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public List<EtablissementDomaine> selectEtablissementDomaines() {
        List<EtablissementDomaine> edList = new ArrayList<EtablissementDomaine>();
        String requete = "select * from etablissement";
        Statement statement;
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                EtablissementDomaine ED = new EtablissementDomaine(resultat.getInt("idetablissement"), resultat.getInt("iddomaine"));
                edList.add(ED);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return edList;
    }

    /**
     *
     * @param id
     */
    public EtablissementDomaine seletcEtablissementDomaineById(int id) {
        String requete = "select * from etablissement_domaine where id=?";
        EtablissementDomaine ED = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                ED = new EtablissementDomaine(resultat.getInt("idetablissement"), resultat.getInt("iddomaine"));
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return ED;

    }

    public List<EtablissementDomaine> seletcEtablissementDomaineByIdEtablissement(int idetablissement) {
        String requete = "select * from etablissement_domaine where idetablissement=?";
        List<EtablissementDomaine> listEtablissementDomaine = new ArrayList<EtablissementDomaine>();
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idetablissement);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                EtablissementDomaine etabDomaine;
                etabDomaine = new EtablissementDomaine(resultat.getInt("idetablissement"), resultat.getInt("iddomaine"));
                listEtablissementDomaine.add(etabDomaine);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listEtablissementDomaine;
    }

    public List<EtablissementDomaine> seletcEtablissementDomaineByIdDomaine(int idDomaine) {
        String requete = "select * from etablissement_domaine where iddomaine=?";
        List<EtablissementDomaine> listEtablissementDomaine = new ArrayList<EtablissementDomaine>();
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idDomaine);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                EtablissementDomaine etabDomaine;
                etabDomaine = new EtablissementDomaine(resultat.getInt("idetablissement"), resultat.getInt("iddomaine"));
                listEtablissementDomaine.add(etabDomaine);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listEtablissementDomaine;
    }

}
