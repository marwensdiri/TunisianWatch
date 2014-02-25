/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.ChartDAO;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author DELL
 */
public class Statistique extends javax.swing.JFrame {

    /**
     * Creates new form Statistique
     */
    public void AjouterChartpanelCercelDomaine(String titre) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.createChartdomaine(titre));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public void AjouterChartpanelBarDomaine(String titre, String axeX, String axeY) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.Createbarchartlieu(titre, axeX, axeY));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public void AjouterChartpanelCercelLieu(String titre) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.createChartLieu(titre));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public void AjouterChartpanelBarLieu(String titre, String axeX, String axeY) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.Createbarchartlieu(titre, axeX, axeY));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public void AjouterChartpanelCercelEtat(String titre) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.createChartEtat(titre));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public void AjouterChartpanelBarEtat(String titre, String axeX, String axeY) {
        jPanel1.removeAll();
        ChartPanel panel = new ChartPanel(ChartDAO.Createbarchartlieu(titre, axeX, axeY));
        panel.setBounds(10, 10, 750, 560);
        jPanel1.add(panel);
        jPanel1.repaint();
    }

    public Statistique() {
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
        btn_region = new javax.swing.JButton();
        btn_domain = new javax.swing.JButton();
        btn_etat = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistique Des Reclamation");

        btn_region.setText("Par Région");
        btn_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regionActionPerformed(evt);
            }
        });

        btn_domain.setText("Par Domaine");
        btn_domain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_domainActionPerformed(evt);
            }
        });

        btn_etat.setText("Par Etat");
        btn_etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_etatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_domain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_region, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_etat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_region, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_domain, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_etat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jLayeredPane2.add(jPanel1);
        jPanel1.setBounds(10, 10, 750, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_domainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_domainActionPerformed
        AjouterChartpanelCercelDomaine("Statistique par Domaines");
    }//GEN-LAST:event_btn_domainActionPerformed

    private void btn_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regionActionPerformed
        // TODO add your handling code here:
        AjouterChartpanelBarLieu("Statistique par Régions", "Régions", "Freqence des Reclamations");
    }//GEN-LAST:event_btn_regionActionPerformed

    private void btn_etatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_etatActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_etatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistique().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btn_domain;
    private javax.swing.JButton btn_etat;
    private javax.swing.JButton btn_region;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}