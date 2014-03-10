package com.tunisianwatch.pdf;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_HH_mm") ;
        System.out.println();
        Connection connection;
        try {
            // - Connexion à la base
            connection=MySQLConnexion.getInstance();
            // - Chargement et compilation du rapport (charger le fichier jrxml déjà généré)
            JasperDesign jasperDesign = JRXmlLoader.load("src/com/tunisianwatch/pdf/chart1.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
             
            JasperDesign jasperDesign1 = JRXmlLoader.load("src/com/tunisianwatch/pdf/watch.jrxml");
           
            JasperReport jasperReport1 = JasperCompileManager.compileReport(jasperDesign1);
            // - Paramètres à envoyer au rapport
            Map  parameters = new HashMap();
            parameters.put("", "");
            Map  parameters1 = new HashMap();
            parameters.put("", "");
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
             JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport1, parameters1, connection);
            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint,clean(path)+"\\reclam_domaine-"+sdf.format(new Date())+".pdf" );
            System.out.println("success");
             JasperExportManager.exportReportToPdfFile(jasperPrint1,clean(path)+"\\report_"+sdf.format(new Date())+".pdf" );
            System.out.println("success1");
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
