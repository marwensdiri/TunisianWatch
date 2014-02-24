/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunisianwatch.Dao;

import com.tunisianwatch.Entities.Reclamation;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
import com.tunisianwatch.Dao.ReclamationDao;
import com.tunisianwatch.Entities.Domaine;
import com.tunisianwatch.Entities.Lieu;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChartDAO {

    private static PieDataset createDatasetDomaine() {
        DefaultPieDataset result = new DefaultPieDataset();
        ReclamationDao rec = new ReclamationDao();
        DomaineDao domaine = new DomaineDao();
        
        List<Domaine> listdomaine = domaine.selectDomaines();
        for (Domaine d : listdomaine) {
            List<Reclamation> listrec = rec.selectReclamationByIdDomaine(d.getId());
            result.setValue(d.getNom(), listrec.size());
        }
        return result;
    }

    public static DefaultCategoryDataset CreateDatasetlieu() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        ReclamationDao rec = new ReclamationDao();
        LieuDao lieu = new LieuDao();
        
        List<Lieu> listlieu = lieu.selectLieux();
        
        for(int i=0;i<listlieu.size();i++) {//parcours par lieu
            List<Reclamation> listrec = rec.selectReclamationByIdDomaine(listlieu.get(i).getId());
            String nom = listlieu.get(i).getNom();
            
            dataset.setValue(listrec.size(), nom, "");
        }
        
        return dataset;
    }

    public static JFreeChart Createbarchartlieu(String titre, String axeX, String axeY) {

        JFreeChart chart = ChartFactory.createBarChart3D(titre, axeX, axeY, CreateDatasetlieu());
        return chart;

    }

    public static JFreeChart createChartdomaine(String titre) {

        JFreeChart chart = ChartFactory.createPieChart3D(titre,createDatasetDomaine(),true,true,true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;

    }
}
