/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.DocumentDao;
import com.tunisianwatch.Dao.DomaineDao;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Dao.ReclamationDao;
import com.tunisianwatch.Entities.Document;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Lieu;
import com.tunisianwatch.Entities.Reclamation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author asd
 */
public class ReclamationForm extends javax.swing.JPanel {

    /**
     * Creates new form ReclamationForm
     */
    private List<File> listFile = new ArrayList<File>();

    public ReclamationForm() {
        initComponents();
        titreErrorLabel.setVisible(false);
        lieuErrorLabel.setVisible(false);
        domaineErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
        heureErrorLabel.setVisible(false);
        DefaultComboBoxModel<Lieu> lieuModel = new DefaultComboBoxModel();
        DefaultComboBoxModel<Domaine> domaineModel = new DefaultComboBoxModel();
        List<Lieu> listLieu = new LieuDao().selectLieux();
        for (Lieu L : listLieu) {
            lieuModel.addElement(L);
        }
        lieuComboBox.setModel(lieuModel);

        List<Domaine> listDomaine = new DomaineDao().selectDomaines();
        for (Domaine D : listDomaine) {
            domaineModel.addElement(D);
        }
        domaineComboBox.setModel(domaineModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titreTextfield = new javax.swing.JTextField();
        titreLabel = new javax.swing.JLabel();
        lieuLabel = new javax.swing.JLabel();
        lieuComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        domaineComboBox = new javax.swing.JComboBox();
        fileToggleButton = new javax.swing.JToggleButton();
        photoLabel = new javax.swing.JLabel();
        pathTextfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        mapButton = new javax.swing.JButton();
        descriptionLabel = new javax.swing.JLabel();
        fileLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        submitButton = new javax.swing.JButton();
        titreErrorLabel = new javax.swing.JLabel();
        lieuErrorLabel = new javax.swing.JLabel();
        domaineErrorLabel = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();
        timeTimeChooser = new lu.tudor.santec.jtimechooser.JTimeChooser();
        heureErrorLabel = new javax.swing.JLabel();
        heureLabel = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nouvelle Reclamation"));

        titreTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titreTextfieldMouseExited(evt);
            }
        });

        titreLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titreLabel.setText("Titre:");

        lieuLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lieuLabel.setText("Lieu par liste:");

        lieuComboBox.setBackground(new java.awt.Color(204, 0, 0));
        lieuComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Domaine:");

        domaineComboBox.setBackground(new java.awt.Color(204, 0, 0));
        domaineComboBox.setForeground(new java.awt.Color(255, 255, 255));

        fileToggleButton.setBackground(new java.awt.Color(204, 0, 0));
        fileToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        fileToggleButton.setText("Parcourir");
        fileToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileToggleButtonActionPerformed(evt);
            }
        });

        photoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        photoLabel.setText("Joindre photo :");

        pathTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextfieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        mapButton.setBackground(new java.awt.Color(204, 0, 0));
        mapButton.setForeground(new java.awt.Color(255, 255, 255));
        mapButton.setText("Lieu par Map");
        mapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapButtonActionPerformed(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descriptionLabel.setText("Description");

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateLabel.setText("Date de l'incident");

        dateTextfield.setDateFormatString("yyyy-MM-d");

        submitButton.setBackground(new java.awt.Color(204, 0, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Ajouter");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titreErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titreErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        titreErrorLabel.setText("Ce champ est obligatoire");

        lieuErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lieuErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        lieuErrorLabel.setText("Vous devez saisir le lieu");

        domaineErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        domaineErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        domaineErrorLabel.setText("Vous devez séléctionnez le domaine");

        dateErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        dateErrorLabel.setText("Vous devez saisir la date");

        timeTimeChooser.setBackground(new java.awt.Color(255, 255, 255));

        heureErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        heureErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        heureErrorLabel.setText("Vous devez saisir l'heure");

        heureLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        heureLabel.setText("Heure de l'incident");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(photoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lieuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heureLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fileToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lieuComboBox, 0, 155, Short.MAX_VALUE)
                                            .addComponent(domaineComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(16, 16, 16)
                                        .addComponent(mapButton)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(domaineErrorLabel)
                                    .addComponent(lieuErrorLabel)
                                    .addComponent(titreErrorLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(timeTimeChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateErrorLabel)
                                    .addComponent(heureErrorLabel))))
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(127, 127, 127)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titreErrorLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lieuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lieuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mapButton)
                    .addComponent(lieuErrorLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaineErrorLabel))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileToggleButton))
                .addGap(0, 0, 0)
                .addComponent(fileLabel)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dateErrorLabel)
                                .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(heureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(timeTimeChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(heureErrorLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void titreTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titreTextfieldMouseExited

    }//GEN-LAST:event_titreTextfieldMouseExited

    private void fileToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileToggleButtonActionPerformed

        JFileChooser shooser = new JFileChooser();
        FileFilter filtre = new FileNameExtensionFilter("Fichier JPEG", "jpg", "jpeg");
        shooser.setFileFilter(filtre);
        int res = shooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            fileLabel.setText(fileLabel.getText() + " " + shooser.getSelectedFile().getName());
            listFile.add(shooser.getSelectedFile());
        }
    }//GEN-LAST:event_fileToggleButtonActionPerformed

    private void pathTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTextfieldActionPerformed

    private void mapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // if (titreTextfield.getText().length() > 0 && lieuComboBox.getSelectedIndex() != -1 && domaineComboBox.getSelectedIndex() != -1 && dateTextfield.getDate() != null) {
        boolean ok = true;
        if (titreTextfield.getText().length() == 0) {
            titreErrorLabel.setVisible(true);
            ok = false;
        }
        if (lieuComboBox.getSelectedIndex() == -1) {
            lieuErrorLabel.setVisible(true);
            ok = false;
        }
        if (domaineComboBox.getSelectedIndex() == -1) {
            domaineErrorLabel.setVisible(true);
            ok = false;
        }
        if (dateTextfield.getDate() == null) {
            dateErrorLabel.setVisible(true);
            ok = false;
        }
        if (timeTimeChooser.getTimeField().getText() == "") {
            heureErrorLabel.setVisible(true);
            ok = false;
        }
        if (ok) {
            Lieu L = (Lieu) lieuComboBox.getSelectedItem();
            Domaine D = (Domaine) domaineComboBox.getSelectedItem();
            Reclamation reclamation = new Reclamation();
            reclamation.setLieu(L);
            reclamation.setDomaine(D);
            reclamation.setCitoyen(MainFrame.me);
            reclamation.setDate(dateTextfield.getDate());
            reclamation.setHeure(timeTimeChooser.getTimeField().getText());
            reclamation.setEtat(0);
            reclamation.setTitre(titreTextfield.getText());
            int idreclamation = new ReclamationDao().insertReclamation(reclamation);
            if (idreclamation > 0) {
                if (listFile.size() > 0){
                    DocumentDao docDao = new DocumentDao();
                    for(File file : listFile){
                        Document document = new Document();
                        document.setIdReclamation(idreclamation);
                        document.setNom(file.getName());
                        document.setType(1);
                        docDao.insertDocument(document,file.getAbsolutePath());
                    }
                }
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateErrorLabel;
    private javax.swing.JLabel dateLabel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox domaineComboBox;
    private javax.swing.JLabel domaineErrorLabel;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JToggleButton fileToggleButton;
    private javax.swing.JLabel heureErrorLabel;
    private javax.swing.JLabel heureLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox lieuComboBox;
    private javax.swing.JLabel lieuErrorLabel;
    private javax.swing.JLabel lieuLabel;
    private javax.swing.JButton mapButton;
    private javax.swing.JTextField pathTextfield;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitButton;
    private lu.tudor.santec.jtimechooser.JTimeChooser timeTimeChooser;
    private javax.swing.JLabel titreErrorLabel;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JTextField titreTextfield;
    // End of variables declaration//GEN-END:variables
}
