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
public abstract class Shape {
    double area;
    public Shape()
    {
        System.out.println("I'm a random shape!");
    }
    public double getArea()
    {
        return area;
    }
    public abstract void onAreaChange();
}
interface ShapeInterface
{
    public void printShape();
    public double getArea();

    public void onAreaChange();
    public void onAreaChange(int sWidth, int sHeight);
}