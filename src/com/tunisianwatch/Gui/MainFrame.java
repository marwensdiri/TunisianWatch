/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asd
 */
public class MainFrame extends javax.swing.JFrame {

    
    public static int id;
    /**
     * Creates new form MainFrame
     */
    
    
    
    public MainFrame(int id) {
        initComponents();
        setLocationRelativeTo(null);
        MainFrame.id=id;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        etablissementButton = new javax.swing.JButton();
        reclamationButton = new javax.swing.JButton();
        citoyenButton = new javax.swing.JButton();
        responsableButton = new javax.swing.JButton();
        responsableButton1 = new javax.swing.JButton();
        statButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        DisconnectButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tunisianwatch");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel.setBackground(new java.awt.Color(204, 204, 204));
        jPanel.setName(""); // NOI18N
        jPanel.setPreferredSize(new java.awt.Dimension(870, 500));

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etablissementButton.setBackground(new java.awt.Color(204, 0, 0));
        etablissementButton.setForeground(new java.awt.Color(255, 255, 255));
        etablissementButton.setText("Gestion des Etablissements");
        etablissementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etablissementButtonActionPerformed(evt);
            }
        });

        reclamationButton.setBackground(new java.awt.Color(204, 0, 0));
        reclamationButton.setForeground(new java.awt.Color(255, 255, 255));
        reclamationButton.setText("Gestion des Reclamations");
        reclamationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationButtonActionPerformed(evt);
            }
        });

        citoyenButton.setBackground(new java.awt.Color(204, 0, 0));
        citoyenButton.setForeground(new java.awt.Color(255, 255, 255));
        citoyenButton.setLabel("Gestion des Citoyens");
        citoyenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citoyenButtonActionPerformed(evt);
            }
        });

        responsableButton.setBackground(new java.awt.Color(204, 0, 0));
        responsableButton.setForeground(new java.awt.Color(255, 255, 255));
        responsableButton.setText("Gestion des Résponsables");
        responsableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsableButtonActionPerformed(evt);
            }
        });

        responsableButton1.setBackground(new java.awt.Color(204, 0, 0));
        responsableButton1.setForeground(new java.awt.Color(255, 255, 255));
        responsableButton1.setText("Profil");
        responsableButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsableButton1ActionPerformed(evt);
            }
        });

        statButton.setBackground(new java.awt.Color(204, 0, 0));
        statButton.setForeground(new java.awt.Color(255, 255, 255));
        statButton.setText("Génération des Statistiques");
        statButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statButtonActionPerformed(evt);
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

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(responsableButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(responsableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(citoyenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reclamationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etablissementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsableButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reclamationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etablissementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(citoyenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(responsableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisconnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectButtonActionPerformed
        this.dispose();
        new Authentification().show();
    }//GEN-LAST:event_DisconnectButtonActionPerformed

    private void statButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new StatistiquePanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_statButtonActionPerformed

    private void responsableButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableButton1ActionPerformed
        // TODO add your handling code here:
        contentPanel.removeAll();
        contentPanel.add(new ProfilPanel());
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_responsableButton1ActionPerformed

    private void responsableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("responsable"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_responsableButtonActionPerformed

    private void citoyenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citoyenButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("citoyen"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_citoyenButtonActionPerformed

    private void reclamationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("reclamation"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_reclamationButtonActionPerformed

    private void etablissementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etablissementButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("etablissement"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_etablissementButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisconnectButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton citoyenButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton etablissementButton;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton reclamationButton;
    private javax.swing.JButton responsableButton;
    private javax.swing.JButton responsableButton1;
    private javax.swing.JButton statButton;
    // End of variables declaration//GEN-END:variables

    
}
