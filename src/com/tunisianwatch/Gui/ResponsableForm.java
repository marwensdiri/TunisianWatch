/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.EtablissementDao;
import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.Utilisateur;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Skan
 */
public class ResponsableForm extends javax.swing.JFrame {

    private boolean modif = false;
    private Utilisateur user;
    EtablissementDao etabblissementDao = new EtablissementDao();
    DefaultComboBoxModel<Etablissement> etablissementModel = new DefaultComboBoxModel<Etablissement>();

    public ResponsableForm(Object obj) {
        modif = true;
        this.user = (Utilisateur) obj;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modification - " + user.getNom() + "  " + user.getPrenom());
        prenomTextfield.setText(user.getNom());
        nomTextfield.setText(user.getPrenom());
        pseudoTextfield.setText(user.getLogin());
        if (user.getSexe() == 'H') {
            sexeCombox.setSelectedIndex(0);
        } else {
            sexeCombox.setSelectedIndex(1);
        }
        adrTextfield1.setText(user.getAdress());
        mailTextfield.setText(user.getMail());
        mdpTextfield.setText(user.getMdp());
        dateTextfield.setDate(user.getDateNaissance());
        //pathTextfield.setText(user.getPhoto());             il faut le maitre l'image dans un label
        submitButton.setText("Modifier");

    }

    public ResponsableForm() {
        initComponents();
        setLocationRelativeTo(null);
        List lE = new ArrayList();
        lE = etabblissementDao.selectEtablissements();
        for (Object e : lE) {
            etablissementModel.addElement((Etablissement) e);

        }
        etablissementComboBox.setModel(etablissementModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        adrTextfield1 = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etablissementComboBox = new javax.swing.JComboBox();
        adrTextfield2 = new javax.swing.JTextField();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        pseudoTextfield = new javax.swing.JTextField();
        prenomTextfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mailTextfield = new javax.swing.JTextField();
        mdpTextfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pathTextfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        parcourirToggleButton = new javax.swing.JToggleButton();
        sexeCombox = new javax.swing.JComboBox();

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Adresse :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Résponsable - Form");

        closeButton.setBackground(new java.awt.Color(204, 0, 0));
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Fermer");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(204, 0, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Ajouter");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Résponsable - Form"));

        etablissementComboBox.setBackground(new java.awt.Color(204, 0, 0));
        etablissementComboBox.setForeground(new java.awt.Color(255, 255, 255));
        etablissementComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etablissementComboBoxActionPerformed(evt);
            }
        });

        adrTextfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrTextfield2ActionPerformed(evt);
            }
        });

        dateTextfield.setDateFormatString("yyyy-MM-d");

        prenomTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextfieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Etablissement :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nom :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Sexe :");

        nomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nomTextfieldMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Prénom :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Mot de passe :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Date de naissance :");

        pathTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextfieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Pseudo :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Adresse :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Joindre photo :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Email :");

        parcourirToggleButton.setBackground(new java.awt.Color(204, 0, 0));
        parcourirToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        parcourirToggleButton.setText("Parcourir");
        parcourirToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcourirToggleButtonActionPerformed(evt);
            }
        });

        sexeCombox.setBackground(new java.awt.Color(204, 0, 0));
        sexeCombox.setForeground(new java.awt.Color(255, 255, 255));
        sexeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Homme", "Femme" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexeCombox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parcourirToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etablissementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(prenomTextfield)
                        .addComponent(mdpTextfield)
                        .addComponent(adrTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdpTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adrTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etablissementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parcourirToggleButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed

        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (!modif) {
            user = new Utilisateur();
        }
        UtilisateurDao userDao = new UtilisateurDao();

        user.setNom(prenomTextfield.getText());
        user.setPrenom(nomTextfield.getText());
        user.setLogin(pseudoTextfield.getText());
        user.setSexe(sexeCombox.getSelectedItem().toString().charAt(0));
        user.setAdress(adrTextfield1.getText());
        user.setMail(mailTextfield.getText());
        user.setMdp(mdpTextfield.getText());
        user.setDateNaissance(dateTextfield.getDate());
        //user.setPhoto(pathTextfield.getText());
        user.setType(new Character('R'));
        user.setEtablissement((Etablissement) etablissementModel.getSelectedItem());

        if (modif) {
            try {
                boolean result=false;
                if(pathTextfield.getText()!=null || !pathTextfield.getText().equals("")){
                    result=userDao.updateResponsable(user.getId(), user, pathTextfield.getText());
                }
                else{
                    result=userDao.updateResponsable(user.getId(), user);
                }
                if (result) {
                    JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
                    this.dispose();
                    ConsultationPanel.tableModel.refresh();
                    ConsultationPanel.tableModel.fireTableDataChanged();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ResponsableForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                int id;
                if(pathTextfield.getText()!=null || !pathTextfield.getText().equals("")){
                    id=userDao.insertResponsable(user, pathTextfield.getText());
                }
                else{
                    id=userDao.insertResponsable(user);
                }
                if (id > 0) {
                    JOptionPane.showMessageDialog(null, "Ajout effectuée avec succès");
                    this.dispose();
                    ConsultationPanel.tableModel.refresh();
                    ConsultationPanel.tableModel.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(null, "erreur lors de l'insertion ", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ResponsableForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void parcourirToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcourirToggleButtonActionPerformed
        JFileChooser shooser = new JFileChooser();
        shooser.showOpenDialog(null);
        File f = shooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        pathTextfield.setText(filename);
    }//GEN-LAST:event_parcourirToggleButtonActionPerformed

    private void prenomTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextfieldActionPerformed

    private void pathTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTextfieldActionPerformed

    private void nomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextfieldMouseExited
        final JTextField zone = new JTextField();
        System.out.println("test");
        zone.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String command = zone.getText();
                try {
                    float fl = Float.parseFloat(command);
                } catch (Exception ex) {
                    //zone.setText(command.substring(0, command.length()-1));
                    zone.setText("Erreur");
                }
            }
        });
    }//GEN-LAST:event_nomTextfieldMouseExited

    private void etablissementComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etablissementComboBoxActionPerformed
    }//GEN-LAST:event_etablissementComboBoxActionPerformed

    private void adrTextfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrTextfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrTextfield2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adrTextfield1;
    private javax.swing.JTextField adrTextfield2;
    private javax.swing.JButton closeButton;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JComboBox etablissementComboBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mailTextfield;
    private javax.swing.JTextField mdpTextfield;
    private javax.swing.JTextField nomTextfield;
    private javax.swing.JToggleButton parcourirToggleButton;
    private javax.swing.JTextField pathTextfield;
    private javax.swing.JTextField prenomTextfield;
    private javax.swing.JTextField pseudoTextfield;
    private javax.swing.JComboBox sexeCombox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
