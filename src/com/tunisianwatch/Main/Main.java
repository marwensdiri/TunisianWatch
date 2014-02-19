/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Main;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;

/**
 *
 * @author Marwen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
        
        
    }
   Utilisateur u1 = new Utilisateur(1, "marwen", "sdiri", null, "login", "pwd", "mail", "", 'c');
  
   UtilisateurDao userdao = new UtilisateurDao();
 
  
}
