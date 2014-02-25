/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

import java.awt.Dimension;

/**
 *
 * @author asd
 */
public class AcceuilPanel extends javax.swing.JPanel {

    /**
     * Creates new form Acceul
     */
    
    public AcceuilPanel() {
        initComponents();
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
        etablissementButton = new javax.swing.JButton();
        reclamationButton = new javax.swing.JButton();
        citoyenButton = new javax.swing.JButton();
        responsableButton = new javax.swing.JButton();
        responsableButton1 = new javax.swing.JButton();
        statButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(870, 500));

        bodyPanel.setBackground(new java.awt.Color(204, 204, 204));

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reclamationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etablissementButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(responsableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(responsableButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(citoyenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(responsableButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reclamationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etablissementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(citoyenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
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

    private void etablissementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etablissementButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("etablissement"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_etablissementButtonActionPerformed

    private void reclamationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("reclamation"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_reclamationButtonActionPerformed

    private void citoyenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citoyenButtonActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new ConsultationPanel("citoyen"));
        contentPanel.repaint();
        contentPanel.revalidate();
    }//GEN-LAST:event_citoyenButtonActionPerformed

    private void responsableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsableButtonActionPerformed

    private void responsableButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsableButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsableButton1ActionPerformed

    private void statButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton citoyenButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton etablissementButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton reclamationButton;
    private javax.swing.JButton responsableButton;
    private javax.swing.JButton responsableButton1;
    private javax.swing.JButton statButton;
    // End of variables declaration//GEN-END:variables
}
