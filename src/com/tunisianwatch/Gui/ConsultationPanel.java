/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Entities.Reclamation;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Model.ConsultationTableModel;
import com.tunisianwatch.Model.EtablissementTableModel;
import com.tunisianwatch.Model.ReclamationTableModel;
import com.tunisianwatch.Model.UtilisateurTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author asd
 */
public class ConsultationPanel extends javax.swing.JPanel {

    private ConsultationTableModel tableModel;
    private ListSelectionModel lsm;
    private String type;
    /**
     * Creates new form reclamationPanel
     */
    public ConsultationPanel(String type) {
        this.type = type;
        initComponents();
        if (type.equals("etablissement")) {
            tableModel = new EtablissementTableModel();
            CategComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Nom", "Lieu", "Responsable", "Domaine"}));
            contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des Etablissements"));
        } else if (type.equals("reclamation")) {
            ajoutButton.hide();
            tableModel = new ReclamationTableModel();
            CategComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Titre", "Description", "Lieu", "Date", "Heure", "Domaines", "Citoyen", "Etat"}));
            contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des Réclamations"));
        } else if(type.equals("citoyen")){
             tableModel = new UtilisateurTableModel('C');
             CategComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Nom", "Prénom", "login", "sexe", "Age"}));
        } else if(type.equals("responsable")){
             tableModel = new UtilisateurTableModel('R');
             CategComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Nom", "Prénom", "login", "sexe", "Age","Etablissement"}));
        }
        consultationTable.setModel(tableModel);
        consultationTable.getSelectionModel().addListSelectionListener(new ReclamationTableListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        corePanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        CategComboBox = new javax.swing.JComboBox();
        rechercheTextField = new javax.swing.JTextField();
        rechercheLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        consultationTable = new javax.swing.JTable();
        ajoutButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        corePanel.setLayout(new java.awt.CardLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        CategComboBox.setBackground(new java.awt.Color(204, 0, 0));
        CategComboBox.setForeground(new java.awt.Color(255, 255, 255));
        CategComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategComboBoxActionPerformed(evt);
            }
        });

        rechercheTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheTextFieldKeyReleased(evt);
            }
        });

        rechercheLabel.setText("Recherche");

        refreshButton.setBackground(new java.awt.Color(204, 0, 0));
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("rafraichir");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane.setViewportView(consultationTable);

        ajoutButton.setBackground(new java.awt.Color(204, 0, 0));
        ajoutButton.setForeground(new java.awt.Color(255, 255, 255));
        ajoutButton.setText("Ajouter");
        ajoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutButtonActionPerformed(evt);
            }
        });

        modifierButton.setBackground(new java.awt.Color(204, 0, 0));
        modifierButton.setForeground(new java.awt.Color(255, 255, 255));
        if(type.equals("reclamation")){
            modifierButton.setText("Apérçu");
        }
        else{
            modifierButton.setText("Modifier");
        }
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        supprimerButton.setBackground(new java.awt.Color(204, 0, 0));
        supprimerButton.setForeground(new java.awt.Color(255, 255, 255));
        supprimerButton.setText("Supprimer");
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(rechercheLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechercheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CategComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(ajoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supprimerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheLabel)
                    .addComponent(CategComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimerButton)
                    .addComponent(modifierButton)
                    .addComponent(ajoutButton))
                .addContainerGap())
        );

        corePanel.add(contentPanel, "card3");

        add(corePanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheTextFieldKeyReleased
        tableModel.initSearch(rechercheTextField.getText(), CategComboBox.getSelectedIndex());
        tableModel.fireTableDataChanged();
    }//GEN-LAST:event_rechercheTextFieldKeyReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        tableModel.refresh();
        tableModel.fireTableDataChanged();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
        if (lsm == null) {
            JOptionPane.showMessageDialog(null, "Selectionner au moin une ligne", "Erreur de Selection", JOptionPane.ERROR_MESSAGE);
        } else {
            // Find out which indexes are selected.
            int minIndex = lsm.getMinSelectionIndex();
            int maxIndex = lsm.getMaxSelectionIndex();
            List elements = new ArrayList();
            for (int i = minIndex; i <= maxIndex; i++) {
                if (lsm.isSelectedIndex(i)) {
                    Object element = tableModel.getElementAt(i);
                    elements.add(element);
                    //new ReclamationDao().deleteReclamation(etabTmp.getId());
                }
            }
            tableModel.removeRows(elements);
            tableModel.fireTableDataChanged();
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

    private void CategComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategComboBoxActionPerformed

    private void ajoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutButtonActionPerformed
        switch (type) {
            case "citoyen":
          new CitoyenForm().show();
                break;
            case "responsable":
                new   ResponsableForm().show();
                break;
        }
    }//GEN-LAST:event_ajoutButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        if (lsm == null) {
            JOptionPane.showMessageDialog(null, "Selectionner une ligne", "Erreur de Selection", JOptionPane.ERROR_MESSAGE);
        } else {
            int minIndex = lsm.getMinSelectionIndex();
            int maxIndex = lsm.getMaxSelectionIndex();
            if ((maxIndex - minIndex) == 0) {
                Object element = tableModel.getElementAt(minIndex); 
                if (type.equals("reclamation")) {
                    new ReclamationApercuFrame(element).show();
                }
                else if(type.equals("citoyen")){
                    new CitoyenForm(element).show(); ;
                }
                else if (type.equals("responsable") ) {
                    new ResponsableForm(element).show(); ;
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selectionner une seul ligne", "Erreur de Selection", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_modifierButtonActionPerformed

    public class ReclamationTableListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            lsm = (ListSelectionModel) e.getSource();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CategComboBox;
    private javax.swing.JButton ajoutButton;
    private javax.swing.JTable consultationTable;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel corePanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton modifierButton;
    private javax.swing.JLabel rechercheLabel;
    private javax.swing.JTextField rechercheTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton supprimerButton;
    // End of variables declaration//GEN-END:variables
}
