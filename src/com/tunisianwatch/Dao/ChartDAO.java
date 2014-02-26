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

    private static PieDataset getDatasetDomaine() {
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

    private static PieDataset getDatasetLieu() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        ReclamationDao rec = new ReclamationDao();
        LieuDao lieu = new LieuDao();
        List<Lieu> listlieu = lieu.selectLieux();
        for (Lieu l : listlieu) {//parcours par lieu
            List<Reclamation> listrec = rec.selectReclamationsByIdLieu(l.getId());
            dataset.setValue(l.getNom(), listrec.size());
        }
        return dataset;

    }

    private static PieDataset getDatasetEtat() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        ReclamationDao rec = new ReclamationDao();
        List<Reclamation> listrec = rec.selectReclamations();

        List<Reclamation> list0 = new ArrayList<Reclamation>();
        List<Reclamation> list1 = new ArrayList<Reclamation>();
        List<Reclamation> list2 = new ArrayList<Reclamation>();
        
        for (Reclamation l : listrec) {//parcours par reclamation pour voir l'etat
            if (l.getEtat() == 0) {
                list0.add(l);
            } else {
                if (l.getEtat() == 1) {
                    list1.add(l);
                }else{
                    if(l.getEtat()==2)
                    list2.add(l);
                }
            }
        }
        dataset.setValue("Pas encore Réglée",list0.size());
        dataset.setValue("Réglée",list1.size());
        dataset.setValue("Fausse",list2.size());
        return dataset;

    }
/////////////////////////////////////////////////////////////////////////////////////////

    public static DefaultCategoryDataset getCategoryDomaine() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ReclamationDao rec = new ReclamationDao();
        DomaineDao domaine = new DomaineDao();

        List<Domaine> listdomaine = domaine.selectDomaines();
        for (Domaine d : listdomaine) {
            List<Reclamation> listrec = rec.selectReclamationByIdDomaine(d.getId());
            dataset.setValue(listrec.size(), d.getNom(), "");
        }
        return dataset;

    }

    public static DefaultCategoryDataset getCategoryLieu() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ReclamationDao rec = new ReclamationDao();
        LieuDao lieu = new LieuDao();
        List<Lieu> listlieu = lieu.selectLieux();
        for (Lieu l : listlieu) {//parcours par lieu
            List<Reclamation> listrec = rec.selectReclamationsByIdLieu(l.getId());
            dataset.setValue(listrec.size(), l.getNom(), "");
        }
        return dataset;
    }

    public static DefaultCategoryDataset getCategoryEtat() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ReclamationDao rec = new ReclamationDao();
        List<Reclamation> listrec = rec.selectReclamations();

        List<Reclamation> list0 = new ArrayList<Reclamation>();
        List<Reclamation> list1 = new ArrayList<Reclamation>();
        List<Reclamation> list2 = new ArrayList<Reclamation>();
        
        for (Reclamation l : listrec) {//parcours par reclamation pour voir l'etat
            if (l.getEtat() == 0) {
                list0.add(l);
            } else {
                if (l.getEtat() == 1) {
                    list1.add(l);
                }else{
                    list2.add(l);
                }
            }
        }
        dataset.setValue(list0.size(),"Non Traitée", "");
        dataset.setValue(list1.size(),"Traitée", "");
        dataset.setValue(list2.size(),"Fausse", "");
        return dataset;

    }

////////////////////////////////////////////////////////////////////////////////////////
    public static JFreeChart Createbarchartlieu(String titre, String axeX, String axeY) {//ok

        JFreeChart chart = ChartFactory.createBarChart3D(titre, axeX, axeY, getCategoryLieu());
        return chart;

    }

    public static JFreeChart createBarchartDomaine(String titre, String axeX, String axeY) {//ok
        JFreeChart chart = ChartFactory.createBarChart3D(titre, axeX, axeY, getCategoryDomaine());
        return chart;

    }

    public static JFreeChart createBarchartEtat(String titre, String axeX, String axeY) {
        JFreeChart chart = ChartFactory.createBarChart3D(titre, axeX, axeY, getCategoryEtat());
        return chart;
    }
////////////////////////////////////////////////////////////////////////////////////////   

    public static JFreeChart createChartdomaine(String titre) {//ok

        JFreeChart chart = ChartFactory.createPieChart3D(titre, getDatasetDomaine(), true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;

    }

    public static JFreeChart createChartEtat(String titre) {
        JFreeChart chart = ChartFactory.createPieChart3D(titre, getDatasetEtat(), true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;
    }

    public static JFreeChart createChartLieu(String titre) {//ok
        JFreeChart chart = ChartFactory.createPieChart3D(titre, getDatasetLieu(), true, true, true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);

        return chart;
    }
}
