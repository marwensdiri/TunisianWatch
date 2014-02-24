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
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChartDAO {

    private static PieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Linux", 29);
        result.setValue("Mac", 20);
        result.setValue("Windows", 10);
        result.setValue("Android", 50);
        return result;

    }

    public static DefaultCategoryDataset CreateDataset() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        DomaineDao domaine = new DomaineDao();
        List<Domaine> listdomaine = domaine.selectDomaines();
        while (listdomaine.iterator().hasNext()) {//parcours par domaine
            
            ReclamationDao rec = new ReclamationDao();
            List<Reclamation> list = rec.selectReclamationByIdDomaine(listdomaine.iterator().next().getId());

            int som = 0;
            while (list.iterator().hasNext()) {//nombre des reclamation par domain selectionné
                som = som + 1;
            }
            String nom = listdomaine.iterator().next().getNom();
             dataset.setValue(som, nom, nom);
        }



//            dataset.setValue(50, "Beja", "");
//            dataset.setValue(60, "Jandoba", "");
//            dataset.setValue(20, "Tunis", "");
//            dataset.setValue(10, "Bizete", "");
//            dataset.setValue(20, "Kirwen", "");
//            dataset.setValue(90, "Sfax", "");
//            dataset.setValue(53, "Mistir", "");


        return dataset;
    }

    public static JFreeChart Createbarchart(String titre, String axeX, String axeY) {

        JFreeChart chart = ChartFactory.createBarChart3D(titre, axeX, axeY, CreateDataset());
        return chart;

    }

    public static JFreeChart createChart(String titre) {

        JFreeChart chart = ChartFactory.createPieChart3D(titre, // Titre
                createDataset(), // data
                true,
                true,
                false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;

    }
}
