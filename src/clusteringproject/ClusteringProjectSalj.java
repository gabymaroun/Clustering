/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clusteringproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Salj
 */
public class ClusteringProjectSalj {

    static List<Point> allPoints = new ArrayList();
    static List<Point> ListCenter = new ArrayList();
    static List<Point> ListNoise = new ArrayList<>();
    static List<Point> ListBorder = new ArrayList<>();

    static HashMap<Point, List<Point>> listVoisinageDesPoints = new HashMap<>();

    public static void connected(Point x, int k) {
        List<Point> voisinageDeX = listVoisinageDesPoints.get(x);
        int indexx = ListCenter.indexOf(x);
        ListCenter.get(indexx).setCheck(false);

        for (Point p : voisinageDeX) {

            p.setIdClus(k);
            int index = allPoints.indexOf(p);
            allPoints.set(index, p);

            if (ListCenter.contains(p)) {
                int in = ListCenter.indexOf(p);
                if (ListCenter.get(in).isCheck() == true) {
                    connected(p, k);
                }
            }
        }

    }

    public static void main(String[] args) {

//        allPoints.add(new Point(5, 8));
//        allPoints.add(new Point(10, 8));
//        allPoints.add(new Point(11, 8));
//        allPoints.add(new Point(12, 8));
//        allPoints.add(new Point(6, 7));
//        allPoints.add(new Point(14, 9));
//        allPoints.add(new Point(15, 9));
//        allPoints.add(new Point(20, 3));
//        allPoints.add(new Point(20, 4));
        allPoints.add(new Point(5, 8));
        allPoints.add(new Point(10, 8));
        allPoints.add(new Point(11, 8));
        allPoints.add(new Point(6, 7));
        allPoints.add(new Point(10, 7));
        allPoints.add(new Point(12, 7));
        allPoints.add(new Point(13, 7));
        allPoints.add(new Point(5, 6));
        allPoints.add(new Point(10, 6));
        allPoints.add(new Point(13, 6));
        allPoints.add(new Point(6, 5));
        allPoints.add(new Point(9, 4));
        allPoints.add(new Point(11, 5));
        allPoints.add(new Point(14, 6));
        allPoints.add(new Point(15, 5));
        allPoints.add(new Point(2, 4));
        allPoints.add(new Point(3, 4));
        allPoints.add(new Point(5, 4));
        allPoints.add(new Point(6, 4));
        allPoints.add(new Point(7, 4));
        allPoints.add(new Point(15, 4));
        allPoints.add(new Point(3, 3));
        allPoints.add(new Point(7, 3));
        allPoints.add(new Point(8, 2));

        double minEps = 2;
        int minPts = 3;

        for (Point p : allPoints) {
            List<Point> Neps = new ArrayList();
            for (Point others : allPoints) {
                if (p.equals(others)) {
                } //ne pas ajouter lui meme
                else {
                    double dist = (Math.sqrt(Math.pow(p.getX() - others.getX(), 2) + Math.pow(p.getY() - others.getY(), 2)));
                    if ((dist <= minEps) && (dist != 0)) {
                        Neps.add(others);
                    }
                }

            }
            p.setIdClus(0);
            listVoisinageDesPoints.put(p, Neps);
            if (Neps.size() >= minPts) {
                ListCenter.add(p);
            }
            if (Neps.size() == 0) {
                ListNoise.add(p);
            }
        }
//
//        for (Map.Entry<Point, List<Point>> entry : listVoisinageDesPoints.entrySet()) {
//            System.out.println(entry);
//        }

        int k = 0;

        for (Point centre : ListCenter) {
            if (centre.getIdClus() == 0) {
                k++;
                centre.setIdClus(k);
                connected(centre, k);
            }
        }

        for (Point p : allPoints) {
            if (!ListCenter.contains(p) && !ListNoise.contains(p)) {
                ListBorder.add(p);
            }
        }

        int clusNum = 0;
        for (int i = 0; i < allPoints.size(); i++) {
            if (i < allPoints.size() - 1 && (allPoints.get(i).getIdClus() < allPoints.get(i + 1).getIdClus())) {
                clusNum = allPoints.get(i + 1).getIdClus();
//                System.out.println(clusNum);
            }
        }
        for (int i = 0; i < clusNum; i++) {
            System.out.print("Cluster " + (i + 1) + " ");
            for (Point p : allPoints) {
                if (p.getIdClus() == i + 1) {
                    System.out.print(p.toString());
                }
            }
            System.out.println("");
        }
        if (ListBorder.size() != 0) {
            System.out.print("Borders : ");
            for (Point p : ListBorder) {
                System.out.print(p.toString());
            }
        } else {
            System.out.println("No Borders");
        }

        System.out.println("");

        if (ListNoise.size() != 0) {
            System.out.print("Noises : ");

            for (Point p : ListNoise) {
                System.out.print(p.toString());
            }
        } else {
            System.out.println("No Noises");
        }
        System.out.println("");
    }

}
