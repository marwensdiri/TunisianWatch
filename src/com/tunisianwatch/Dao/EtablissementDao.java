package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.EtablissementDomaine;
import com.tunisianwatch.Entities.Lieu;
import com.tunisianwatch.Entities.Utilisateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EtablissementDao {

    /**
     *
     * @param E
     */
    public int insertEtablissement(Etablissement E) {
        String requete = "insert into etablissement (nom , description,image,idlieu,idresponsable) values (?,?,?,?,?)";
        int id = -1;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, E.getNom());
            ps.setString(2, E.getDescription());
            ps.setString(3, E.getImage());
            ps.setInt(4, E.getLieu().getId());
            ps.setInt(5, E.getResponsable().getId());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return id;
    }

    /**
     *
     * @param id
     * @param E
     */
    public void updateEtablissement(int id, Etablissement E) {
        String requete = "update etablissement set nom=?, description=?, image=?,idlieu=?,idresponsable=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, E.getNom());
            ps.setString(2, E.getDescription());
            ps.setString(3, E.getImage());
            ps.setInt(4, E.getLieu().getId());
            ps.setInt(5, E.getResponsable().getId());
            ps.setInt(6, E.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Etablissement> selectEtablissements() {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisaeurDao = new UtilisateurDao();
        EtablissementDomaineDao etablissementDomaineDao = new EtablissementDomaineDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Etablissement> etablissements = new ArrayList<Etablissement>();
        String requete = "select * from etablissement";
        Statement statement;
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Lieu lieu = lieuDao.selectLieuById(resultat.getInt("idlieu"));
                Utilisateur responsable = utilisaeurDao.selectUserById(resultat.getInt("idresponsable"));
                Etablissement E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), lieu, responsable);
                List<EtablissementDomaine> listEtabDomaine = etablissementDomaineDao.seletcEtablissementDomaineByIdEtablissement(resultat.getInt("id"));
                List<Domaine> listDomaine = new ArrayList<Domaine>();
                for (int i = 0; i < listEtabDomaine.size(); i++) {
                    listDomaine.add(domaineDao.selectDomaineById(listEtabDomaine.get(i).getIdDomaine()));
                }
                E.setListDomaine(listDomaine);
                etablissements.add(E);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return etablissements;
    }

    /**
     *
     * @param id
     */
    public Etablissement selectEtablissementById(int id) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisaeurDao = new UtilisateurDao();
        EtablissementDomaineDao etablissementDomaineDao = new EtablissementDomaineDao();
        DomaineDao domaineDao = new DomaineDao();
        String requete = "select * from etablissement where id=?";
        Etablissement E = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                Lieu lieu = lieuDao.selectLieuById(resultat.getInt("idlieu"));
                Utilisateur responsable = utilisaeurDao.selectUserById(resultat.getInt("idresponsable"));
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), lieu, responsable);
                List<EtablissementDomaine> listEtabDomaine = etablissementDomaineDao.seletcEtablissementDomaineByIdEtablissement(resultat.getInt("id"));
                List<Domaine> listDomaine = new ArrayList<Domaine>();
                for (int i = 0; i < listDomaine.size(); i++) {
                    listDomaine.add(domaineDao.selectDomaineById(listEtabDomaine.get(i).getIdDomaine()));
                }
                E.setListDomaine(listDomaine);
            }
        } catch (SQLException ex) {
        }
        return E;

    }

    public Etablissement selectEtablissementByNom(String nom) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisaeurDao = new UtilisateurDao();
        EtablissementDomaineDao etablissementDomaineDao = new EtablissementDomaineDao();
        DomaineDao domaineDao = new DomaineDao();
        String requete = "select * from etablissement where nom=?";
        Etablissement E = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                Lieu lieu = lieuDao.selectLieuById(resultat.getInt("idlieu"));
                Utilisateur responsable = utilisaeurDao.selectUserById(resultat.getInt("idresponsable"));
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), lieu, responsable);
                List<EtablissementDomaine> listEtabDomaine = etablissementDomaineDao.seletcEtablissementDomaineByIdEtablissement(resultat.getInt("id"));
                List<Domaine> listDomaine = new ArrayList<Domaine>();
                for (int i = 0; i < listDomaine.size(); i++) {
                    listDomaine.add(domaineDao.selectDomaineById(listEtabDomaine.get(i).getIdDomaine()));
                }
            }
        } catch (SQLException ex) {
        }
        return E;

    }

    public Etablissement selectEtablissementByIdLien(int idLieu) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisaeurDao = new UtilisateurDao();
        EtablissementDomaineDao etablissementDomaineDao = new EtablissementDomaineDao();
        DomaineDao domaineDao = new DomaineDao();
        String requete = "select * from etablissement where idlieu=?";
        Etablissement E = null;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idLieu);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                Lieu lieu = lieuDao.selectLieuById(resultat.getInt("idlieu"));
                Utilisateur responsable = utilisaeurDao.selectUserById(resultat.getInt("idresponsable"));
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), resultat.getString("image"), lieu, responsable);
                List<EtablissementDomaine> listEtabDomaine = etablissementDomaineDao.seletcEtablissementDomaineByIdEtablissement(resultat.getInt("id"));
                List<Domaine> listDomaine = new ArrayList<Domaine>();
                for (int i = 0; i < listDomaine.size(); i++) {
                    listDomaine.add(domaineDao.selectDomaineById(listEtabDomaine.get(i).getIdDomaine()));
                }
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
        EtablissementDomaineDao etablissementDomaineDao = new EtablissementDomaineDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        utilisateurDao.deleteUserByEtablissement(id);
        etablissementDomaineDao.deleteEtablissementDomaineByEtablissement(id);
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
