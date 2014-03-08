/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Dao;

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
    @Test
    public void testInsertUser_Utilisateur() {
        System.out.println("insertUser");
        Utilisateur u = new Utilisateur("marwen", "sdiri", null, "user", "0000", "mail@live.fr", 'C', new Date(2014-02-10), null);
        UtilisateurDao instance = new UtilisateurDao();
        //int expResult = 0;
        int result = instance.insertUser(u);
        assertNotNull(result);
        System.out.println(u);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of insertUser method, of class UtilisateurDao.
     */
//    @Test
//    public void testInsertUser_Utilisateur_String() throws Exception {
//        System.out.println("insertUser");
//        Utilisateur u = null;
//        String PathImage = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        int expResult = 0;
//        int result = instance.insertUser(u, PathImage);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insertResponsable method, of class UtilisateurDao.
//     */
//    @Test
//    public void testInsertResponsable_Utilisateur() {
//        System.out.println("insertResponsable");
//        Utilisateur u = null;
//        UtilisateurDao instance = new UtilisateurDao();
//        int expResult = 0;
//        int result = instance.insertResponsable(u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of insertResponsable method, of class UtilisateurDao.
//     */
//    @Test
//    public void testInsertResponsable_Utilisateur_String() throws Exception {
//        System.out.println("insertResponsable");
//        Utilisateur u = null;
//        String PathImage = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        int expResult = 0;
//        int result = instance.insertResponsable(u, PathImage);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateUser method, of class UtilisateurDao.
//     */
//    @Test
//    public void testUpdateUser_int_Utilisateur() {
//        System.out.println("updateUser");
//        int id = 0;
//        Utilisateur u = null;
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.updateUser(id, u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateUser method, of class UtilisateurDao.
//     */
//    @Test
//    public void testUpdateUser_3args() throws Exception {
//        System.out.println("updateUser");
//        int id = 0;
//        Utilisateur u = null;
//        String PathImage = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.updateUser(id, u, PathImage);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateResponsable method, of class UtilisateurDao.
//     */
//    @Test
//    public void testUpdateResponsable_int_Utilisateur() {
//        System.out.println("updateResponsable");
//        int id = 0;
//        Utilisateur u = null;
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.updateResponsable(id, u);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateResponsable method, of class UtilisateurDao.
//     */
//    @Test
//    public void testUpdateResponsable_3args() throws Exception {
//        System.out.println("updateResponsable");
//        int id = 0;
//        Utilisateur u = null;
//        String PathImage = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.updateResponsable(id, u, PathImage);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteUser method, of class UtilisateurDao.
//     */
//    @Test
//    public void testDeleteUser() {
//        System.out.println("deleteUser");
//        int id = 0;
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.deleteUser(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectUsers method, of class UtilisateurDao.
//     */
//    @Test
//    public void testSelectUsers() {
//        System.out.println("selectUsers");
//        UtilisateurDao instance = new UtilisateurDao();
//        List<Utilisateur> expResult = null;
//        List<Utilisateur> result = instance.selectUsers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectUserById method, of class UtilisateurDao.
//     */
//    @Test
//    public void testSelectUserById() {
//        System.out.println("selectUserById");
//        int id = 0;
//        UtilisateurDao instance = new UtilisateurDao();
//        Utilisateur expResult = null;
//        Utilisateur result = instance.selectUserById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectUserByLogin method, of class UtilisateurDao.
//     */
//    @Test
//    public void testSelectUserByLogin() {
//        System.out.println("selectUserByLogin");
//        String login = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        Utilisateur expResult = null;
//        Utilisateur result = instance.selectUserByLogin(login);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectUserByMail method, of class UtilisateurDao.
//     */
//    @Test
//    public void testSelectUserByMail() {
//        System.out.println("selectUserByMail");
//        String mail = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        Utilisateur expResult = null;
//        Utilisateur result = instance.selectUserByMail(mail);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectUserByType method, of class UtilisateurDao.
//     */
//    @Test
//    public void testSelectUserByType() {
//        System.out.println("selectUserByType");
//        char type = ' ';
//        UtilisateurDao instance = new UtilisateurDao();
//        List<Utilisateur> expResult = null;
//        List<Utilisateur> result = instance.selectUserByType(type);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Authentification method, of class UtilisateurDao.
//     */
//    @Test
//    public void testAuthentification() {
//        System.out.println("Authentification");
//        String login = "";
//        String password = "";
//        UtilisateurDao instance = new UtilisateurDao();
//        Utilisateur expResult = null;
//        Utilisateur result = instance.Authentification(login, password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteUserByEtablissement method, of class UtilisateurDao.
//     */
//    @Test
//    public void testDeleteUserByEtablissement() {
//        System.out.println("deleteUserByEtablissement");
//        int idetablissement = 0;
//        UtilisateurDao instance = new UtilisateurDao();
//        boolean expResult = false;
//        boolean result = instance.deleteUserByEtablissement(idetablissement);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
