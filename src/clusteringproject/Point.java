/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clusteringproject;

/**
 *
 * @author Salj
 */
public class Point {

    private int x, y;
    private int idClus;
    private boolean check = true;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getIdClus() {
        return idClus;
    }

    public void setIdClus(int idClus) {
        this.idClus = idClus;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

}
