/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Entities.Lieu;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;


/**
 *
 * @author DELL
 */
public class geoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form geoJFrame
     */
    private String tmplieu = null;
    public geoJFrame() {
        initComponents();
        LieuDao lieux = new LieuDao();
        List<Lieu> listlieu = lieux.selectLieux();
      
        for (Lieu lieu : listlieu) {
            MapMarkerDot map = new MapMarkerDot(lieu.getNom(), new Coordinate(lieu.getLat(), lieu.getLon()));
            Map.addMapMarker(map);
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

        jMapViewer1 = new org.openstreetmap.gui.jmapviewer.JMapViewer();
        Map = new org.openstreetmap.gui.jmapviewer.JMapViewer();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Map, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapMouseClicked
        // TODO add your handling code here:
        if (MouseEvent.BUTTON1 == evt.getButton()) {
            tmplieu = JOptionPane.showInputDialog("le nom de votre reclamation");
            System.out.println(tmplieu);
            if(!tmplieu.isEmpty()){
            MapMarkerDot map = new MapMarkerDot(tmplieu, new Coordinate(Map.getPosition(evt.getPoint()).getLat(), Map.getPosition(evt.getPoint()).getLon()));
            Map.addMapMarker(map);
            Lieu lieu = new Lieu(tmplieu, Map.getPosition(evt.getPoint()).getLat(), Map.getPosition(evt.getPoint()).getLon());
            LieuDao geo = new LieuDao();
            geo.insertLieu(lieu);
            }else
            {
                JOptionPane.showMessageDialog(null, "Erreur de localisation", "Enter le lieu de Reclamation", WIDTH);
            }


        }
    }//GEN-LAST:event_MapMouseClicked

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
            java.util.logging.Logger.getLogger(geoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(geoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(geoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(geoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new geoJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openstreetmap.gui.jmapviewer.JMapViewer Map;
    private org.openstreetmap.gui.jmapviewer.JMapViewer jMapViewer1;
    // End of variables declaration//GEN-END:variables
}
