/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Diego
 */
public class Obstaculo {
    private double x;
    private double y;
    private boolean destructible;

    public Obstaculo(double x, double y, boolean destructible) {
        this.x = x;
        this.y = y;
        this.destructible = destructible;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isDestructible() {
        return destructible;
    }

    public void setDestructible(boolean destructible) {
        this.destructible = destructible;
    }
    
    public void insertarObstaculo(double x, double y){
        
    }
}
