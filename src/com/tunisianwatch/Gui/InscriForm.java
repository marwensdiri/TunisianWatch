/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Util.FieldVerifier;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class InscriForm extends javax.swing.JFrame {

    private String PathImage;

    /**
     * Creates new form InscriForm
     */
    public InscriForm() {
        initComponents();
        setLocationRelativeTo(null);
        nameErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        prenomErrorLabel.setVisible(false);
        loginErrorLabel.setVisible(false);
        mdpErrorLabel.setVisible(false);
        confirmMdpErrorLabel.setVisible(false);
        sexeErrorLabel.setVisible(false);
        mailErrorLabel.setVisible(false);
        dateErrorLabel.setVisible(false);
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
        btnSubmit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        prenomTextfield = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnModifphoto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        pseudoTextfield = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mailTextfield = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sexeCombox = new javax.swing.JComboBox();
        dateTextfield = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adrTextfield = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        mdpPasswordField = new javax.swing.JPasswordField();
        confirmMdpPasswordField = new javax.swing.JPasswordField();
        nameErrorLabel = new javax.swing.JLabel();
        prenomErrorLabel = new javax.swing.JLabel();
        loginErrorLabel = new javax.swing.JLabel();
        mdpErrorLabel = new javax.swing.JLabel();
        confirmMdpErrorLabel = new javax.swing.JLabel();
        sexeErrorLabel = new javax.swing.JLabel();
        mailErrorLabel = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscription", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        contentPanel.setAutoscrolls(true);
        contentPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contentPanel.setPreferredSize(new java.awt.Dimension(954, 481));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nom ");

        nomTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nomTextfieldMouseExited(evt);
            }
        });
        nomTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextfieldActionPerformed(evt);
            }
        });
        nomTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomTextfieldKeyReleased(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(204, 0, 0));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("s'inscrire");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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
        prenomTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomTextfieldActionPerformed(evt);
            }
        });
        prenomTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prenomTextfieldKeyReleased(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(0, 0, 0));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/avatar.png"))); // NOI18N

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
        pseudoTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pseudoTextfieldActionPerformed(evt);
            }
        });
        pseudoTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pseudoTextfieldKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nouveau Mot de Passe");

        mailTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailTextfieldMouseExited(evt);
            }
        });
        mailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextfieldActionPerformed(evt);
            }
        });
        mailTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailTextfieldKeyReleased(evt);
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
        sexeCombox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sexeComboxMouseClicked(evt);
            }
        });
        sexeCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeComboxActionPerformed(evt);
            }
        });

        dateTextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateTextfieldMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Confirmer Mot de passe");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Adresse");

        adrTextfield.setColumns(20);
        adrTextfield.setLineWrap(true);
        adrTextfield.setRows(5);
        adrTextfield.setAutoscrolls(false);
        jScrollPane1.setViewportView(adrTextfield);

        mdpPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpPasswordFieldActionPerformed(evt);
            }
        });
        mdpPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mdpPasswordFieldKeyReleased(evt);
            }
        });

        confirmMdpPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmMdpPasswordFieldActionPerformed(evt);
            }
        });
        confirmMdpPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmMdpPasswordFieldKeyReleased(evt);
            }
        });

        nameErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        nameErrorLabel.setText("Ce champ est obligatoire");

        prenomErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prenomErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        prenomErrorLabel.setText("Ce champ est obligatoire");

        loginErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        loginErrorLabel.setText("Ce champ est obligatoire");

        mdpErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mdpErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mdpErrorLabel.setText("Ce champ est obligatoire");

        confirmMdpErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmMdpErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        confirmMdpErrorLabel.setText("Ce champ est obligatoire");

        sexeErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sexeErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        sexeErrorLabel.setText("Vous devez séléctionnez votre sexe");

        mailErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mailErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        mailErrorLabel.setText("Ce champ est obligatoire");

        dateErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        dateErrorLabel.setText("Ce champ est obligatoire");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(sexeCombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mailTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(dateTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(mdpPasswordField)
                            .addComponent(confirmMdpPasswordField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(sexeErrorLabel)
                            .addComponent(confirmMdpErrorLabel)
                            .addComponent(mdpErrorLabel)
                            .addComponent(loginErrorLabel)
                            .addComponent(prenomErrorLabel)
                            .addComponent(nameErrorLabel)
                            .addComponent(mailErrorLabel)
                            .addComponent(dateErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addComponent(btnModifphoto)
                                .addGap(81, 81, 81))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifphoto))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(prenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prenomErrorLabel))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pseudoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mdpErrorLabel))
                                        .addGap(3, 3, 3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmMdpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmMdpErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexeCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexeErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailErrorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateErrorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addGap(23, 23, 23))
        );

        getContentPane().add(contentPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomTextfieldMouseExited

    }//GEN-LAST:event_nomTextfieldMouseExited

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

    private void mailTextfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextfieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextfieldMouseExited

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if(isValidNom() & isValidPrenom() & isValidMail() & isValidPass() & isValidPassConfirm() & isValidDate() & isValidPseudo()){
            UtilisateurDao userDao = new UtilisateurDao();
            Utilisateur user = new Utilisateur();

            user.setSexe(sexeCombox.getSelectedItem().toString().charAt(0));
            user.setNom(nomTextfield.getText());
            user.setPrenom(prenomTextfield.getText());
            user.setLogin(pseudoTextfield.getText());
            user.setAdress(adrTextfield.getText());
            user.setMail(mailTextfield.getText());
            user.setMdp(mdpPasswordField.getText());
            user.setDateNaissance(dateTextfield.getDate());

            user.setType('C');
            try {
                if (PathImage == null) {
                    if (userDao.insertUser(user) <= 0) {
                        JOptionPane.showMessageDialog(null, "Erreur lors de l'inscription ", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Inscirption effetée avec succèes","Bienvenu",JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    if (userDao.insertUser(user, PathImage) <= 0) {
                        JOptionPane.showMessageDialog(null, "Erreur lors de l'inscription ", "Erreur", JOptionPane.ERROR_MESSAGE);
                    } else {
                       JOptionPane.showMessageDialog(null,"Inscirption effetée avec succèes","Bienvenu",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (FileNotFoundException ex) {

            }
            this.repaint();
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void nomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextfieldKeyReleased
        isValidNom();
    }//GEN-LAST:event_nomTextfieldKeyReleased

    private void nomTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextfieldActionPerformed

    }//GEN-LAST:event_nomTextfieldActionPerformed

    private void prenomTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomTextfieldActionPerformed

    }//GEN-LAST:event_prenomTextfieldActionPerformed

    private void pseudoTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pseudoTextfieldActionPerformed

    }//GEN-LAST:event_pseudoTextfieldActionPerformed

    private void mdpPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpPasswordFieldActionPerformed

    }//GEN-LAST:event_mdpPasswordFieldActionPerformed

    private void confirmMdpPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmMdpPasswordFieldActionPerformed

    }//GEN-LAST:event_confirmMdpPasswordFieldActionPerformed

    private void sexeComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexeComboxActionPerformed

    }//GEN-LAST:event_sexeComboxActionPerformed

    private void mailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextfieldActionPerformed

    }//GEN-LAST:event_mailTextfieldActionPerformed

     private boolean isValidDate() {
        if (FieldVerifier.isNotNull((dateTextfield.getDate()))) {
            dateErrorLabel.setVisible(false);
            return true;
        } else {
            dateErrorLabel.setVisible(true);
            return false;
        }
    }

    private boolean isValidPrenom() {
        if (FieldVerifier.VerifOrdinaryField(prenomTextfield.getText(), "^([a-zA-Zéè0çôêâ']+)")) {
            prenomErrorLabel.setVisible(false);
            return true;
        } else {
            prenomErrorLabel.setText(FieldVerifier.getErrorMsg());
            prenomErrorLabel.setVisible(true);
            return false;
        }
    }
    private boolean isValidPseudo() {
        if (FieldVerifier.VerifComplexField(pseudoTextfield.getText(), 1)) {
            loginErrorLabel.setVisible(false);
            return true;
        } else {
            loginErrorLabel.setText(FieldVerifier.getErrorMsg());
            loginErrorLabel.setVisible(true);
            return false;
        }

    }

    private boolean isValidNom() {
        if (FieldVerifier.VerifOrdinaryField(nomTextfield.getText(), "^([a-zA-Zéè0çôêâ']+)")) {
            nameErrorLabel.setVisible(false);
            return true;
        } else {
            nameErrorLabel.setText(FieldVerifier.getErrorMsg());
            nameErrorLabel.setVisible(true);
            return false;
        }
    }

    
    private boolean isValidMail() {
        if (FieldVerifier.VerifOrdinaryField(mailTextfield.getText())) { //mailTextfield.getText().length() >
            if (FieldVerifier.VerifComplexField(mailTextfield.getText(), 2)) {
                mailErrorLabel.setVisible(false);
                return true;
            } else {
                mailErrorLabel.setText(FieldVerifier.getErrorMsg());
                mailErrorLabel.setVisible(true);
                return false;
            }
        } else {
            mailErrorLabel.setText(FieldVerifier.getErrorMsg());
            mailErrorLabel.setVisible(true);
            return false;
        }
    }

    
    private boolean isValidPass(){
        if (FieldVerifier.VerifComplexField(mdpPasswordField.getText(),3)) {
            mdpErrorLabel.setVisible(false);
            return true;
        } else {
            mdpErrorLabel.setText(FieldVerifier.getErrorMsg());
            mdpErrorLabel.setVisible(true);
            return false;
        }
    }
    
    private boolean isValidPassConfirm(){
         if (FieldVerifier.VerifComplexField(confirmMdpPasswordField.getText(), mdpPasswordField.getText(), 3)) {
            confirmMdpErrorLabel.setVisible(false);
            return true;
        } else {
            confirmMdpErrorLabel.setText(FieldVerifier.getErrorMsg());
            confirmMdpErrorLabel.setVisible(true);
            return false;
        }
    }
    
    
    
    private void dateTextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateTextfieldMouseClicked
        isValidDate();
    }//GEN-LAST:event_dateTextfieldMouseClicked

    private void prenomTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomTextfieldKeyReleased
       isValidPrenom();
    }//GEN-LAST:event_prenomTextfieldKeyReleased

    private void pseudoTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pseudoTextfieldKeyReleased
        isValidPseudo();
    }//GEN-LAST:event_pseudoTextfieldKeyReleased

    private void mdpPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdpPasswordFieldKeyReleased
        isValidPass();
    }//GEN-LAST:event_mdpPasswordFieldKeyReleased

    private void confirmMdpPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmMdpPasswordFieldKeyReleased
       isValidPassConfirm();
    }//GEN-LAST:event_confirmMdpPasswordFieldKeyReleased

    private void sexeComboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexeComboxMouseClicked
        
    }//GEN-LAST:event_sexeComboxMouseClicked

    private void mailTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTextfieldKeyReleased
       isValidMail();
    }//GEN-LAST:event_mailTextfieldKeyReleased

    private boolean existeMail(String mail) {
        UtilisateurDao userDao = new UtilisateurDao();
        if (userDao.selectUserByMail(mail) != null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean existeLogin(String login) {
        UtilisateurDao userDao = new UtilisateurDao();
        if (userDao.selectUserByLogin(login) != null) {
            return true;
        } else {
            return false;
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adrTextfield;
    private javax.swing.JButton btnModifphoto;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel confirmMdpErrorLabel;
    private javax.swing.JPasswordField confirmMdpPasswordField;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel dateErrorLabel;
    private com.toedter.calendar.JDateChooser dateTextfield;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JLabel mailErrorLabel;
    private javax.swing.JTextField mailTextfield;
    private javax.swing.JLabel mdpErrorLabel;
    private javax.swing.JPasswordField mdpPasswordField;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nomTextfield;
    private javax.swing.JLabel prenomErrorLabel;
    private javax.swing.JTextField prenomTextfield;
    private javax.swing.JTextField pseudoTextfield;
    private javax.swing.JComboBox sexeCombox;
    private javax.swing.JLabel sexeErrorLabel;
    // End of variables declaration//GEN-END:variables
}
