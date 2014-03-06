/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asd
 */
public class StatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form StatusPanel
     */
    public StatusPanel() {
        initComponents();

        List<CommentPanel> listCommentPanel = new ArrayList<CommentPanel>();
        listCommentPanel.add(new CommentPanel());
        listCommentPanel.add(new CommentPanel());
        listCommentPanel.add(new CommentPanel());
        listCommentPanel.add(new CommentPanel());

        java.awt.GridLayout grid = new java.awt.GridLayout(listCommentPanel.size() + 1, 0, 0, 0);
        commentsPanel.setLayout(grid);

        if (listCommentPanel.size() == 0) {
            commentsPanel.hide();
        } else {
            for (CommentPanel panel : listCommentPanel) {
                commentsPanel.add(panel);
            }
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

        statusScrollPane = new javax.swing.JScrollPane();
        statusTextArea = new javax.swing.JTextArea();
        commentsScrollPane = new javax.swing.JScrollPane();
        commentsPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        daeContentLabel = new javax.swing.JLabel();
        likeLabel = new javax.swing.JLabel();

        statusTextArea.setColumns(20);
        statusTextArea.setRows(5);
        statusScrollPane.setViewportView(statusTextArea);

        javax.swing.GroupLayout commentsPanelLayout = new javax.swing.GroupLayout(commentsPanel);
        commentsPanel.setLayout(commentsPanelLayout);
        commentsPanelLayout.setHorizontalGroup(
            commentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        commentsPanelLayout.setVerticalGroup(
            commentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        commentsScrollPane.setViewportView(commentsPanel);

        dateLabel.setText("Date:");

        daeContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        likeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        likeLabel.setText("like");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(likeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(statusScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dateLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(daeContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(commentsScrollPane)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daeContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(statusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(likeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commentsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel commentsPanel;
    private javax.swing.JScrollPane commentsScrollPane;
    private javax.swing.JLabel daeContentLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel likeLabel;
    private javax.swing.JScrollPane statusScrollPane;
    private javax.swing.JTextArea statusTextArea;
    // End of variables declaration//GEN-END:variables

    public class CommentPanel extends javax.swing.JPanel {

        /**
         * Creates new form statusPanel
         */
        public CommentPanel() {
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            contentPanel = new javax.swing.JPanel();
            commentScrollPane = new javax.swing.JScrollPane();
            commentTextArea = new javax.swing.JTextArea();
            nomLabel = new javax.swing.JLabel();
            dateLabel = new javax.swing.JLabel();
            dateContentLabel = new javax.swing.JLabel();
            nomContentLabel = new javax.swing.JLabel();

            jLabel1.setText("jLabel1");

            setLayout(new java.awt.CardLayout());

            commentTextArea.setColumns(20);
            commentTextArea.setRows(5);
            commentScrollPane.setViewportView(commentTextArea);

            nomLabel.setText("Nom :");

            dateLabel.setText("Date:");

            dateContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

            nomContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

            javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
            contentPanel.setLayout(contentPanelLayout);
            contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap(44, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nomLabel)
                                                    .addComponent(dateLabel))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(dateContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nomContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                                    .addComponent(commentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(44, Short.MAX_VALUE))
            );
            contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(commentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            add(contentPanel, "card2");
        }// </editor-fold>                  

        // Variables declaration - do not modify                     
        private javax.swing.JScrollPane commentScrollPane;
        private javax.swing.JTextArea commentTextArea;
        private javax.swing.JPanel contentPanel;
        private javax.swing.JLabel dateContentLabel;
        private javax.swing.JLabel dateLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel nomContentLabel;
        private javax.swing.JLabel nomLabel;
        // End of variables declaration                   
    }

}
