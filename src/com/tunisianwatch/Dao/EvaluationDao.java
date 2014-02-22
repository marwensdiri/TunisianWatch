package com.tunisianwatch.Dao;

import com.tunisianwatch.Connection.ResourceManager;
import com.tunisianwatch.Entities.Evaluation;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		// TODO - implement EvaluationDao.updateEvaluation
		throw new UnsupportedOperationException();
	}

	public List<Evaluation> selectEvaluations() {
		// TODO - implement EvaluationDao.selectEvaluations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Evaluation selectEvaluationById(int id) {
		// TODO - implement EvaluationDao.selectEvaluationById
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteEvaluation(int id) {
		// TODO - implement EvaluationDao.deleteEvaluation
		throw new UnsupportedOperationException();
	}

}