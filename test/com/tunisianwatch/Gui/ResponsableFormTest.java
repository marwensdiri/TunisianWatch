/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Gui;

import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Util.FieldVerifier;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarwenSdiri <marwen.sdiri@esprit.tn>
 */
public class ResponsableFormTest {
     
    private ResponsableFormTest responsableFormTest;
    private Etablissement instanceEta ;
    public ResponsableFormTest() {
    }
    
    @Before
    public void setUp() {
        
        responsableFormTest = new ResponsableFormTest();
        instanceEta = new Etablissement();
        instanceEta.setId(1);
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        
        assertTrue("Nom invalide",responsableFormTest.isValidEtablissement(instanceEta));
        assertTrue("Nom invalide",responsableFormTest.isValidNom("a"));                           // il doit composé seulement des caractéres 
        assertTrue("Prenom invalide",responsableFormTest.isValidPrenom("a"));                    // il doit composé seulement des caractéres 
        assertNotNull("Date invalide",responsableFormTest.isValidDate(new Date(03-1-2014)));    // Date not null
        assertTrue("Pseudo existe",responsableFormTest.isValidPseudo("ab"));                   // pseudo qui n'existe pas dans la Base 
        assertTrue("MotDePasse invalide",responsableFormTest.isValidPass("123"));             // longeur de password superieur a 3   
        assertTrue("Mail invalide",responsableFormTest.isValidMail("aze@live.fr")); 
        
        
    }
    
    private boolean isValidEtablissement(Etablissement etablissement) {
        if (FieldVerifier.isNotNull((etablissement))) {
         return true;
        } else {
            return false;
        }   
    }        
        
    private boolean isValidNom(String nom) {
        if (FieldVerifier.VerifOrdinaryField(nom, "^([a-zA-Zéè0çôêâ']+)")) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isValidDate(Date date) {
        if (FieldVerifier.isNotNull((date))) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isValidPrenom(String prenom) {
        if (FieldVerifier.VerifOrdinaryField(prenom, "^([a-zA-Zéè0çôêâ']+)")) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isValidPseudo(String pseudo) {
        if (FieldVerifier.VerifComplexField(pseudo, 1)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isValidPass(String Pass) {
        if (FieldVerifier.VerifComplexField(Pass, 3)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isValidMail(String mail) {
        if (FieldVerifier.VerifOrdinaryField(mail)) { //mailTextfield.getText().length() >
            if (FieldVerifier.VerifComplexField(mail, 2)) {
                return true;
            }

        } else {
            return false;
        }
        return false;
    }
}
