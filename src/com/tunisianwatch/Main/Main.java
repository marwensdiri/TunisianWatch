/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Main;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import com.tunisianwatch.Gui.MainFrame;
import java.util.List;


/**
 *
 * @author Marwen
 */
public class Main {
    private static java.util.Date date;

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

  /*      
   // Test by marwen 
        Utilisateur u1 = new Utilisateur(2, "marwen", "sdiri", null, "login", "pwd", "monMail", 'c',  new java.sql.Date(2014-06-06));

        UtilisateurDao userdao = new UtilisateurDao();
        
        //userdao.insertUser(u1);
        //userdao.updateUser(2, u1);
        List<Utilisateur> listUsers =userdao.selectUsers();
        Utilisateur u2 = userdao.selectUserById(2);
        System.out.println(listUsers);
        System.out.println(u2);
        
       // userdao.deleteUser(14);
        
   //  Fin Test by marwen  
           
   */        
    }

}
