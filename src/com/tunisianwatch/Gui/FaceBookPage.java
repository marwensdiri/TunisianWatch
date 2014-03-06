/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Entities.CommentFaceBook;
import com.tunisianwatch.Entities.StatusFaceBook;
import fbConnect.GraphReader;
import java.util.Date;
import java.util.List;

/**
 *
 * @author asd
 */
public class FaceBookPage extends javax.swing.JPanel implements Runnable {

    List<StatusFaceBook> listStatut;

    /**
     * Creates new form FaceBookPage
     */
    public FaceBookPage() {
        initComponents();
        Thread thr = new Thread(this);
        thr.start();
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
        ScrollPane = new javax.swing.JScrollPane();
        statusListPanel = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tunisianwatch-Community"));

        javax.swing.GroupLayout statusListPanelLayout = new javax.swing.GroupLayout(statusListPanel);
        statusListPanel.setLayout(statusListPanelLayout);
        statusListPanelLayout.setHorizontalGroup(
            statusListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        statusListPanelLayout.setVerticalGroup(
            statusListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(statusListPanel);

        refreshButton.setBackground(new java.awt.Color(204, 0, 0));
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(contentPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Thread thr = new Thread(this);
        thr.start();
    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel statusListPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        listStatut = GraphReader.getStatus();
        java.awt.GridLayout grid = new java.awt.GridLayout(listStatut.size() + 1, 0, 0, 0);
        statusListPanel.setLayout(grid);
        for (StatusFaceBook status : listStatut) {
            statusListPanel.add(new StatusPanel(status));
        }
    }

    public class StatusPanel extends javax.swing.JPanel {

        //List<CommentFaceBook> listComment;
        StatusFaceBook status;
        /**
         * Creates new form StatusPanel
         */
        public StatusPanel(StatusFaceBook status) {
            initComponents();
            this.status = status;
            statusTextArea.setText(status.getMessage());
            daeContentLabel.setText(status.getDate().toString());
            List<CommentFaceBook> listComment = status.getListComment();
            likeLabel.setText(status.getNblike() + " personnes aimes ça");
            commentsPanel.add(new AddCommentairePanel(status.getId()));

            java.awt.GridLayout grid = new java.awt.GridLayout(listComment.size() + 1, 0, 0, 0);
            commentsPanel.setLayout(grid);
            for (CommentFaceBook comment : listComment) {
                commentsPanel.add(new CommentPanel(status.getId(), comment));
            }
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
       // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }// </editor-fold> 


        // Variables declaration - do not modify                     
        private javax.swing.JPanel commentsPanel;
        private javax.swing.JScrollPane commentsScrollPane;
        private javax.swing.JLabel daeContentLabel;
        private javax.swing.JLabel dateLabel;
        private javax.swing.JButton likeButton;
        private javax.swing.JScrollPane statusScrollPane;
        private javax.swing.JTextArea statusTextArea;
        private javax.swing.JLabel likeLabel;
        // End of variables declaration                   

        public class CommentPanel extends javax.swing.JPanel {

            public String idPost;

            /**
             * Creates new form statusPanel
             */
            public CommentPanel(String idPost, CommentFaceBook comment) {
                initComponents();
                commentTextArea.setText(comment.getMessage());
                dateContentLabel.setText(comment.getDate().toString());
                nomContentLabel.setText(comment.getNom());
                this.idPost = idPost;
            }

            /**
             * This method is called from within the constructor to initialize
             * the form. WARNING: Do NOT modify this code. The content of this
             * method is always regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                commentScrollPane = new javax.swing.JScrollPane();
                commentTextArea = new javax.swing.JTextArea();
                nomLabel = new javax.swing.JLabel();
                dateLabel = new javax.swing.JLabel();
                nomContentLabel = new javax.swing.JLabel();
                dateContentLabel = new javax.swing.JLabel();

                commentTextArea.setColumns(20);
                commentTextArea.setRows(5);
                commentTextArea.setMinimumSize(new java.awt.Dimension(160, 94));
                commentTextArea.setPreferredSize(new java.awt.Dimension(160, 94));
                commentScrollPane.setViewportView(commentTextArea);

                nomLabel.setText("Nom: ");

                dateLabel.setText("Date: ");

                nomContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

                dateContentLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(commentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nomLabel)
                                                        .addComponent(dateLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(dateContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                                        .addComponent(nomContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(20, 20, 20))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomLabel)
                                        .addComponent(nomContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addComponent(commentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addContainerGap())
                );
            }// </editor-fold>                                        

            // Variables declaration - do not modify                     
            private javax.swing.JScrollPane commentScrollPane;
            private javax.swing.JTextArea commentTextArea;
            private javax.swing.JLabel dateContentLabel;
            private javax.swing.JLabel dateLabel;
            private javax.swing.JLabel nomContentLabel;
            private javax.swing.JLabel nomLabel;
            // End of variables declaration                   
        }

        public class AddCommentairePanel extends javax.swing.JPanel {

            private String idPost;

            /**
             * Creates new form AddCommentairePanel
             */
            public AddCommentairePanel(String idPost) {
                initComponents();
                this.idPost = idPost;
            }

            /**
             * This method is called from within the constructor to initialize
             * the form. WARNING: Do NOT modify this code. The content of this
             * method is always regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                addButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                commentaireTextArea = new javax.swing.JTextArea();

                setPreferredSize(new java.awt.Dimension(762, 196));

                addButton.setBackground(new java.awt.Color(204, 0, 0));
                addButton.setForeground(new java.awt.Color(255, 255, 255));
                addButton.setText("Commenter");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        addButtonActionPerformed(evt);
                    }
                });

                jScrollPane1.setPreferredSize(new java.awt.Dimension(166, 96));

                commentaireTextArea.setEditable(false);
                commentaireTextArea.setColumns(20);
                commentaireTextArea.setForeground(new java.awt.Color(102, 102, 102));
                commentaireTextArea.setTabSize(0);
                commentaireTextArea.setText("Ajouter un Commentaire");
                commentaireTextArea.setMinimumSize(new java.awt.Dimension(164, 94));
                commentaireTextArea.setPreferredSize(new java.awt.Dimension(164, 94));
                commentaireTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        commentaireTextAreaMouseClicked(evt);
                    }
                });
                commentaireTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyReleased(java.awt.event.KeyEvent evt) {
                        commentaireTextAreaKeyReleased(evt);
                    }
                });
                jScrollPane1.setViewportView(commentaireTextArea);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(addButton)))
                                .addGap(20, 20, 20))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }// </editor-fold>                                                        

            private void commentaireTextAreaMouseClicked(java.awt.event.MouseEvent evt) {
                commentaireTextArea.setForeground(new java.awt.Color(0, 0, 0));
                commentaireTextArea.setText("");
                commentaireTextArea.setEditable(true);
            }

            private void commentaireTextAreaKeyReleased(java.awt.event.KeyEvent evt) {

            }

            private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
                if (commentaireTextArea.getText().length() > 0) {
                    CommentFaceBook comment = new CommentFaceBook();
                    comment.setDate(new Date());
                    comment.setMessage(commentaireTextArea.getText());
                    String id = GraphReader.addComment(idPost, commentaireTextArea.getText());
                    comment.setId(id);
                    List<CommentFaceBook> listComment = status.getListComment();
                    listComment.add(comment);
                    java.awt.GridLayout grid = new java.awt.GridLayout(listComment.size() + 1, 0, 0, 0);
                    commentsPanel.setLayout(grid);
                    commentsPanel.add(new CommentPanel(idPost, comment));
                }
            }

            // Variables declaration - do not modify                     
            private javax.swing.JButton addButton;
            private javax.swing.JTextArea commentaireTextArea;
            private javax.swing.JScrollPane jScrollPane1;
            // End of variables declaration                   
        }
    }

}
