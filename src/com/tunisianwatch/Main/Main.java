/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Main;

import com.tunisianwatch.Gui.EtablissementFrame;


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
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new EtablissementFrame().setVisible(true);
           }
       });
        
    }

}
