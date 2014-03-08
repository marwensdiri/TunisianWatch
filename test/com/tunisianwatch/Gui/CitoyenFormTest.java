/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Gui;

import com.tunisianwatch.Util.FieldVerifier;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarwenSdiri <marwen.sdiri@esprit.tn>
 */
public class CitoyenFormTest {

    private CitoyenFormTest citoyenForm;

    public CitoyenFormTest() {
    }

    @Before
    public void setUp() {
        citoyenForm = new CitoyenFormTest();
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        
        assertTrue("Nom invalide",citoyenForm.isValidNom("a"));                           // il doit composé seulement des caractéres 
        assertTrue("Prenom invalide",citoyenForm.isValidPrenom("a"));                    // il doit composé seulement des caractéres 
        assertNotNull("Date invalide",citoyenForm.isValidDate(new Date(03-1-2014)));    // Date not null
        assertTrue("Pseudo existe",citoyenForm.isValidPseudo("ab"));                   // pseudo qui n'existe pas dans la Base 
        assertTrue("MotDePasse invalide",citoyenForm.isValidPass("123"));             // longeur de password superieur a 3   
        assertTrue("Mail invalide",citoyenForm.isValidMail("aze@live.fr"));          // format de mail valide 

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
