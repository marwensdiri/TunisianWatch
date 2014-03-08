package com.tunisianwatch.pdf;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.nio.file.Path;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * #Houssem Eddine Lassoued
 */
public class GenererPDF {
public static void getPdf(String  path) {
        // - Paramètres de connexion à la base de données
        
        Connection connection;
        try {
            // - Connexion à la base
            connection=MySQLConnexion.getInstance();
            // - Chargement et compilation du rapport (charger le fichier jrxml déjà généré)
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Skan\\Desktop\\classic.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("Titre", "Titre");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint,clean(path)+"\\classic.pdf" );
            System.out.println("success");
        }

        catch (JRException e) {
            System.out.println("erreur de compilation"+ e.getMessage());
         } 
}

    private static String clean(String path) {
        path = path.replaceAll("//", "\\"); 
        return path ; 
    }

}
