package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.*;
import com.tunisianwatch.Entities.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EtablissementFrame extends javax.swing.JFrame {

    private String errMsg;
    private String errMsg2;
    private String imageTxt = "";
    private List<Domaine> listeDomainesAjouter = new ArrayList<Domaine>();//liste des domaines a ajouter a l'etab
    private List<Domaine> listeDomainesExistant = new ArrayList<Domaine>();//liste des domaines dans la base de données
    private DefaultComboBoxModel<Lieu> lieuModel = new DefaultComboBoxModel();//model pour le combobox lieu
    private DefaultComboBoxModel<Utilisateur> utilisateurModel = new DefaultComboBoxModel();//model pour le combobox responsable
    /*
     * modeles pour les liste de domaines
     */
    private DefaultListModel<Domaine> domaines1Model = new DefaultListModel<Domaine>();
    private DefaultListModel<Domaine> domaines2Model = new DefaultListModel<Domaine>();
    /*
     * fin des modeles
     */
    private int action = -1;//parametre de l'action a traiter, 0 si un ajout, dans le cas de modification, il contiendra l'id de l'etablissement a mdifier
    private Etablissement etb;//objet a traiter : "modifier ou ajouter"

    //constructeur a appeler lors d'un ajout
    public EtablissementFrame() {
        initComponents();
        init();
        etb = new Etablissement();
    }

    //constructeur appeler en cas de modification
    public EtablissementFrame(Object obj) {
        etb = (Etablissement) obj;//récupairation de l'objet a modifier
        action = etb.getId();//récupairation de l'id de l'obj a modifier
        initComponents();
        init();//intialisations

        /*
         * intialisation des different champs du formulaire avec les valeurs a modifier
         */
        nomTxtFeild.setText(etb.getNom());
        descriptionTextArea.setText(etb.getDescription());
        if (etb.getImage() != null) {
            ImageIcon icon = new ImageIcon(etb.getImage().getScaledInstance(250, 250, Image.SCALE_FAST));
            imageLabel.setIcon(icon);
            imageLabel.repaint();
        }
        for (Domaine d : etb.getListDomaine()) {
            domaines2Model.addElement((Domaine) d);
            domaines1Model.removeElement((Domaine) d);
        }
        submitBtn.setText("Modifer");
        utilisateurModel.setSelectedItem((Utilisateur) etb.getResponsable());
        lieuModel.setSelectedItem((Lieu) etb.getLieu());

        /*
         * fin des initialisations
         */

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        nomTxtFeild = new javax.swing.JTextField();
        responsableCmboBox = new javax.swing.JComboBox();
        lieuCmboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        domaines2 = new javax.swing.JList();
        addDoaminLabel = new javax.swing.JLabel();
        addDomainTxtField = new javax.swing.JTextField();
        addDomainBtn = new javax.swing.JButton();
        addFileBtn = new javax.swing.JButton();
        nomLabel = new javax.swing.JLabel();
        responsablePanel = new javax.swing.JLabel();
        lieuPanel = new javax.swing.JLabel();
        domainePanel = new javax.swing.JLabel();
        descriptionPanel = new javax.swing.JLabel();
        to1 = new javax.swing.JButton();
        to2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        domaines1 = new javax.swing.JList();
        imageLabel = new javax.swing.JLabel();
        errLbl = new javax.swing.JLabel();
        BoutonPanel = new javax.swing.JPanel();
        cancelBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Etablissement - Form");
        setMinimumSize(new java.awt.Dimension(690, 610));
        setPreferredSize(new java.awt.Dimension(949, 590));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        bodyPanel.setMinimumSize(new java.awt.Dimension(650, 590));
        bodyPanel.setPreferredSize(new java.awt.Dimension(650, 590));

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Etablissement - Form"));
        inputPanel.setMinimumSize(new java.awt.Dimension(621, 469));

        responsableCmboBox.setBackground(new java.awt.Color(204, 0, 0));
        responsableCmboBox.setForeground(new java.awt.Color(255, 255, 255));

        lieuCmboBox.setBackground(new java.awt.Color(204, 0, 0));
        lieuCmboBox.setForeground(new java.awt.Color(255, 255, 255));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

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
        addFileBtn.setText("Modifier");
        addFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileBtnActionPerformed(evt);
            }
        });

        nomLabel.setText("Nom :");

        responsablePanel.setText("Responsable :");

        lieuPanel.setText("Lieu :");

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

        jScrollPane4.setMaximumSize(new java.awt.Dimension(23, 23));

        jScrollPane4.setViewportView(domaines1);

        errLbl.setText("*Champ Nom est obligatoire");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lieuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(domainePanel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addDomainTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(nomTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lieuCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addDomainBtn)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputPanelLayout.createSequentialGroup()
                                        .addComponent(to1)
                                        .addGap(18, 18, 18)
                                        .addComponent(to2)))
                                .addGap(18, 18, 18)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(responsableCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(errLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nomTxtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lieuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lieuCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(responsablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(responsableCmboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(to2)
                                    .addComponent(to1)))
                            .addComponent(domainePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDoaminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDomainTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDomainBtn)
                    .addComponent(addFileBtn))
                .addGap(18, 18, 18)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                .addContainerGap()
                .addComponent(cancelBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitBtn))
        );
        BoutonPanelLayout.setVerticalGroup(
            BoutonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoutonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cancelBtn)
                .addComponent(submitBtn))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(BoutonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoutonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(bodyPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * action pour le btn d'ajout de fichier
     */
    private void addFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {
            String filename = f.getAbsolutePath();
            imageTxt = filename;
            Image Image1 = Toolkit.getDefaultToolkit().getImage(filename);
            ImageIcon icon = new ImageIcon(Image1.getScaledInstance(250, 250, Image.SCALE_FAST));
            imageLabel.setIcon(icon);
            imageLabel.repaint();
        }
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
        addDomainBtnActionPerformed(evt);
    }//GEN-LAST:event_addDomainTxtFieldActionPerformed

    private void addDomainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDomainBtnActionPerformed
        boolean existe = false;
        if (listeDomainesExistant.size() != 0) {
            System.out.println("yod5el fi if loula");
            for (Domaine d : listeDomainesExistant) {
                System.out.println("yod5ol fi for");
                if (d.getNom().equalsIgnoreCase(addDomainTxtField.getText())) {
                    System.out.println("yod5el fi if");
                    existe = true;
                    break;
                }
            }
        }
        if (!addDomainTxtField.getText().isEmpty() && !existe) {
            domaines2Model.addElement(new Domaine(0, addDomainTxtField.getText()));

        } else if (addDomainTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "entrer un nom d'etablissement");
        } else {
            JOptionPane.showMessageDialog(null, "domaine existe deja !!");
        }

        addDomainTxtField.setText("");
    }//GEN-LAST:event_addDomainBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if (verif() && errMsg2 == "") {
            Object[] arr = domaines2Model.toArray();
            EtablissementDomaineDao etabdomDAO = new EtablissementDomaineDao();
            DomaineDao domDAO = new DomaineDao();
            EtablissementDao EDAO = new EtablissementDao();
            int id = -1;
            int idDomaineAjouter = -1;


            for (Object o : arr) {
                listeDomainesAjouter.add((Domaine) o);
            }


            etb.setLieu((Lieu) lieuModel.getElementAt(lieuCmboBox.getSelectedIndex()));
            Lieu L = (Lieu) lieuCmboBox.getSelectedItem();
            etb.setLieu(L);
            etb.setResponsable((Utilisateur) utilisateurModel.getElementAt(responsableCmboBox.getSelectedIndex()));
            etb.setDescription(descriptionTextArea.getText());
            etb.setNom(nomTxtFeild.getText());


            if (imageTxt != "") {
                etb.setImage(Toolkit.getDefaultToolkit().getImage(imageTxt));
            } else {
                etb.setImage(null);
            }


            if (action == -1) {
                if (imageTxt == "") {
                    id = EDAO.insertEtablissement(etb);
                } else {
                    try {
                        id = EDAO.insertEtablissement(etb, imageTxt);
                    } catch (FileNotFoundException ex) {
                    }
                }
            } else {
                id = action;
                if (imageTxt == "") {
                    EDAO.updateEtablissement(id, etb);
                } else {
                    try {
                        EDAO.updateEtablissement(id, etb, imageTxt);
                    } catch (FileNotFoundException ex) {
                    }
                }
            }



            for (Domaine d : listeDomainesAjouter) {
                if (!listeDomainesExistant.contains(d)) {
                    idDomaineAjouter = domDAO.insertDomaine(d);
                    etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, idDomaineAjouter));
                } else {
                    etabdomDAO.insertEtablissementDomaine(new EtablissementDomaine(id, d.getId()));
                }
            }
            this.dispose();
        }

    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
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
    private javax.swing.JLabel errLbl;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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

    /*
     * methode pour intialiser les combobox et les liste en récupairant les valeurs de la base de donnée
     */
    private void init() {

        errMsg = "";
        errMsg2 = "";

        errLbl.setVisible(false);

        descriptionTextArea.setLineWrap(true);
        setLocationRelativeTo(null);

        //remplissage du combobox des lieux
        LieuDao LDAO = new LieuDao();
        List<Lieu> lL = new ArrayList<Lieu>();

        UtilisateurDao UDAO = new UtilisateurDao();
        List<Utilisateur> lU = new ArrayList<Utilisateur>();
        try {

            lL = LDAO.selectLieux();
            for (Lieu lieu : lL) {
                lieuModel.addElement(lieu);
            }
        } catch (Exception e) {
            errMsg += "-recupairation des lieux\n";
            if (lL.size() == 0) {
                errMsg2 += "-Lieux\n";
            }
        }
        //remplissage du combobox des responsables
        try {

            lU = UDAO.selectUserByType('R');
            for (Utilisateur utilisateur : lU) {
                utilisateurModel.addElement(utilisateur);
            }
        } catch (Exception e) {
            errMsg += "-recupairation des responsables\n";
            if (lU.size() == 0) {
                errMsg2 += "-Responsables\n";
            }
        }

        //remplissage des listes de domaines

        DomaineDao DDAO = new DomaineDao();
        List<Domaine> listDomaines1 = new ArrayList<Domaine>();
        List<Domaine> listDomaines2 = new ArrayList<Domaine>();

        try {
            listDomaines1 = DDAO.selectDomaines();
            for (Domaine d : listDomaines1) {
                domaines1Model.addElement(d);
            }
        } catch (Exception e) {
            errMsg += "-recupairation des domaines\n";
            if (listDomaines1.size() == 0) {
                errMsg2 += "-Domaines\n";
            }
        }
        domaines1.setModel(domaines1Model);
        domaines2.setModel(domaines2Model);
        responsableCmboBox.setModel(utilisateurModel);
        lieuCmboBox.setModel(lieuModel);
        listeDomainesExistant = new DomaineDao().selectDomaines();
        if (errMsg != "") {
            JOptionPane.showMessageDialog(null, "erreur lors de la recupairation de : \n" + errMsg);
        }
        if (errMsg2 != "") {
            JOptionPane.showMessageDialog(null, "les données suivants sont manquant : \n" + errMsg2);
        }

        nomTxtFeild.addFocusListener(new java.awt.event.FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                errLbl.setVisible(false);
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            }
        });


    }

    private boolean verif() {
        if (nomTxtFeild.getText().equals("")) {
            errLbl.setVisible(true);
            return false;
        }
        return true;
    }
}
