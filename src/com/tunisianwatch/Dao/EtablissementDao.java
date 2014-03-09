package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.EtablissementDomaine;
import com.tunisianwatch.Entities.Lieu;
import com.tunisianwatch.Entities.Utilisateur;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        String requete = "insert into etablissement (nom , description,idlieu,idresponsable) values (?,?,?,?)";
        int id = -1;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, E.getNom());
            if (E.getDescription() != null) {
                ps.setString(2, E.getDescription());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (E.getLieu() != null) {
                ps.setInt(3, E.getLieu().getId());
            } else {
                ps.setNull(3, java.sql.Types.NUMERIC);
            }
            if (E.getResponsable() != null) {
                ps.setInt(4, E.getResponsable().getId());
            } else {
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
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

    public int insertEtablissement(Etablissement E, String path) throws FileNotFoundException {
        String requete = "insert into etablissement (nom , description,image,idlieu,idresponsable) values (?,?,?,?,?)";
        int id = -1;
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            if (E.getNom() != null) {
                ps.setString(1, E.getNom());
            } else {
                ps.setNull(1, java.sql.Types.VARCHAR);
            }
            if (E.getDescription() != null) {
                ps.setString(2, E.getDescription());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (path != null) {
                FileInputStream fis = new FileInputStream(path);
                ps.setBinaryStream(3, fis, (int) path.length());
            } else {
                ps.setNull(3, java.sql.Types.BLOB);
            }
            if (E.getLieu() != null) {
                ps.setInt(4, E.getLieu().getId());
            } else {
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
            if (E.getResponsable() != null) {
                ps.setInt(5, E.getResponsable().getId());
            } else {
                ps.setNull(5, java.sql.Types.NUMERIC);
            }
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
     * @param E
     */
    public boolean updateEtablissement(int id, Etablissement E) {
        String requete = "update etablissement set nom=?, description=?,idlieu=?,idresponsable=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            if (E.getNom() != null) {
                ps.setString(1, E.getNom());
            } else {
                ps.setNull(1, java.sql.Types.NUMERIC);
            }
            if (E.getDescription() != null) {
                ps.setString(2, E.getDescription());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }
            if (E.getLieu() != null) {
                ps.setInt(3, E.getLieu().getId());
            } else {
                ps.setNull(3, java.sql.Types.NUMERIC);
            }
            if (E.getResponsable() != null) {
                ps.setInt(4, E.getResponsable().getId());
            } else {
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
            ps.setInt(5, E.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
            return false;
        }
    }

    public boolean updateEtablissement(int id, Etablissement E, String path) throws FileNotFoundException {
        String requete = "update etablissement set nom=?, description=?, image=?,idlieu=?,idresponsable=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            if (E.getNom() != null) {
                ps.setString(1, E.getNom());
            } else {
                ps.setNull(1, java.sql.Types.VARCHAR);
            }
            if (E.getDescription() != null) {
                ps.setString(2, E.getDescription());
            } else {
                ps.setNull(2, java.sql.Types.VARCHAR);
            }

            if (path != null) {
                FileInputStream fis = new FileInputStream(path);
                ps.setBinaryStream(3, fis, (int) path.length());
            } else {
                ps.setNull(3, java.sql.Types.BLOB);
            }
            if (E.getLieu() != null) {
                ps.setInt(4, E.getLieu().getId());
            } else {
                ps.setNull(4, java.sql.Types.NUMERIC);
            }
            if (E.getResponsable() != null) {
                ps.setInt(5, E.getResponsable().getId());
            } else {
                ps.setNull(5, java.sql.Types.NUMERIC);
            }
            ps.setInt(6, E.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
            return false;
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

                Etablissement E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), null, lieu, responsable);
                byte[] Imagebytes = resultat.getBytes("image");
                if (Imagebytes != null) {
                    Image image = Toolkit.getDefaultToolkit().createImage(Imagebytes);
                    E.setImage(image);
                }
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
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), null, lieu, responsable);
                byte[] Imagebytes = resultat.getBytes("image");
                if (Imagebytes != null) {
                    Image image = Toolkit.getDefaultToolkit().createImage(Imagebytes);
                    E.setImage(image);
                }
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
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), null, lieu, responsable);
                byte[] Imagebytes = resultat.getBytes("image");
                if (Imagebytes != null) {
                    Image image = Toolkit.getDefaultToolkit().createImage(Imagebytes);
                    E.setImage(image);
                }
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
                E = new Etablissement(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("description"), null, lieu, responsable);
                byte[] Imagebytes = resultat.getBytes("image");
                if (Imagebytes != null) {
                    Image image = Toolkit.getDefaultToolkit().createImage(Imagebytes);
                    E.setImage(image);
                }
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
    public boolean deleteEtablissement(int id) {
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
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }

    }
}
