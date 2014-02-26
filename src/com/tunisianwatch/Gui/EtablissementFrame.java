package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.*;
import com.tunisianwatch.Entities.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

public class EtablissementFrame extends javax.swing.JFrame {

    private List<Domaine> listeDomainesAjouter = new ArrayList<Domaine>();
    private List<Domaine> listeDomainesExistant = new ArrayList<Domaine>();
    private DefaultComboBoxModel<Lieu> lieuModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel<Utilisateur> utilisateurModel = new DefaultComboBoxModel();
    private DefaultListModel<Domaine> domaines1Model = new DefaultListModel<Domaine>();
    private DefaultListModel<Domaine> domaines2Model = new DefaultListModel<Domaine>();
    private int action = 0;
    private Etablissement etb;

    public EtablissementFrame() {
        initComponents();
        init();
        etb = new Etablissement();
    }

    public EtablissementFrame(Object obj) {
        Etablissement etb = (Etablissement) obj;
        action = etb.getId();
        initComponents();
        nomTxtFeild.setText(etb.getNom());
        descriptionTextArea.setText(etb.getDescription());
        imageTxtFeild.setText(etb.getImage());
        for (Domaine d : etb.getListDomaine()) {
            domaines2Model.addElement(d);
            domaines1Model.removeElement(d);
        }
        submitBtn.setText("Modifer");
        utilisateurModel.setSelectedItem(etb.getResponsable());
        lieuModel.setSelectedItem(etb.getLieu());
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        labelPanel = new javax.swing.JPanel();
        nomLabel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JLabel();
        lieuPanel = new javax.swing.JLabel();
        responsablePanel = new javax.swing.JLabel();
        domainePanel = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        nomTxtFeild = new javax.swing.JTextField();
        responsableCmboBox = new javax.swing.JComboBox();
        lieuCmboBox = new javax.swing.JComboBox();
        imageTxtFeild = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        domaines1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        domaines2 = new javax.swing.JList();
        to2 = new javax.swing.JButton();
        to1 = new javax.swing.JButton();
        addDoaminLabel = new javax.swing.JLabel();
        addDomainTxtField = new javax.swing.JTextField();
        addDomainBtn = new javax.swing.JButton();
        addFileBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        nomLabel.setText("Nom :");

        descriptionPanel.setText("Description :");

        imagePanel.setText("Image :");

        lieuPanel.setText("Lieu :");

        responsablePanel.setText("Responsable :");

        domainePanel.setText("Domaines :");

        javax.swing.GroupLayout labelPanelLayout = new javax.swing.GroupLayout(labelPanel);
        labelPanel.setLayout(labelPanelLayout);
        labelPanelLayout.setHorizontalGroup(
            labelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lieuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domainePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        labelPanelLayout.setVerticalGroup(
            labelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lieuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(domainePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jScrollPane2.setViewportView(domaines1);

        jScrollPane3.setViewportView(domaines2);

        to2.setText(">");
        to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to2ActionPerformed(evt);
            }
        });

        to1.setText("<");
        to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to1ActionPerformed(evt);
            }
        });

        addDoaminLabel.setText("       Ajouter un domaine :");

        addDomainTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDomainTxtFieldActionPerformed(evt);
            }
        });

        addDomainBtn.setText("Ajouter un domaine");
        addDomainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDomainBtnActionPerformed(evt);
            }
        });

        addFileBtn.setText("...");
        addFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imageTxtFeild, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lieuCmboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                            .addComponent(responsableCmboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomTxtFeild, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(to2)
                                    .addComponent(to1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addDomainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addDomainTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(responsableCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lieuCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addDomainTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addDomainBtn))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                        .addComponent(to2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to1)
                        .addGap(55, 55, 55)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        submitBtn.setText("Envoyer");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Annuler");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(submitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileBtnActionPerformed
        JFileChooser shooser = new JFileChooser();
        shooser.showOpenDialog(null);
        File f = shooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        imageTxtFeild.setText(filename);
    }//GEN-LAST:event_addFileBtnActionPerformed

    private void to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to2ActionPerformed
        if (domaines1.getSelectedIndices().length > 0) {
            domaines2Model.addElement(domaines1Model.getElementAt(domaines1.getSelectedIndex()));
            domaines1Model.remove(domaines1.getSelectedIndex());
            
            
        }
        

    }//GEN-LAST:event_to2ActionPerformed

    private void to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to1ActionPerformed
        if (domaines2.getSelectedIndices().length > 0) {
            domaines1Model.addElement(domaines2Model.getElementAt(domaines2.getSelectedIndex()));
            domaines2Model.remove(domaines2.getSelectedIndex());
        }
        

    }//GEN-LAST:event_to1ActionPerformed

    private void addDomainTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDomainTxtFieldActionPerformed
        if (addDomainTxtField.getText() != "") {
            domaines2Model.addElement(new Domaine(addDomainTxtField.getText()));
            listeDomainesAjouter.add(new Domaine(addDomainTxtField.getText()));
        }
    }//GEN-LAST:event_addDomainTxtFieldActionPerformed

    private void addDomainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDomainBtnActionPerformed
        if (addDomainTxtField.getText() != "") {
            domaines2Model.addElement(new Domaine(addDomainTxtField.getText()));
            listeDomainesAjouter.add(new Domaine(addDomainTxtField.getText()));
        }
    }//GEN-LAST:event_addDomainBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        Object[] arr = domaines1Model.toArray();
        for(Object o : arr)
            listeDomainesAjouter.add((Domaine)o);
        EtablissementDomaineDao etabdomDAO = new EtablissementDomaineDao();
        DomaineDao domDAO = new DomaineDao();
        int id = -1;
        int idDomaineAjouter = -1;
        EtablissementDao EDAO = new EtablissementDao();
        etb.setLieu((Lieu) lieuCmboBox.getSelectedItem());
        etb.setResponsable((Utilisateur) responsableCmboBox.getSelectedItem());
        etb.setDescription(descriptionTextArea.getText());
        etb.setNom(nomTxtFeild.getText());
        etb.setImage(imageTxtFeild.getText());
        if (action != 0) {
            EDAO.updateEtablissement(action, etb);
        } else {
            id = EDAO.insertEtablissement(etb);

        }
        System.out.println(id);

        listeDomainesExistant = new DomaineDao().selectDomaines();
        for (Domaine d : listeDomainesAjouter) {
            if (!listeDomainesExistant.contains(d)) {
                idDomaineAjouter = domDAO.insertDomaine(d);
                etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, idDomaineAjouter));
            } else {
                etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, d.getId()));
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EtablissementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtablissementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtablissementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtablissementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtablissementFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDoaminLabel;
    private javax.swing.JButton addDomainBtn;
    private javax.swing.JTextField addDomainTxtField;
    private javax.swing.JButton addFileBtn;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel descriptionPanel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel domainePanel;
    private javax.swing.JList domaines1;
    private javax.swing.JList domaines2;
    private javax.swing.JLabel imagePanel;
    private javax.swing.JTextField imageTxtFeild;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JComboBox lieuCmboBox;
    private javax.swing.JLabel lieuPanel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField nomTxtFeild;
    private javax.swing.JComboBox responsableCmboBox;
    private javax.swing.JLabel responsablePanel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton to1;
    private javax.swing.JButton to2;
    // End of variables declaration//GEN-END:variables

    private void init() {
        imageTxtFeild.setEditable(false);
        descriptionTextArea.setLineWrap(true);
        setLocationRelativeTo(null);


        LieuDao LDAO = new LieuDao();
        List<Lieu> lL = new ArrayList<Lieu>();
        lL = LDAO.selectLieux();
        for (Lieu lieu : lL) {
            lieuModel.addElement(lieu);
        }

        UtilisateurDao UDAO = new UtilisateurDao();
        List<Utilisateur> lU = new ArrayList<Utilisateur>();
        lU = UDAO.selectUserByType('R');
        for (Utilisateur utilisateur : lU) {
            utilisateurModel.addElement(utilisateur);
        }

        DomaineDao DDAO = new DomaineDao();
        List<Domaine> listDomaines1 = new ArrayList<Domaine>();
        List<Domaine> listDomaines2 = new ArrayList<Domaine>();

        domaines1Model.addElement(new Domaine("domaine1"));
        listDomaines1 = DDAO.selectDomaines();
        for (Domaine d : listDomaines1) {
            domaines1Model.addElement(d);
        }


        domaines1.setModel(domaines1Model);
        domaines2.setModel(domaines2Model);
        responsableCmboBox.setModel(utilisateurModel);
        lieuCmboBox.setModel(lieuModel);

    }
}
