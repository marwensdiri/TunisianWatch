/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.CommentaireDao;
import com.tunisianwatch.Entities.Commentaire;
import com.tunisianwatch.Entities.Reclamation;
import com.tunisianwatch.Util.ScallerImage;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author asd
 */
public class ReclamationAprecu extends javax.swing.JFrame {

    List<Image> listImage;
    int indexImage = 0;
    Reclamation reclamation;

    public ReclamationAprecu(Object obj) {
        reclamation = (Reclamation) obj;
        initComponents();
        setLocationRelativeTo(null);
        titreLabel.setText(reclamation.getTitre());
        citoyenContentLabel.setText(reclamation.getCitoyen() + "");
        lieuContentLabel.setText(reclamation.getLieu() + "");
        domaineContentLabel.setText(reclamation.getDomaine() + "");
        String etat = "";
        if (reclamation.getEtat() == 0) {
            etat = "Pas encore Réglée";
        } else if (reclamation.getEtat() == 1) {
            etat = "Réglée";
        } else if (reclamation.getEtat() == 2) {
            etat = "Fausse";
        }
        etatContentLabel.setText(etat);
        listImage = reclamation.getImages();
        if (listImage.size() > 0) {
            setImage();
        }
        List<Commentaire> commentaires = new CommentaireDao().selectCommentairesByIdReclamation(reclamation.getId());
        java.awt.GridLayout grid = new java.awt.GridLayout(commentaires.size()+1, 0, 0, 0);
        commentairePanel.setLayout(grid);
        for (Commentaire commentaire : commentaires) {
            commentairePanel.add(new CommentairePanel(commentaire));
        }
    }

    private void setImage() {
              // Image image=ScallerImage.scaleImage(listImage.get(indexImage), 670, 400);
        ImageIcon icon = new ImageIcon(listImage.get(indexImage).getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_FAST));
       // if(icon.getIconWidth()>670 && icon.getIconHeight()>400){
            
            //icon.setImage(ScallerImage.scaleImage(listImage.get(indexImage), imageLabel.getWidth(), imageLabel.getHeight()));
        //}        imageLabel.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        imageLabel.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coreScrollPane = new javax.swing.JScrollPane();
        corePanel = new javax.swing.JPanel();
        titreLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        citoyenLabel = new javax.swing.JLabel();
        lieuLabel = new javax.swing.JLabel();
        etatLabel = new javax.swing.JLabel();
        domaineLabel = new javax.swing.JLabel();
        citoyenContentLabel = new javax.swing.JLabel();
        lieuContentLabel = new javax.swing.JLabel();
        domaineContentLabel = new javax.swing.JLabel();
        etatContentLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        comsScrollPane = new javax.swing.JScrollPane();
        commentairePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        coreScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        coreScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        coreScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));
        coreScrollPane.setPreferredSize(new java.awt.Dimension(898, 478));

        titreLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreLabel.setText("Titre de la Réclamation");

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        citoyenLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        citoyenLabel.setText("Citoyen:");
        citoyenLabel.setMaximumSize(new java.awt.Dimension(45, 18));
        citoyenLabel.setMinimumSize(new java.awt.Dimension(45, 18));
        citoyenLabel.setPreferredSize(new java.awt.Dimension(45, 18));

        lieuLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lieuLabel.setText("Lieu:");

        etatLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etatLabel.setText("Etat:");

        domaineLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        domaineLabel.setText("Domaine:");
        domaineLabel.setMaximumSize(new java.awt.Dimension(51, 18));
        domaineLabel.setMinimumSize(new java.awt.Dimension(51, 18));
        domaineLabel.setPreferredSize(new java.awt.Dimension(51, 18));

        citoyenContentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lieuContentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        domaineContentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        etatContentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        descriptionScrollPane.setViewportView(descriptionTextArea);

        commentairePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Commentaires"));

        javax.swing.GroupLayout commentairePanelLayout = new javax.swing.GroupLayout(commentairePanel);
        commentairePanel.setLayout(commentairePanelLayout);
        commentairePanelLayout.setHorizontalGroup(
            commentairePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        commentairePanelLayout.setVerticalGroup(
            commentairePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        comsScrollPane.setViewportView(commentairePanel);

        nextButton.setText(">");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setText("<");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout corePanelLayout = new javax.swing.GroupLayout(corePanel);
        corePanel.setLayout(corePanelLayout);
        corePanelLayout.setHorizontalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(descriptionScrollPane)
                    .addGroup(corePanelLayout.createSequentialGroup()
                        .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(corePanelLayout.createSequentialGroup()
                                .addComponent(etatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etatContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(corePanelLayout.createSequentialGroup()
                                .addComponent(domaineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(domaineContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(corePanelLayout.createSequentialGroup()
                                .addComponent(citoyenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(citoyenContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(corePanelLayout.createSequentialGroup()
                                .addComponent(lieuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lieuContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(titreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18))
            .addGroup(corePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousButton)
                .addGap(134, 134, 134)
                .addComponent(nextButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(corePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corePanelLayout.setVerticalGroup(
            corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(citoyenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(citoyenContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lieuContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lieuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etatContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(domaineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domaineContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(corePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(nextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        coreScrollPane.setViewportView(corePanel);

        getContentPane().add(coreScrollPane, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        if (indexImage > 0) {
            indexImage--;
            setImage();
        }
    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (indexImage < listImage.size() - 1) {
            indexImage++;
            setImage();
        }
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReclamationAprecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReclamationAprecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReclamationAprecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReclamationAprecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReclamationAprecu(this).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel citoyenContentLabel;
    private javax.swing.JLabel citoyenLabel;
    private javax.swing.JPanel commentairePanel;
    private javax.swing.JScrollPane comsScrollPane;
    private javax.swing.JPanel corePanel;
    private javax.swing.JScrollPane coreScrollPane;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel domaineContentLabel;
    private javax.swing.JLabel domaineLabel;
    private javax.swing.JLabel etatContentLabel;
    private javax.swing.JLabel etatLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lieuContentLabel;
    private javax.swing.JLabel lieuLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel titreLabel;
    // End of variables declaration//GEN-END:variables

    public class CommentairePanel extends javax.swing.JPanel {

        
         private Commentaire commentaire;
        /**
         * Creates new form CommentairePanel
         */
        public CommentairePanel(Commentaire commentaire) {
            this.commentaire=commentaire;
            initComponents();
            if (commentaire.getUser().getType() == 'R') {
                auteurContentLabel.setText(commentaire.getUser() + " (Résponsable)");
            } else {
                auteurContentLabel.setText(commentaire.getUser() + "");
            }
            dateContentLabel.setText(commentaire.getDate() + "");
            commentaireTextArea.setText(commentaire.getTexte());
        }

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
            new CommentaireDao().deleteCommentaire(commentaire.getId());
            commentairePanel.remove(this);
            commentairePanel.revalidate();
            commentairePanel.repaint();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        comPanel = new javax.swing.JPanel();
        auteurContentLabel = new javax.swing.JLabel();
        dateContentLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentaireTextArea = new javax.swing.JTextArea();
        auteurLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(762, 196));

        comPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        auteurContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        auteurContentLabel.setText("pseudo");

        dateContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dateContentLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateContentLabel.setText("date");

        deleteButton.setBackground(new java.awt.Color(204, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Supprimer");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        commentaireTextArea.setEditable(false);
        commentaireTextArea.setColumns(20);
        commentaireTextArea.setTabSize(0);
        jScrollPane1.setViewportView(commentaireTextArea);

        auteurLabel.setText("Auteur:");

        DateLabel.setText("Date:");

        javax.swing.GroupLayout comPanelLayout = new javax.swing.GroupLayout(comPanel);
        comPanel.setLayout(comPanelLayout);
        comPanelLayout.setHorizontalGroup(
            comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(comPanelLayout.createSequentialGroup()
                        .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateLabel)
                            .addComponent(auteurLabel))
                        .addGap(18, 18, 18)
                        .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comPanelLayout.createSequentialGroup()
                                .addComponent(auteurContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(deleteButton))
                            .addGroup(comPanelLayout.createSequentialGroup()
                                .addComponent(dateContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        comPanelLayout.setVerticalGroup(
            comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auteurContentLabel)
                    .addComponent(deleteButton)
                    .addComponent(auteurLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>                    

        // Variables declaration - do not modify                     
        private javax.swing.JLabel DateLabel;
        private javax.swing.JLabel auteurContentLabel;
        private javax.swing.JLabel auteurLabel;
        private javax.swing.JPanel comPanel;
        private javax.swing.JTextArea commentaireTextArea;
        private javax.swing.JPanel contentPanel;
        private javax.swing.JLabel dateContentLabel;
        private javax.swing.JButton deleteButton;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator;
    // End of variables declaration                   
    }

}