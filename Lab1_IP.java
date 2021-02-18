/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_ip;

/**
 *
 * @author crist
 */
public class Lab1_IP {
    public static void main(String[] args)
    {
        Triangle tri = new Triangle();
        ShapeInterface rec = new Rectangle();
        Circle circ = new Circle("Circle");
        circ.setRadius(10);
        circ.onAreaChange();
        rec.onAreaChange();
        rec.onAreaChange(13, 2);
        rec.printShape();
        rec.getArea();
        tri.setBase(9);
        tri.setHeight(5);
        tri.onAreaChange();
    }
}
