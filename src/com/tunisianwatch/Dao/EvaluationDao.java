package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Evaluation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EvaluationDao {

    /**
     *
     * @param E
     */
    public void insertEvaluation(Evaluation E) {
        String requete = "insert into evaluation (idcitoyen,idreclamation,note) value(?,?,?)";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, E.getIdCitoyen());
            ps.setInt(2, E.getIdReclamation());
            ps.setBoolean(3, E.getNote());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    /**
     *
     * @param E
     */
    public void updateEvaluation(Evaluation E) {
        String requete = "update evaluation set note=? where idcitoyen=? and idreclamation=?";
        try {
            PreparedStatement ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setBoolean(1, E.getNote());
            ps.setInt(5, E.getIdCitoyen());
            ps.setInt(6, E.getIdReclamation());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Evaluation> selectEvaluations() {
        String requete = "select * from evaluation";
        Statement statement;
        List<Evaluation> listEvaluation = new ArrayList<Evaluation>();
        try {
            statement = ResourceManager.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                Evaluation evaluation = new Evaluation(resultat.getInt("idcitoyen"), resultat.getInt("idreclamation"), resultat.getBoolean("note"));
                listEvaluation.add(evaluation);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listEvaluation;
    }

    /**
     *
     * @param id
     */
    public List<Evaluation> selectEvaluationByIdCitoyen(int idcitoyen) {
        String requete = "select * from evaluation where idcitoyen=?";
        PreparedStatement ps;
        List<Evaluation> listEvaluation = new ArrayList<Evaluation>();
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idcitoyen);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Evaluation evaluation = new Evaluation(resultat.getInt("idcitoyen"), resultat.getInt("idreclamation"), resultat.getBoolean("note"));
                listEvaluation.add(evaluation);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listEvaluation;
    }

    public List<Evaluation> selectEvaluationByIdReclamation(int idreclamation) {
        String requete = "select * from evaluation where idreclamation=?";
        PreparedStatement ps;
        List<Evaluation> listEvaluation = new ArrayList<Evaluation>();
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idreclamation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Evaluation evaluation = new Evaluation(resultat.getInt("idcitoyen"), resultat.getInt("idreclamation"), resultat.getBoolean("note"));
                listEvaluation.add(evaluation);
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return listEvaluation;
    }

    public Evaluation selectEvaluationById(int idcitoyen, int idreclamation) {
        String requete = "select * from evaluation where idcitoyen=? and idreclamation=?";
        PreparedStatement ps;
        Evaluation evaluation = null;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idcitoyen);
            ps.setInt(2, idreclamation);
            ResultSet resultat = ps.executeQuery();
            if (resultat.next()) {
                evaluation = new Evaluation(resultat.getInt("idcitoyen"), resultat.getInt("idreclamation"), resultat.getBoolean("note"));
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        return evaluation;
    }

    /**
     *
     * @param id
     */
    public void deleteEvaluation(int idcitoyen,int idreclamation) {
        String requete = "delete from evaluation where idcitoyen=? and idreclamation=?";
        PreparedStatement ps;
        try {
            ps = ResourceManager.getInstance().prepareStatement(requete);
            ps.setInt(1, idcitoyen);
            ps.setInt(2, idreclamation);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

}
