/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Dao;

import com.tunisianwatch.Entities.Reclamation;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarwenSdiri <marwen.sdiri@esprit.tn>
 */
public class ReclamationDaoTest {
    
    public ReclamationDaoTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of insertReclamation method, of class ReclamationDao.
     */
    @Test
    public void testInsertReclamation() {
        System.out.println("insertReclamation");
        Reclamation r = null;
        ReclamationDao instance = new ReclamationDao();
        int expResult = 0;
        int result = instance.insertReclamation(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateReclamation method, of class ReclamationDao.
     */
    @Test
    public void testUpdateReclamation() {
        System.out.println("updateReclamation");
        int id = 0;
        Reclamation r = null;
        ReclamationDao instance = new ReclamationDao();
        boolean expResult = false;
        boolean result = instance.updateReclamation(id, r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamations method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamations() {
        System.out.println("selectReclamations");
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationById method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationById() {
        System.out.println("selectReclamationById");
        int id = 0;
        ReclamationDao instance = new ReclamationDao();
        Reclamation expResult = null;
        Reclamation result = instance.selectReclamationById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationsByIdLieu method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationsByIdLieu() {
        System.out.println("selectReclamationsByIdLieu");
        int idLieu = 0;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationsByIdLieu(idLieu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationsByDate method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationsByDate() {
        System.out.println("selectReclamationsByDate");
        Date date = null;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationsByDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationByTime method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationByTime() {
        System.out.println("selectReclamationByTime");
        Date date = null;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationByTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationByTitre method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationByTitre() {
        System.out.println("selectReclamationByTitre");
        String titre = "";
        ReclamationDao instance = new ReclamationDao();
        Reclamation expResult = null;
        Reclamation result = instance.selectReclamationByTitre(titre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationByIdCitoyen method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationByIdCitoyen() {
        System.out.println("selectReclamationByIdCitoyen");
        int idCitoyen = 0;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationByIdCitoyen(idCitoyen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationByIdDomaine method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationByIdDomaine() {
        System.out.println("selectReclamationByIdDomaine");
        int idDomaine = 0;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationByIdDomaine(idDomaine);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectReclamationByEtat method, of class ReclamationDao.
     */
    @Test
    public void testSelectReclamationByEtat() {
        System.out.println("selectReclamationByEtat");
        int etat = 0;
        ReclamationDao instance = new ReclamationDao();
        List<Reclamation> expResult = null;
        List<Reclamation> result = instance.selectReclamationByEtat(etat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReclamation method, of class ReclamationDao.
     */
    @Test
    public void testDeleteReclamation() {
        System.out.println("deleteReclamation");
        int id = 0;
        ReclamationDao instance = new ReclamationDao();
        boolean expResult = false;
        boolean result = instance.deleteReclamation(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
