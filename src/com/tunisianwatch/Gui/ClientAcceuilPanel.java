/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.fbConnect.GraphReader;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asd
 */
public class ClientAcceuilPanel extends javax.swing.JPanel {

    /**
     * Creates new form Acceul
     */
    public ClientAcceuilPanel() {
        initComponents();
        if(!GraphReader.isConnect()){
            fbButton.hide();
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

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        profilButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        DisconnectButton = new javax.swing.JButton();
        reclamationAddButton = new javax.swing.JButton();
        mailButton = new javax.swing.JButton();
        myReclamationButton = new javax.swing.JButton();
        reclamationButton = new javax.swing.JButton();
        fbButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        backgroundLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(870, 500));

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        profilButton.setBackground(new java.awt.Color(204, 0, 0));
        profilButton.setForeground(new java.awt.Color(255, 255, 255));
        profilButton.setText("Profil");
        profilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/tw_logo_74x165.png"))); // NOI18N

        DisconnectButton.setBackground(new java.awt.Color(204, 0, 0));
        DisconnectButton.setForeground(new java.awt.Color(255, 255, 255));
        DisconnectButton.setText("Déconnexion");
        DisconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectButtonActionPerformed(evt);
            }
        });

        reclamationAddButton.setBackground(new java.awt.Color(204, 0, 0));
        reclamationAddButton.setForeground(new java.awt.Color(255, 255, 255));
        reclamationAddButton.setText("Ajouter une Reclamation");
        reclamationAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationAddButtonActionPerformed(evt);
            }
        });

        mailButton.setBackground(new java.awt.Color(204, 0, 0));
        mailButton.setForeground(new java.awt.Color(255, 255, 255));
        mailButton.setText("Contacter un responsable");
        mailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailButtonActionPerformed(evt);
            }
        });

        myReclamationButton.setBackground(new java.awt.Color(204, 0, 0));
        myReclamationButton.setForeground(new java.awt.Color(255, 255, 255));
        myReclamationButton.setText("Mes Reclamations");
        myReclamationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myReclamationButtonActionPerformed(evt);
            }
        });

        reclamationButton.setBackground(new java.awt.Color(204, 0, 0));
        reclamationButton.setForeground(new java.awt.Color(255, 255, 255));
        reclamationButton.setText("Reclamations");
        reclamationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationButtonActionPerformed(evt);
            }
        });

        fbButton.setBackground(new java.awt.Color(204, 0, 0));
        fbButton.setForeground(new java.awt.Color(255, 255, 255));
        fbButton.setText("Page FB");
        fbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(DisconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reclamationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(myReclamationButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reclamationAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profilButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(mailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(fbButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reclamationAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myReclamationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reclamationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DisconnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contentPanel.setLayout(new java.awt.CardLayout());

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tunisianwatch/Images/background.png"))); // NOI18N
        contentPanel.add(backgroundLabel, "card2");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void profilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilButtonActionPerformed
        // TODO add your handling code here:
        contentPanel.removeAll();
        contentPanel.add(new ProfilPanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_profilButtonActionPerformed

    private void DisconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectButtonActionPerformed
        MainFrame.getInstance().dispose();
        new Authentification().setVisible(true);
    }//GEN-LAST:event_DisconnectButtonActionPerformed

    private void reclamationAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationAddButtonActionPerformed
       
            contentPanel.removeAll();
            contentPanel.add(new ReclamationForm());
            contentPanel.repaint();
            contentPanel.revalidate();
       
    }//GEN-LAST:event_reclamationAddButtonActionPerformed

    private void mailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ContactezResp());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_mailButtonActionPerformed

    private void myReclamationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myReclamationButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("mes reclamations"));
        contentPanel.repaint();
        contentPanel.revalidate();

    }//GEN-LAST:event_myReclamationButtonActionPerformed

    private void reclamationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("reclamation"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_reclamationButtonActionPerformed

    private void fbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new FaceBookPage());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_fbButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisconnectButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton fbButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton mailButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton myReclamationButton;
    private javax.swing.JButton profilButton;
    private javax.swing.JButton reclamationAddButton;
    private javax.swing.JButton reclamationButton;
    // End of variables declaration//GEN-END:variables
}
