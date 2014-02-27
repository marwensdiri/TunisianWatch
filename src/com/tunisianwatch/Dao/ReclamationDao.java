package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Reclamation;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReclamationDao {

    /**
     *
     * @param R
     */
    public void insertReclamation(Reclamation r) {
        String requete = "insert into reclamation (idlieu,date,heure,description,titre,idcitoyen,etat) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);

            ps.setInt(1, r.getLieu().getId());
            ps.setDate(2, new java.sql.Date(r.getDate().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Date afin de l'inserer dans la base de donnée
            ps.setTime(3, new java.sql.Time(r.getHeure().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Time afin de l'inserer dans la base de donnée
            ps.setString(4, r.getDescription());
            ps.setString(5, r.getTitre());
            ps.setInt(6, r.getCitoyen().getId());
            ps.setInt(7, r.getDomaine().getId());
            ps.setInt(8, r.getEtat());
            ps.executeUpdate();

            //<tmp>
            System.out.println("Ajout effectuée avec succès");
            //</tmp>        
        } catch (SQLException ex) {
            //<tmp>
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            //</tmp>
        }
    }

    /**
     *
     * @param id
     * @param R
     */
    public void updateReclamation(int id, Reclamation r) {
        String requete = "update reclamation set idlieu=?, date=?, heure=?,";
        requete += "description=?, titre=?, idcitoyen=?, iddomaine=?, etat=? where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getLieu().getId());
            ps.setDate(2, new java.sql.Date(r.getDate().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Date afin de l'inserer dans la base de donnée
            ps.setTime(3, new java.sql.Time(r.getHeure().getTime()));//conversion de l'objet java.util.Date récuprer de "r" ves l'objet java.sql.Time afin de l'inserer dans la base de donnée
            ps.setString(4, r.getDescription());
            ps.setString(5, r.getTitre());
            ps.setInt(6, r.getCitoyen().getId());
            ps.setInt(7, r.getDomaine().getId());
            ps.setInt(8, r.getEtat());
            ps.setInt(9, id);

            ps.executeUpdate();

            //<tmp>
            System.out.println("update effectuée avec succès");
            //</tmp>        
        } catch (SQLException ex) {
            //<tmp>
            System.out.println("erreur lors de l'update " + ex.getMessage());
            //</tmp>
        }

    }

    public List<Reclamation> selectReclamations() {
        List<Reclamation> listeReclamations = new ArrayList<Reclamation>();
        LieuDao lieuDao = new LieuDao();
        EvaluationDao evaluationDao = new EvaluationDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        String requete = "select * from reclamation";
        try {
            Statement statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                r.setListEvaluation(evaluationDao.selectEvaluationByIdReclamation(resultat.getInt("id")));
                listeReclamations.add(r);
            }
            return listeReclamations;
        } catch (SQLException ex) {

            return null;
        }
    }

    /**
     *
     * @param id
     */
    public Reclamation selectReclamationById(int id) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        String requete = "select * from reclamation where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Reclamation r = null;
            if (resultat.next()) {
                r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
            }
            return r;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> selectReclamationsByIdLieu(int idLieu) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where idlieu=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idLieu);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> selectReclamationsByDate(Date date) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where date=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> selectReclamationByTime(Date date) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where heure=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setTime(1, new java.sql.Time(date.getTime()));
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public Reclamation selectReclamationByTitre(String titre) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        Reclamation r;
        String requete = "select * from reclamation where titre=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setString(1, titre);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                r = new Reclamation();
                r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                return r;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
        return null;
    }

    public List<Reclamation> selectReclamationByIdCitoyen(int idCitoyen) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where idcitoyen=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idCitoyen);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> selectReclamationByIdDomaine(int idDomaine) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where iddomaine=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idDomaine);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> selectReclamationByEtat(int etat) {
        LieuDao lieuDao = new LieuDao();
        UtilisateurDao utilisateurDao = new UtilisateurDao();
        DomaineDao domaineDao = new DomaineDao();
        List<Reclamation> listReclamation = new ArrayList<Reclamation>();
        String requete = "select * from reclamation where etat=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, etat);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
               Reclamation r = new Reclamation();
                r.setId(resultat.getInt("id"));
                r.setLieu(lieuDao.selectLieuById(resultat.getInt("idlieu")));
                r.setDate(resultat.getDate("date"));
                r.setHeure(resultat.getTime("heure"));
                r.setDescription(resultat.getString("description"));
                r.setTitre(resultat.getString("titre"));
                r.setCitoyen(utilisateurDao.selectUserById(resultat.getInt("idcitoyen")));
                r.setDomaine(domaineDao.selectDomaineById(resultat.getInt("iddomaine")));
                r.setEtat(resultat.getInt("etat"));
                listReclamation.add(r);
            }
            return listReclamation;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du reclamation " + ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param id
     */
    public boolean deleteReclamation(int id) {
        String requete = "delete from reclamation where id=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimée");
            return true;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
            return false;
        }
    }
}
