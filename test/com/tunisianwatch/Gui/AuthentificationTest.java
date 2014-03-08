/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

import com.tunisianwatch.Dao.UtilisateurDao;
import com.tunisianwatch.Entities.Utilisateur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarwenSdiri <marwen.sdiri@esprit.tn>
 */
public class AuthentificationTest {
    Utilisateur user ;
    public AuthentificationTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.      
        user = new UtilisateurDao().Authentification("marwen","0000");
        assertNotNull("Connection Non Valide",user);
    }
    
}
