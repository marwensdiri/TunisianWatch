/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.Geoloc;
import com.tunisianwatch.Dao.LieuDao;
import com.tunisianwatch.Entities.Geolocalisation;
import com.tunisianwatch.Entities.Lieu;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static String lieu = null;
    public static Geolocalisation geo = null;

    public geoJFrame() {
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

        jMapViewer1 = new org.openstreetmap.gui.jmapviewer.JMapViewer();
        Map = new org.openstreetmap.gui.jmapviewer.JMapViewer();
        Efface = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapMouseClicked(evt);
            }
        });

        Efface.setText("Efface");
        Efface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EffaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Efface))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Efface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Map, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapMouseClicked
        // TODO add your handling code here:
        double maplat = Map.getPosition(evt.getPoint()).getLat();
        double maplon = Map.getPosition(evt.getPoint()).getLon();
        geo = new Geolocalisation();
       

        if (MouseEvent.BUTTON1 == evt.getButton()) {
            try {

                URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?latlng=" + maplat + "," + maplon + "&sensor=false");
                ObjectMapper parserMap = new ObjectMapper();
                Geoloc geoloc = parserMap.readValue(url, Geoloc.class);
                
                System.out.println(geoloc.getResults().size());
                if (geoloc.getResults().size() > 3) {
                    lieu = geoloc.getResults().get(2).getFormatted_address();
                    StringTokenizer str = new StringTokenizer(lieu,",");
                    lieu=str.nextToken();
                } else {
                    lieu = geoloc.getResults().get(1).getFormatted_address();
                    StringTokenizer str = new StringTokenizer(lieu,",");
                    lieu=str.nextToken();
                }

                MapMarkerDot map = new MapMarkerDot(lieu, new Coordinate(maplat, maplon));
                Map.addMapMarker(map);
                
                geo.setLat(maplat);
                geo.setLon(maplon);

            } catch (MalformedURLException ex) {
                Logger.getLogger(geoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(geoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MapMouseClicked

    private void EffaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EffaceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EffaceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Efface;
    private org.openstreetmap.gui.jmapviewer.JMapViewer Map;
    private org.openstreetmap.gui.jmapviewer.JMapViewer jMapViewer1;
    // End of variables declaration//GEN-END:variables
}
