/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.EtablissementDao;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Etablissement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class EtablissementTableModel extends ConsultationTableModel {

    private EtablissementDao etablissementDao = new EtablissementDao();
    private LieuDao lieuDao = new LieuDao();
    private String title[] = {"Nom", "Description", "Lieu", "Responsable", "Domaines"};
    private List<Etablissement> listEtablissement = new ArrayList<Etablissement>();
    private List<Etablissement> listResultSearch = new ArrayList<Etablissement>();
    private boolean searching = false;

    public EtablissementTableModel() {
        this.listEtablissement = etablissementDao.selectEtablissements();
    }

    @Override
    public int getRowCount() {
        if (searching && listResultSearch.size() > 0) {
            return listResultSearch.size();
        } else if (searching && listResultSearch.size() == 0) {
            return 0;
        } else {
            return listEtablissement.size();
        }
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

    public Etablissement getElementAt(int row) {
        return listEtablissement.get(row);
    }

    public boolean removeRows(List elements) {
        boolean done=true;
        List<Etablissement> lEtab = (List<Etablissement>) elements;
        for (int i = 0; i < lEtab.size(); i++) {
            etablissementDao.deleteEtablissement(lEtab.get(i).getId());
            if(!listEtablissement.remove(lEtab.get(i)))
                done=false;
        }
        return done;
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Etablissement>();
        if (searchString.length() > 0) {
            searching = true;
            for (Etablissement etablissement : listEtablissement) {
                if (searchIndex == 0) {
                    if (etablissement.getNom() != null) {
                        if (etablissement.getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(etablissement);
                        }
                    }
                } else if (searchIndex == 1) {
                    if (etablissement.getLieu() != null) {
                        if (etablissement.getLieu().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(etablissement);
                        }
                    }
                } else if (searchIndex == 2) {
                    if (etablissement.getResponsable() != null) {
                        if (etablissement.getResponsable().getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(etablissement);
                        }
                    }
                } else if (searchIndex == 3) {
                    List<Domaine> listDomaine = etablissement.getListDomaine();
                    for (int i = 0; i < listDomaine.size(); i++) {
                        if (listDomaine.get(i).getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(etablissement);
                            break;
                        }
                    }
                }
            }
        } else {
            searching = false;
        }
    }

//fin du bloc de methodes personalisées
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etablissement etablissement = null;
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
        } else if (columnIndex == 3) {
            return etablissement.getResponsable();
        } else if (columnIndex == 4) {
            String domaines = "";
            List<Domaine> listDomaine = etablissement.getListDomaine();
            for (int i = 0; i < listDomaine.size(); i++) {
                domaines += listDomaine.get(i).getNom();
                if (i != listDomaine.size() - 1) {
                    domaines += ",";
                }
            }
            return domaines;
        }
        return null;
    }

    public String getColumnName(int col) {
        return this.title[col];
    }

}
