/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Dao;

import com.tunisianwatch.Entities.Etablissement;
import com.tunisianwatch.Entities.Utilisateur;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarwenSdiri <marwen.sdiri@esprit.tn>
 */
public class UtilisateurDaoTest {
    
    public UtilisateurDaoTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of insertUser method, of class UtilisateurDao.
     */
//    @Test
//    public void testInsertUser_Utilisateur() {
//        System.out.println("insertUser");
//        Utilisateur u = new Utilisateur();
//        UtilisateurDao instance = new UtilisateurDao();
//        
//        u.setNom("marwen");
//        u.setPrenom("sdiri");
//        u.setLogin("user");
//        u.setMdp("0000");
//        u.setAdress("MyAdress");
//        u.setMail("mail@live.fr");
//        u.setType('C');
//        u.setDateNaissance(new Date(2014-02-10));
//       
//        int result = instance.insertUser(u);
//        assertNotNull(result);
//       
//        System.out.println(u);
        // TODO review the generated test code and remove the default call to fail.
       
 //   }
 
    /**
     * Test of insertResponsable method, of class UtilisateurDao.
     */
    @Test
    public void testInsertResponsable_Utilisateur() {
        System.out.println("insertResponsable");
        Utilisateur u = new Utilisateur();
        UtilisateurDao instance = new UtilisateurDao();
        EtablissementDao instanceEta = new EtablissementDao();
        u.setEtablissement(instanceEta.selectEtablissementById(1));
        u.setNom("marwenResponsable");
        u.setPrenom("sdiri");
        u.setLogin("user");
        u.setMdp("0000");
        u.setAdress("MyAdress");
        u.setMail("mail@live.fr");
        u.setType('R');
        u.setDateNaissance(new Date(2014-02-10));
        
        int result = instance.insertResponsable(u);
        assertNotNull(result);

        // TODO review the generated test code and remove the default call to fail.

    }


    /**
     * Test of updateUser method, of class UtilisateurDao.
     */
    @Test
    public void testUpdateUser_int_Utilisateur() {
        System.out.println("updateUser");
        int id = 0;
        Utilisateur u = null;
        UtilisateurDao instance = new UtilisateurDao();
        boolean expResult = false;
        boolean result = instance.updateUser(id, u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of updateResponsable method, of class UtilisateurDao.
     */
    @Test
    public void testUpdateResponsable_int_Utilisateur() {
        System.out.println("updateResponsable");
        int id = 0;
        Utilisateur u = null;
        UtilisateurDao instance = new UtilisateurDao();
        boolean expResult = false;
        boolean result = instance.updateResponsable(id, u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of deleteUser method, of class UtilisateurDao.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        int id = 0;
        UtilisateurDao instance = new UtilisateurDao();
        boolean expResult = false;
        boolean result = instance.deleteUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUsers method, of class UtilisateurDao.
     */
    @Test
    public void testSelectUsers() {
        System.out.println("selectUsers");
        UtilisateurDao instance = new UtilisateurDao();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.selectUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUserById method, of class UtilisateurDao.
     */
    @Test
    public void testSelectUserById() {
        System.out.println("selectUserById");
        int id = 0;
        UtilisateurDao instance = new UtilisateurDao();
        Utilisateur expResult = null;
        Utilisateur result = instance.selectUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUserByLogin method, of class UtilisateurDao.
     */
    @Test
    public void testSelectUserByLogin() {
        System.out.println("selectUserByLogin");
        String login = "";
        UtilisateurDao instance = new UtilisateurDao();
        Utilisateur expResult = null;
        Utilisateur result = instance.selectUserByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUserByMail method, of class UtilisateurDao.
     */
    @Test
    public void testSelectUserByMail() {
        System.out.println("selectUserByMail");
        String mail = "";
        UtilisateurDao instance = new UtilisateurDao();
        Utilisateur expResult = null;
        Utilisateur result = instance.selectUserByMail(mail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUserByType method, of class UtilisateurDao.
     */
    @Test
    public void testSelectUserByType() {
        System.out.println("selectUserByType");
        char type = ' ';
        UtilisateurDao instance = new UtilisateurDao();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.selectUserByType(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Authentification method, of class UtilisateurDao.
     */
    @Test
    public void testAuthentification() {
        System.out.println("Authentification");
        String login = "";
        String password = "";
        UtilisateurDao instance = new UtilisateurDao();
        Utilisateur expResult = null;
        Utilisateur result = instance.Authentification(login, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserByEtablissement method, of class UtilisateurDao.
     */
    @Test
    public void testDeleteUserByEtablissement() {
        System.out.println("deleteUserByEtablissement");
        int idetablissement = 0;
        UtilisateurDao instance = new UtilisateurDao();
        boolean expResult = false;
        boolean result = instance.deleteUserByEtablissement(idetablissement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
