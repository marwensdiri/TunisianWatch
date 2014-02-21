/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

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
    private List<Etablissement> listResultSearch = new ArrayList<Etablissement>();

    public EtablissementTableModel() {
        this.listEtablissement = etablissementDao.selectEtablissements();
    }

    @Override
    public int getRowCount() {
        if (listResultSearch.size() > 0) {
            return listResultSearch.size();
        }
        return listEtablissement.size();
    }

    @Override
    public int getColumnCount() {
        return title.length;
    }

    //bloc de methodes personalisées
    public void refresh() {
        listResultSearch = new ArrayList<Etablissement>();
        this.listEtablissement = etablissementDao.selectEtablissements();
    }

    public Etablissement getEtablissementAt(int row) {
        return listEtablissement.get(row);
    }

    public void removeRows(List<Etablissement> lEtab) {
        for (int i = 0; i < lEtab.size(); i++) {
            listEtablissement.remove(lEtab.get(i));
        }
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Etablissement>();
        for (Etablissement etablissement : listEtablissement) {
            if (searchIndex == 0) {
                if (etablissement.getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                    listResultSearch.add(etablissement);
                }
            } else if (searchIndex == 1) {
                if (etablissement.getLieu().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                    listResultSearch.add(etablissement);
                }
            }
        }
    }

    //fin du bloc de methodes personalisées
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etablissement etablissement;
        if (listResultSearch.size() > 0) {
            etablissement = listResultSearch.get(rowIndex);
        } else {
            etablissement = listEtablissement.get(rowIndex);
        }
        if (columnIndex == 0) {
            return etablissement.getNom();
        } else if (columnIndex == 1) {
            return etablissement.getDescription();
        } else if (columnIndex == 2) {
            return etablissement.getLieu();
        }
        return null;
    }

    public String getColumnName(int col) {
        return this.title[col];
    }

}
