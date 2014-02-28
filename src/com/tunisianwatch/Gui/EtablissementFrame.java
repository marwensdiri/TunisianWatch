package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.*;
import com.tunisianwatch.Entities.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        etb = (Etablissement) obj;
        System.out.println(etb.getId());
        action = etb.getId();
        initComponents();
        init();
        nomTxtFeild.setText(etb.getNom());
        descriptionTextArea.setText(etb.getDescription());
        imageTxtFeild.setText(etb.getImage());
        for (Domaine d : etb.getListDomaine()) {
            domaines2Model.addElement((Domaine) d);
            domaines1Model.removeElement((Domaine) d);
        }
        submitBtn.setText("Modifer");
        utilisateurModel.setSelectedItem(etb.getResponsable());
        lieuModel.setSelectedItem(etb.getLieu());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
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
        addDoaminLabel = new javax.swing.JLabel();
        addDomainTxtField = new javax.swing.JTextField();
        addDomainBtn = new javax.swing.JButton();
        addFileBtn = new javax.swing.JButton();
        nomLabel = new javax.swing.JLabel();
        responsablePanel = new javax.swing.JLabel();
        lieuPanel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JLabel();
        domainePanel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JLabel();
        to1 = new javax.swing.JButton();
        to2 = new javax.swing.JButton();
        BoutonPanel = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Etablissement - Form");
        getContentPane().setLayout(new java.awt.CardLayout());

        bodyPanel.setMinimumSize(new java.awt.Dimension(650, 560));
        bodyPanel.setPreferredSize(new java.awt.Dimension(650, 560));

        inputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        responsableCmboBox.setBackground(new java.awt.Color(204, 0, 0));
        responsableCmboBox.setForeground(new java.awt.Color(255, 255, 255));

        lieuCmboBox.setBackground(new java.awt.Color(204, 0, 0));
        lieuCmboBox.setForeground(new java.awt.Color(255, 255, 255));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jScrollPane2.setViewportView(domaines1);

        jScrollPane3.setViewportView(domaines2);

        addDoaminLabel.setText("Domaine:");

        addDomainTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDomainTxtFieldActionPerformed(evt);
            }
        });

        addDomainBtn.setBackground(new java.awt.Color(204, 0, 0));
        addDomainBtn.setForeground(new java.awt.Color(255, 255, 255));
        addDomainBtn.setText("Ajouter");
        addDomainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDomainBtnActionPerformed(evt);
            }
        });

        addFileBtn.setBackground(new java.awt.Color(204, 0, 0));
        addFileBtn.setForeground(new java.awt.Color(255, 255, 255));
        addFileBtn.setText("...");
        addFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileBtnActionPerformed(evt);
            }
        });

        nomLabel.setText("Nom :");

        responsablePanel.setText("Responsable :");

        lieuPanel.setText("Lieu :");

        imagePanel.setText("Image :");

        domainePanel.setText("Domaines :");

        descriptionPanel.setText("Description :");

        to1.setBackground(new java.awt.Color(204, 0, 0));
        to1.setForeground(new java.awt.Color(255, 255, 255));
        to1.setText("<");
        to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to1ActionPerformed(evt);
            }
        });

        to2.setBackground(new java.awt.Color(204, 0, 0));
        to2.setForeground(new java.awt.Color(255, 255, 255));
        to2.setText(">");
        to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addDomainTxtField))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(lieuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(domainePanel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lieuCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addComponent(to1)
                                        .addGap(36, 36, 36)
                                        .addComponent(to2)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(responsableCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imageTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addDomainBtn))))
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsableCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lieuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lieuCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFileBtn)
                    .addComponent(imageTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(to2)
                            .addComponent(to1)))
                    .addComponent(domainePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDomainTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDomainBtn))
                .addGap(18, 18, 18)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BoutonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelBtn.setBackground(new java.awt.Color(204, 0, 0));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Annuler");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(204, 0, 0));
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Envoyer");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoutonPanelLayout = new javax.swing.GroupLayout(BoutonPanel);
        BoutonPanel.setLayout(BoutonPanelLayout);
        BoutonPanelLayout.setHorizontalGroup(
            BoutonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoutonPanelLayout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(cancelBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitBtn)
                .addContainerGap())
        );
        BoutonPanelLayout.setVerticalGroup(
            BoutonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoutonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BoutonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(BoutonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bodyPanel, "card2");

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

        if (verif()) {
            Object[] arr = domaines2Model.toArray();
            for (Object o : arr) {
                listeDomainesAjouter.add((Domaine) o);
            }
            EtablissementDomaineDao etabdomDAO = new EtablissementDomaineDao();
            DomaineDao domDAO = new DomaineDao();
            int id = -1;
            int idDomaineAjouter = -1;
            EtablissementDao EDAO = new EtablissementDao();
            Lieu L = (Lieu) lieuCmboBox.getSelectedItem();
            etb.setLieu(L);
            etb.setResponsable((Utilisateur) utilisateurModel.getElementAt(responsableCmboBox.getSelectedIndex()));
            etb.setDescription(descriptionTextArea.getText());
            etb.setNom(nomTxtFeild.getText());
            etb.setImage(imageTxtFeild.getText());
            if (action != 0) {
                EDAO.updateEtablissement(action, etb);
            } else {
                id = EDAO.insertEtablissement(etb);

            }
            listeDomainesExistant = new DomaineDao().selectDomaines();
            for (Domaine d : listeDomainesAjouter) {
                if (!listeDomainesExistant.contains(d)) {
                    idDomaineAjouter = domDAO.insertDomaine(d);
                    etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, idDomaineAjouter));
                } else {
                    etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, d.getId()));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "err");
        }
        this.hide();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.hide();
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoutonPanel;
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

    private boolean verif() {
        if (nomTxtFeild.getText() == "") {
            return false;
        }
        return true;
    }
}
