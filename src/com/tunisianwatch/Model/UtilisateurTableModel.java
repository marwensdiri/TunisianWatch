/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Model;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Khadija
 */
public class UtilisateurTableModel extends ConsultationTableModel {

    private UtilisateurDao utilisateurDao = new UtilisateurDao();
    private String title1[] = {"Nom", "Prénom", "login", "sexe", "Age"};
    private String title2[] = {"Nom", "Prénom", "login", "sexe", "Age", "Etablissement"};
    private char type;
    private List<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>();
    private List<Utilisateur> listResultSearch = new ArrayList<Utilisateur>();
    private boolean searching = false;

    public UtilisateurTableModel(char type) {
        this.listUtilisateur = utilisateurDao.selectUserByType(type);
        this.type = type;
    }

    @Override
    public int getRowCount() {
        if (searching && listResultSearch.size() > 0) {
            return listResultSearch.size();
        } else if (searching && listResultSearch.size() == 0) {
            return 0;
        } else {
            return listUtilisateur.size();
        }
    }

    @Override
    public int getColumnCount() {
        if (type == 'C') {
            return title1.length;
        } else {
            return title2.length;
        }

    }

    //bloc de methodes personalisées
    public void refresh() {
        listResultSearch = new ArrayList<Utilisateur>();
        this.listUtilisateur = utilisateurDao.selectUserByType(type);
    }

    @Override
    public Object getElementAt(int row) {
        return listUtilisateur.get(row);
    }

    public void removeRows(List elements) {

        List<Utilisateur> utilisateurs = (List<Utilisateur>) elements;
        for (int i = 0; i < utilisateurs.size(); i++) {
            listUtilisateur.remove(utilisateurs.get(i));
        }
    }

    public void initSearch(String searchString, int searchIndex) {
        listResultSearch = new ArrayList<Utilisateur>();
        if (searchString.length() > 0) {
            searching = true;
            for (Utilisateur utilisateur : listUtilisateur) {
                if (searchIndex == 0) {
                    if (utilisateur.getNom() != null) {
                        if (utilisateur.getNom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(utilisateur);
                        }
                    }
                } else if (searchIndex == 1) {
                    if (utilisateur.getPrenom() != null) {
                        if (utilisateur.getPrenom().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(utilisateur);
                        }
                    }
                } else if (searchIndex == 2) {
                    if (utilisateur.getLogin() != null) {
                        if (utilisateur.getLogin().toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                            listResultSearch.add(utilisateur);
                        }
                    }
                } else if (searchIndex == 3) {
                    if ((utilisateur.getSexe() + "").toUpperCase().matches("(.*)" + searchString.toUpperCase() + "(.*)")) {
                        listResultSearch.add(utilisateur);
                    }

                } else if (searchIndex == 4) {
                    if ((utilisateur.getAge() + "").matches("(.*)" + searchString + "(.*)")) {
                        listResultSearch.add(utilisateur);

                    } else if (searchIndex == 5 && type == 'R') {
                        if (utilisateur.getEtablissement() != null) {
                            if ((utilisateur.getEtablissement().getNom()).matches("(.*)" + searchString + "(.*)")) {
                                listResultSearch.add(utilisateur);
                            }
                        }
                    }
                }

            }
        } else {
            searching = false;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Utilisateur utilisateur = null;
        if (listResultSearch.size() > 0) {
            utilisateur = listResultSearch.get(rowIndex);
        } else {
            utilisateur = listUtilisateur.get(rowIndex);
        }
        if (columnIndex == 0) {
            return utilisateur.getNom();
        } else if (columnIndex == 1) {
            return utilisateur.getPrenom();
        } else if (columnIndex == 2) {
            return utilisateur.getLogin();
        } else if (columnIndex == 3) {
            return utilisateur.getSexe();
        } else if (columnIndex == 4) {
            return utilisateur.getAge();
        } else if (type == 'R') {
            if (columnIndex == 5) {
                return utilisateur.getEtablissement();
            }
        }
        return null;
    }

    public String getColumnName(int col) {
        if (type == 'C') {
            return this.title1[col];
        } else {
            return this.title2[col];
        }
    }
}
