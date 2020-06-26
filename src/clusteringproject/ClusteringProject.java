/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clusteringproject;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salj
 */
public class ClusteringProject {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        List<Point> allPoints = new ArrayList();

        //String data = "3,5;0,2;1,4;4,9;3,0;4,7;3,2;1,3;4,6;3,1;1,5;5,0;3,6;5,4;3,9;1,7;0,4;4,6;3,4;0,3;3,4;1,5;4,4;2,9;4,9;3,1;1,5;0,1;5,4;3,7;1,5;4,8;3,4;1,6;4,8;3,0;0,1;4,3;3,0;1,1;0,1;5,8;4,0;1,2;5,7;4,4;1,5;0,4;5,4;3,9;1,3;0,4;3,5;0,3;5,7;3,8;1,7;0,3;3,8;1,5;0,3;5,4;3,4;1,7;3,7;1,5;0,4;4,6;3,6;1,0;3,3;1,7;0,5;4,8;3,4;1,9;3,0;1,6;3,4;1,6;0,4;5,2;3,5;1,5;5,2;3,4;4,7;3,2;1,6;4,8;3,1;1,6;5,4;3,4;1,5;0,4;5,2;4,1;1,5;0,1;5,5;4,2;4,9;3,1;1,5;0,1;3,2;1,2;5,5;3,5;1,3;4,9;3,1;1,5;0,1;4,4;3,0;1,3;3,4;1,5;3,5;1,3;0,3;4,5;2,3;1,3;0,3;4,4;3,2;1,3;3,5;1,6;0,6;3,8;1,9;0,4;4,8;3,0;0,3;3,8;1,6;4,6;3,2;5,3;3,7;1,5;3,3;7,0;3,2;4,7;6,4;3,2;4,5;1,5;6,9;3,1;4,9;1,5;5,5;2,3;4,0;1,3;6,5;2,8;4,6;1,5;5,7;2,8;4,5;1,3;6,3;3,3;4,7;1,6;4,9;2,4;3,3;1,0;6,6;2,9;4,6;1,3;5,2;2,7;3,9;2,0;3,5;1,0;5,9;3,0;4,2;1,5;6,0;2,2;4,0;1,0;6,1;2,9;4,7;5,6;2,9;3,6;1,3;6,7;3,1;4,4;5,6;3,0;4,5;1,5;5,8;2,7;4,1;1,0;6,2;2,2;4,5;1,5;5,6;2,5;3,9;1,1;5,9;3,2;4,8;1,8;6,1;2,8;4,0;1,3;6,3;2,5;4,9;1,5;6,1;2,8;4,7;1,2;6,4;2,9;4,3;1,3;6,6;3,0;4,4;6,8;2,8;4,8;6,7;3,0;1,7;6,0;2,9;4,5;1,5;5,7;2,6;3,5;1,0;5,5;2,4;3,8;1,1;5,5;2,4;3,7;1,0;5,8;2,7;3,9;1,2;6,0;2,7;1,6;5,4;3,0;4,5;1,5;6,0;3,4;4,5;1,6;6,7;3,1;4,7;1,5;6,3;2,3;4,4;1,3;5,6;3,0;4,1;1,3;5,5;2,5;4,0;1,3;5,5;2,6;4,4;1,2;6,1;3,0;4,6;5,8;2,6;4,0;1,2;2,3;3,3;1,0;5,6;2,7;4,2;1,3;5,7;3,0;4,2;1,2;5,7;2,9;4,2;1,3;6,2;2,9;4,3;1,3;2,5;3,0;1,1;5,7;2,8;4,1;1,3;6,3;3,3;6,0;2,5;5,8;2,7;1,9;7,1;3,0;5,9;2,1;6,3;2,9;5,6;1,8;6,5;3,0;5,8;2,2;7,6;3,0;6,6;2,1;4,9;2,5;4,5;1,7;7,3;2,9;6,3;1,8;6,7;2,5;5,8;1,8;7,2;3,6;6,1;2,5;6,5;3,2;2,0;6,4;2,7;5,3;1,9;6,8;3,0;5,5;2,1;5,7;2,5;2,0;5,8;2,8;2,4;6,4;3,2;5,3;2,3;6,5;3,0;5,5;1,8;7,7;3,8;6,7;2,2;7,7;2,6;6,9;2,3;6,0;2,2;1,5;6,9;3,2;5,7;2,3;5,6;2,8;4,9;2,0;7,7;2,8;6,7;2,0;6,3;2,7;4,9;1,8;6,7;3,3;5,7;2,1;7,2;3,2;6,0;1,8;6,2;2,8;4,8;1,8;6,1;3,0;4,9;1,8;6,4;2,8;5,6;2,1;7,2;3,0;5,8;1,6;7,4;2,8;6,1;1,9;7,9;3,8;6,4;2,0;6,4;2,8;5,6;2,2;6,3;2,8;1,5;6,1;2,6;5,6;7,7;3,0;6,1;2,3;6,3;3,4;5,6;2,4;6,4;3,1;5,5;1,8;6,0;3,0;4,8;1,8;6,9;3,1;5,4;2,1;6,7;3,1;5,6;2,4;6,9;3,1;2,3;5,8;2,7;1,9;6,8;3,2;5,9;2,3;6,7;3,3;5,7;2,5;6,7;3,0;5,2;2,3;6,3;2,5;1,9;6,5;3,0;5,2;2,0;6,2;3,4;5,4;2,3;5,9;3,0;1,8";
        String data = "3,5;1,4;0,2;4,9;3,0;4,7;3,2;1,3;4,6;3,1;1,5;3,6;5,4;3,9;1,7;";
        String[] points = data.split(";");
        for (int i = 0; i < points.length; i++) {
            String[] xy = points[i].split(",");

            //     allPoints.add(new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])));
        }

        allPoints.add(new Point(5, 8));
        //      allPoints.add(new Point(7, 7));
        allPoints.add(new Point(10, 8));
        allPoints.add(new Point(11, 8));
        allPoints.add(new Point(12, 8));
        allPoints.add(new Point(6, 7));
//        allPoints.add(new Point(10, 7));
//        allPoints.add(new Point(12, 7));
//        allPoints.add(new Point(13, 7));
//        allPoints.add(new Point(5, 6));
//        allPoints.add(new Point(10, 6));
//        allPoints.add(new Point(13, 6));
//        allPoints.add(new Point(6, 5));
//        allPoints.add(new Point(9, 4));
//        allPoints.add(new Point(11, 5));
//        allPoints.add(new Point(14, 6));
//        allPoints.add(new Point(15, 5));
//        allPoints.add(new Point(3, 4));
//        allPoints.add(new Point(2, 4));
//        allPoints.add(new Point(5, 4));
//        allPoints.add(new Point(6, 4));
//        allPoints.add(new Point(7, 4));
//        allPoints.add(new Point(15, 4));
//        allPoints.add(new Point(3, 3));
//        allPoints.add(new Point(7, 3));
//        allPoints.add(new Point(8, 2));
        double minEps = 1;
        int minPts = 1;
        List<Point> noise = new ArrayList();
        List<Point> center = new ArrayList();
        List<Point> border = new ArrayList();
        List<List<Point>> cluster = new ArrayList();
        List<List<Point>> clusterr = new ArrayList();

        for (Point p : allPoints) {
            List<Point> Neps = new ArrayList();
            for (Point others : allPoints) {
                if (p.equals(others)) {
                } //ne pas ajouter lui meme
                else {
                    double dist = (Math.sqrt(Math.pow(p.x - others.x, 2) + Math.pow(p.y - others.y, 2)));
                    if ((dist <= minEps) && (dist != 0)) {
                        Neps.add(others);
                    }
                }

            }

            if (Neps.size() == 0) {
                noise.add(p);
            }

            if (Neps.size() >= minPts) {
                Neps.add(0, p);
                center.add(p);
                cluster.add(Neps);
            }
        }
        for (int i = 0; i < center.size(); i++) {

            for (int j = 0; j < cluster.get(i).size(); j++) {

                if (center.contains(cluster.get(i).get(j))) {
                    for (int k = 0; k < cluster.size(); k++) {
                        if ((cluster.get(k).get(0).x) == (cluster.get(i).get(j).x) && (cluster.get(k).get(0).y) == (cluster.get(i).get(j).y)) {
                            for (int l = 0; l < cluster.get(k).size(); l++) {//elements tb3 he l centre
                                int trouve = 0;
                                for (int m = 0; m < cluster.get(j).size(); m++) {//ta chouf iza mawjoude
                                    if ((cluster.get(j).get(m).x == cluster.get(k).get(l).x) && (cluster.get(j).get(m).y == cluster.get(k).get(l).y)) {
                                        trouve = 1;
                                    }
                                }
                                if (trouve == 0) {
                                    cluster.get(j).add(new Point(cluster.get(k).get(l).x, cluster.get(k).get(l).y));
                                    System.out.println("from:" + cluster.get(j).get(0).x + "," + cluster.get(j).get(0).y + "a l'aide:" + cluster.get(k).get(0).x + "," + cluster.get(k).get(0).y + ":" + cluster.get(k).get(l).x + "," + cluster.get(k).get(l).y);

                                }
                            }

                        }
                    }
                    //         for (int z = 0; z < cluster.get(j).size() - 1; z++) {
//System.out.println(j+","+z); 
                    //     if (!(cluster.get(i).contains(cluster.get(j).get(z)))) {
                    //        cluster.get(i).add(new Point(cluster.get(j).get(z).x,cluster.get(j).get(z).x));
                    //        }
                    //      }
                }

            }

        }
        for (Point p : allPoints) {
            if (!center.contains(p) && !noise.contains(p)) {
                border.add(p);
            }
        }
        if (center.size() == 0) {
            System.out.println(ANSI_RED + "no clusters" + ANSI_RESET);
        }
        for (int i = 0; i < cluster.size(); i++) {
            System.out.print(ANSI_RED + "cluster" + i + ":" + ANSI_RESET);
            //le centre
            System.out.print("{" + ANSI_BLUE + "[" + center.get(i).x + "," + center.get(i).y + "];" + ANSI_RESET);            //les autres points  
            for (int j = 1; j < cluster.get(i).size() - 1; j++) {
                System.out.print("[" + cluster.get(i).get(j).x + "," + cluster.get(i).get(j).y + "];");
            }
            //dernier point
            if (cluster.size() != 0) {
                System.out.print("[" + cluster.get(i).get(cluster.get(i).size() - 1).x + "," + cluster.get(i).get(cluster.get(i).size() - 1).y + "]}");
                System.out.println("");
            }
        }

        //noise
        System.out.println("");
        if (noise.size() == 0) {
            System.out.println(ANSI_RED + "no noises" + ANSI_RESET);
        } else {
            System.out.print(ANSI_RED + "noise:" + ANSI_RESET + "{");
        }

        for (int i = 0; i < noise.size() - 1; i++) {
            System.out.print("[" + noise.get(i).x + "," + noise.get(i).y + "];");
        }
        if (noise.size() != 0) {
            System.out.print("[" + noise.get(noise.size() - 1).x + "," + noise.get(noise.size() - 1).y + "]}");
            System.out.println("");
        }
        //border
        System.out.println("");

        if (border.size() == 0) {
            System.out.println(ANSI_RED + "no borders" + ANSI_RESET);
        } else {
            System.out.print(ANSI_RED + "border:" + ANSI_RESET + "{");
        }

        for (int i = 0; i < border.size() - 1; i++) {
            System.out.print("[" + border.get(i).x + "," + border.get(i).y + "];");
        }
        if (border.size() != 0) {
            System.out.print("[" + border.get(border.size() - 1).x + "," + border.get(border.size() - 1).y + "]}");
            System.out.println("");
        }
    }

}
