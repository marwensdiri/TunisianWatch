/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MekniAymen
 */
public class ProfilPanel extends javax.swing.JPanel {

    //String PathImage = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\TunisianWatch\\src\\com\\tunisianwatch\\Images\\avatar.png";
    String PathImage = null;
    Utilisateur logger = MainFrame.getMe();
    Boolean modif = null;

    /**
     * Creates new form ProfilPanel
     */
    public ProfilPanel() {
        initComponents();
        //lblUser.setText(logger.getNom() + " " + logger.getPrenom());
        contentPanel.setName("Profil " + logger.getNom() + " " + logger.getPrenom());
        nomTextfield.setText(logger.getNom());
        prenomTextfield.setText(logger.getPrenom());
        pseudoTextfield.setText(logger.getLogin());
        mdpTextfield.setText(logger.getMdp());
        mdp2Textfield.setText(logger.getMdp());
        mailTextfield.setText(logger.getMail());
        if (logger.getSexe() == 'H') {
            sexeCombox.setSelectedIndex(0);
        } else {
            sexeCombox.setSelectedIndex(1);
        }
        
        adrTextfield.setText(logger.getAdress());
        dateTextfield.setDate(logger.getDateNaissance());

        lblImage.setBounds(lblImage.getX(), lblImage.getY(), 250, 250);                 //affecter la width,heigth
        //JOptionPane.showConfirmDialog(null, lblImage.getWidth()+" "+ lblImage.getHeight());//test unitaire
        lblImage.removeAll();
        if (logger.getPhoto() != null) {
            ImageIcon icon = new ImageIcon(logger.getPhoto().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_FAST));
            lblImage.setIcon(icon);
        }
        else{
           lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png")));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomTextfield = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        prenomTextfield = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnModifphoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pseudoTextfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mdpTextfield = new javax.swing.JTextField();
        mailTextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sexeCombox = new javax.swing.JComboBox();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        mdp2Textfield = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrTextfield = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profils", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        contentPanel.setAutoscrolls(true);
        contentPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contentPanel.setPreferredSize(new java.awt.Dimension(870, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nom ");

        nomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nomTextfieldMouseExited(evt);
            }
        });

        btnModifier.setBackground(new java.awt.Color(204, 0, 0));
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAnnuler.setBackground(new java.awt.Color(204, 0, 0));
        btnAnnuler.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Prenom");

        prenomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prenomTextfieldMouseExited(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnModifphoto.setBackground(new java.awt.Color(204, 0, 0));
        btnModifphoto.setForeground(new java.awt.Color(255, 255, 255));
        btnModifphoto.setText("Modif Photo");
        btnModifphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifphotoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Login");

        pseudoTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pseudoTextfieldMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nouveau Mot de Passe");

        mdpTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mdpTextfieldMouseExited(evt);
            }
        });

        mailTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailTextfieldMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("E-Mail");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Sexe");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Date de Naissance");

        sexeCombox.setBackground(new java.awt.Color(204, 0, 0));
        sexeCombox.setForeground(new java.awt.Color(255, 255, 255));
        sexeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Homme", "Femme" }));
        sexeCombox.setSelectedIndex(-1);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Confirmer Mot de passe");

        mdp2Textfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mdp2TextfieldMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Adresse");

        adrTextfield.setColumns(20);
        adrTextfield.setLineWrap(true);
        adrTextfield.setRows(5);
        adrTextfield.setAutoscrolls(false);
        jScrollPane1.setViewportView(adrTextfield);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Vous devez saisir votre mot de passe avant de pouvoir enregistrer ces paramètres.");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Mot de passe");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(prenomTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(mdpTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(mdp2Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(sexeCombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(dateTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModifphoto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModifphoto))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdpTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mdp2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnAnnuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(contentPanel, "card2");
        contentPanel.getAccessibleContext().setAccessibleName(""); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextfieldMouseExited
    }//GEN-LAST:event_nomTextfieldMouseExited

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        int var = JOptionPane.showConfirmDialog(null, "Voulez-vous Enregister Tes Modifications ?", "Confimation d'Enregistrement ", JOptionPane.YES_NO_OPTION);
        if (var == 0) {
            if (nomTextfield.getText().length() != 0
                    & prenomTextfield.getText().length() != 0
                    & pseudoTextfield.getText().length() != 0
                    & mdpTextfield.getText().length() != 0
                    & mdp2Textfield.getText().length() != 0
                    & dateTextfield.getDate() != null) {

                if (mdpTextfield.getText().equals(mdp2Textfield.getText())) {
                    UtilisateurDao userDao = new UtilisateurDao();

                    logger.setNom(nomTextfield.getText());
                    logger.setPrenom(prenomTextfield.getText());
                    logger.setLogin(pseudoTextfield.getText());
                    logger.setSexe(sexeCombox.getSelectedItem().toString().charAt(0));
                    logger.setAdress(adrTextfield.getText());
                    logger.setMail(mailTextfield.getText());
                    logger.setMdp(mdpTextfield.getText());
                    logger.setDateNaissance(dateTextfield.getDate());
            /////////////////////////////////////////
                    //user.setPhoto(Path);
                    /////////////////////////////////////////
                    logger.setType('A');
                    try {
                        if (PathImage == null) {
                            if (userDao.updateUser(logger.getId(), logger)) {
                                JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
                                //  lblUser.setText(logger.getNom() + " " + logger.getPrenom());
                            } else {
                                JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ", "Erreur", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {

                            if (userDao.updateUser(logger.getId(), logger, PathImage)) {
                                JOptionPane.showMessageDialog(null, "Mise à jour effectuée avec succès");
                            } else {
                                JOptionPane.showMessageDialog(null, "Erreur lors de la mise à jour ", "Erreur", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ProfilPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vous devez remplir tous les champs !!", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
            }
            this.repaint();
        }


    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
        int var = JOptionPane.showConfirmDialog(null, "Voulez-vous Annuler Tes Modification ?", "Confimation", JOptionPane.YES_NO_OPTION);
        if (var == 0) {
            logger = MainFrame.getMe();
            //   lblUser.setText(logger.getNom() + " " + logger.getPrenom());
            contentPanel.setName("Profil " + logger.getNom() + " " + logger.getPrenom());
            nomTextfield.setText(logger.getNom());
            prenomTextfield.setText(logger.getPrenom());
            pseudoTextfield.setText(logger.getLogin());
            mdpTextfield.setText(logger.getMdp());
            mdp2Textfield.setText(logger.getMdp());
            mailTextfield.setText(logger.getMail());
            if (logger.getSexe() == 'H') {
                sexeCombox.setSelectedIndex(0);
            } else {
                sexeCombox.setSelectedIndex(1);
            }
            adrTextfield.setText(logger.getAdress());
            dateTextfield.setDate(logger.getDateNaissance());

            lblImage.setBounds(lblImage.getX(), lblImage.getY(), 250, 250);                 //affecter la width,heigth
            //JOptionPane.showConfirmDialog(null, lblImage.getWidth()+" "+ lblImage.getHeight());//test unitaire
            lblImage.removeAll();
            if (logger.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(logger.getPhoto().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_FAST));
                lblImage.setIcon(icon);
            }
        }
        this.repaint();

    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void prenomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenomTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomTextfieldMouseExited

    private void btnModifphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifphotoActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser shooser = new JFileChooser();
            shooser.showOpenDialog(null);
            File f = shooser.getSelectedFile();
            PathImage = f.getAbsolutePath();

            Image Image1 = Toolkit.getDefaultToolkit().getImage(PathImage);
            ImageIcon icon = new ImageIcon(Image1.getScaledInstance(250, 250, Image.SCALE_FAST));
            lblImage.setIcon(icon);
            lblImage.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vous n'avez pas selection une image",
                    "Message d'information",
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnModifphotoActionPerformed

    private void pseudoTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pseudoTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pseudoTextfieldMouseExited

    private void mdpTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdpTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpTextfieldMouseExited

    private void mailTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextfieldMouseExited

    private void mdp2TextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mdp2TextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mdp2TextfieldMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adrTextfield;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnModifphoto;
    private javax.swing.JPanel contentPanel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField mailTextfield;
    private javax.swing.JTextField mdp2Textfield;
    private javax.swing.JTextField mdpTextfield;
    private javax.swing.JTextField nomTextfield;
    private javax.swing.JTextField prenomTextfield;
    private javax.swing.JTextField pseudoTextfield;
    private javax.swing.JComboBox sexeCombox;
    // End of variables declaration//GEN-END:variables
}
