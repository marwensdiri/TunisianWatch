/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.DomaineDao;
import com.tunisianwatch.Dao.EtablissementDao;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.Lieu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author asd
 */
public class EtablissementTableModel extends AbstractTableModel {

    private EtablissementDao etablissementDao = new EtablissementDao();
    private LieuDao lieuDao = new LieuDao();
    private String title[] = {"Nom", "Description", "Lieu"};
    private List<Etablissement> listEtablissement = new ArrayList<Etablissement>();

    public EtablissementTableModel() {
        this.listEtablissement = etablissementDao.selectEtablissements();
    }

    @Override
    public int getRowCount() {
        return listEtablissement.size();
    }

    @Override
    public int getColumnCount() {
        return title.length;
    }
    
    //bloc de methodes personalisées
    
    public Etablissement getEtablissementAt(int row){
        return listEtablissement.get(row);
    }
    
    public void removeRows(List<Etablissement> lEtab){
        for(int i=0;i<lEtab.size();i++){
            listEtablissement.remove(lEtab.get(i));
        }
    }
    
    //fin du bloc de methodes personalisées
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etablissement etablissement = listEtablissement.get(rowIndex);
        if (columnIndex == 0) {
            return etablissement.getNom();
        } else if (columnIndex == 1) {
            return etablissement.getDescription();
        } else if (columnIndex == 2) {
            Lieu lieu = lieuDao.selectLieuById(etablissement.getIdLieu());
            return lieu;
        }
        return null;
    }

    public String getColumnName(int col) {
        return this.title[col];
    }

}
